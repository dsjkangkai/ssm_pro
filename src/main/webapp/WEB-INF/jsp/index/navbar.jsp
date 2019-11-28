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
        <h1>Navbar</h1>
        <hr>
        <p>The SB Admin navbar can be either fixed or static, and it supports the navbar-light and navbar-dark Bootstrap 4 classes.</p>
        <a class="btn btn-primary" href="#" id="toggleNavPosition">Toggle Fixed/Static Navbar</a>
        <a class="btn btn-primary" href="#" id="toggleNavColor">Toggle Navbar Color</a>
        <!-- Blank div to give the page height to preview the fixed vs. static navbar-->
        <div style="height: 1000px;"></div>
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
<script>
    $('#toggleNavPosition').click(function() {
        $('body').toggleClass('fixed-nav');
        $('nav').toggleClass('fixed-top static-top');
    });

    $('#toggleNavColor').click(function() {
        $('nav').toggleClass('navbar-dark navbar-light');
        $('nav').toggleClass('bg-dark bg-light');
        $('body').toggleClass('bg-dark bg-light');
    });

</script>
</body>
</html>
