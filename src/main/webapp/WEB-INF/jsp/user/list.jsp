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
                                用户列表
                            </div>
                            <div class="card-body">
                                <div class="kk_mb-12">
                                    <button type="button" class="btn btn-outline-primary" onclick="addEditUser()">新建</button>
                                </div>
                                <table id="table_id_example" class="display">
                                    <thead>
                                    <tr>
                                        <th>id</th>
                                        <th>name</th>
                                        <th>password</th>
                                        <th>createTime</th>
                                        <th>deleteFlag</th>
                                    </tr>
                                    </thead>
                                </table>
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
    $('#table_id_example').DataTable({
        "ajax": "${ctx}/user/list",
        "columns": [
            {"data": "id"},
            {"data": "name"},
            {"data": "password"},
            {"data": "createTime"},
            {"data": "deleteFlag"}
        ]
    });
    
    function addEditUser(id) {
        location.href="${ctx}/user/goAddEdit";
    }
</script>
</body>
</html>
