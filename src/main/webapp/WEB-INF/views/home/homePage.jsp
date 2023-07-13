<!-- START================================================================================================ -->
<!-- Encoding -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- Template -->
<%@ include file="/WEB-INF/views/template/layout/htmlTop.jsp" %>
<!-- CSS -->
<link rel="stylesheet" type="text/css" href="${ctx}/resources/css/template/components/header.css"> 
<link rel="stylesheet" type="text/css" href="${ctx}/resources/css/template/components/snb.css"> 
<link rel="stylesheet" type="text/css" href="${ctx}/resources/css/home/homePage.css"> 
<link rel="stylesheet" type="text/css" href="${ctx}/resources/css/template/components/footer.css"> 
<!-- ================================================================================================ END-->



<!-- START================================================================================================ -->

<!-- Body : START -->
<body>
    <!-- Wrapper : START-->
    <div class="wrapper container"> 
    	<div class="row-default m-0">
    		
    		<!-- snb -->
			<%@ include file="/WEB-INF/views/template/components/snb.jsp" %>		
	
			<!-- contents -->
			<div class="contents">
				<%@ include file="/WEB-INF/views/template/components/header.jsp" %>					
				<%@ include file="/WEB-INF/views/home/homeCode.jsp" %>		
			</div>	
			<!-- footer -->		
			<%@ include file="/WEB-INF/views/template/components/footer.jsp" %>		
			
    	</div>        
    </div>
    <!-- ./ Wrapper : END-->
</body>
<!-- ./ Body : END -->

<!-- ================================================================================================ END-->