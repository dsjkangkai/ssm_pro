<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ include file="/WEB-INF/jsp/common/common.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>kk示例</title>
    <link href="${ctx}/static/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="${ctx}/static/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="${ctx}/static/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">
    <link href="${ctx}/static/css/sb-admin.css" rel="stylesheet">
</head>

<body class="fixed-nav sticky-footer bg-dark" id="page-top">
<!-- 头部和菜单 -->
<%@include file="/WEB-INF/jsp/common/head.jsp"%>

<div class="content-wrapper">
    <!-- body -->
    <div class="container-fluid">
        <!-- 页面头部 -->
        <ol class="breadcrumb">
            <li class="breadcrumb-item">
                <a href="#">Dashboard</a>
            </li>
            <li class="breadcrumb-item active">My Dashboard</li>
        </ol>

        <form class="form-horizontal">
            <div class="container">
                <div class="row" style="padding: 20px 0">
                    <h3>常用垂直表单布局</h3>
                </div>
                <div class="row form-group">
                    <label class="col-lg-1" for="name">名称</label>
                    <div class="col-lg-5 col-md-6">
                        <input class="form-control" name="name" id="name" type="text">
                    </div>
                </div>
                <div class="row form-group">
                    <label class="control-label col-lg-1">内容</label>
                    <div class="col-lg-5 col-md-6">
                        <textarea class="form-control" rows="5"></textarea>
                    </div>
                </div>
                <div class="row form-group">
                    <label class="control-label col-lg-1">补充</label>
                    <div class="col-lg-5 col-md-6">
                        <textarea class="form-control" rows="5"></textarea>
                    </div>
                </div>
            </div>
        </form>

    </div>
    <!-- 公用底部 -->
    <%@include file="/WEB-INF/jsp/common/footer.jsp"%>

</div>
<script src="${ctx}/static/vendor/jquery/jquery.min.js"></script>
<script src="${ctx}/static/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="${ctx}/static/vendor/jquery-easing/jquery.easing.min.js"></script>
<script src="${ctx}/static/vendor/datatables/jquery.dataTables.js"></script>
<script src="${ctx}/static/vendor/datatables/dataTables.bootstrap4.js"></script>
<script src="${ctx}/static/js/sb-admin.min.js"></script>
<script src="${ctx}/static/js/sb-admin-datatables.min.js"></script>
</body>
</html>
