<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
	<head>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.3.js"></script>
		<!-- <script type="text/javascript">
			$(document).ready(function(){
				$("#upload").click(function(){
					$.ajax({
						url:"/ssm/file/toUploadFileJsp",
						type:"get",
						success:function(data){
						}
					});
				});
			});
		</script> -->
	</head>
	<body>
		<input id="upload" type="button" value="跳转到文件下载页面" onclick="window.location.href='${pageContext.request.contextPath}/jsp/uploadFile.jsp'"/>
	</body>
</html>
