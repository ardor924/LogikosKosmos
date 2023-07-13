<!-- encoding -->
<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<!-- taglib -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>	<!-- 날짜 포맷 -->
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> <!-- 특수문자 인코딩  -->
<!-- contextPath -->
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!-- html -->
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Logikos Kosmos</title>

    <!-- JQuery -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

    <!-- Axios -->
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>   

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

    <!-- Icon -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"/>
    <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/xeicon@2.3.3/xeicon.min.css">

    <!-- Common CSS -->
    <link rel="stylesheet" type="text/css" href="${ctx}/resources/css/template/global/font.css"> 
    <link rel="stylesheet" type="text/css" href="${ctx}/resources/css/template/global/button.css"> 
    <link rel="stylesheet" type="text/css" href="${ctx}/resources/css/template/global/global.css"> 
	
	<!-- Common JS -->
	<script type="text/javascript">var ctx = "<%= request.getContextPath() %>";</script>
	<script src="${ctx}/resources/js/abcdefg.js"></script>

</head>