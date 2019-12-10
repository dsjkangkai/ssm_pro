<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ include file="/WEB-INF/jsp/common/common.jsp" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Carbon - Admin Template</title>
    <link rel="stylesheet" href="${ctx}/static/css/kk.css">
</head>
<body class="sidebar-fixed header-fixed">
<div class="page-wrapper">

    <!-- 头部 -->
    <%@include file="/WEB-INF/jsp/common/head.jsp" %>

    <div class="main-container">

        <!-- 左侧菜单栏 -->
        <%@include file="/WEB-INF/jsp/common/left.jsp" %>

        <div class="content">
            <div class="container-fluid">
                <div class="row ">
                    <div class="col-md-12">
                        <div class="card">
                            <div class="card-header bg-light">
                                用户新增/编辑
                            </div>
                            <div class="card-body">
                                <form id="userAddEdit">
                                    <div class="row">
                                        <div class="col-md-8">
                                            <div class="form-group">
                                                <label class="form-control-label">Normal Input</label>
                                                <input name="name" class="form-control">
                                            </div>
                                        </div>

                                        <div class="col-md-8">
                                            <div class="form-group">
                                                <label class="form-control-label">Read Only</label>
                                                <input name="password" class="form-control" >
                                            </div>
                                        </div>

                                        <div class="col-md-8">
                                            <div class="form-group">
                                                <button type="button" class="btn btn-outline-primary"
                                                        onclick="cancel()">取消
                                                </button>
                                                <button type="button" class="btn btn-outline-primary"
                                                        onclick="doAddEditUser()">新建
                                                </button>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                    More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect
                    from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
                </div>
            </div>
        </div>
    </div>
</div>

<script>
    function doAddEditUser() {
        var formId = "#userAddEdit";
        var validRes = $(formId).validate({
            rules: {
                name :{
                    required : true,
                    kkphone: true
                },
                password: {
                    required : true,
                    se2be: [5,10]
                }
            },
            messages:{
                password: {
                    se2be: $.validator.format("这是自定义的提示，须在{0}到{1}之间")
                }
            }
        }).form();
        if (validRes) {
            $.ajax({
                url: '${ctx}/user/addEdit',
                data: $(formId).serialize(),                 //将表单数据序列化，格式为name=value
                type: 'POST',
                dataType: 'json',
                success: function (data) {
                    alert("成功")
                }
            });
        }
    }

    function cancel() {
        location.href = "${ctx}/user/golist";
    }
</script>
</body>
</html>
