<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<script>
    var ctx = "${ctx}";
</script>

<link rel="stylesheet" href="${ctx}/static/vendor/simple-line-icons/css/simple-line-icons.css">
<link rel="stylesheet" href="${ctx}/static/vendor/font-awesome/css/fontawesome-all.min.css">
<link rel="stylesheet" href="${ctx}/static/css/styles.css">
<link rel="stylesheet" href="${ctx}/static/vendor/datatables/css/jquery.dataTables.css">

<script src="${ctx}/static/vendor/jquery/jquery.min.js"></script>
<script src="${ctx}/static/vendor/popper.js/popper.min.js"></script>
<script src="${ctx}/static/vendor/bootstrap/js/bootstrap.min.js"></script>
<script src="${ctx}/static/vendor/chart.js/chart.min.js"></script>
<script src="${ctx}/static/vendor/datatables/js/jquery.dataTables.js"></script>
<script src="${ctx}/static/vendor/jq-validate/jquery.validate.js"></script>
<script src="${ctx}/static/vendor/jq-validate/additional-methods.js"></script>
<script src="${ctx}/static/vendor/jq-validate/jquery.metadata.js"></script>
<script src="${ctx}/static/js/carbon.js"></script>
<script src="${ctx}/static/js/demo.js"></script>