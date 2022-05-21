<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	div{
		background:skyblue;
		width:300;
	}
	p{
		background:yellow;
		width:200;
		margin:20px;
	}
	span{
		color:red;
	}
</style>
</head>
<body>
<div>
	<c:if test="${param.color == 1}">
		<span style="color:red;">빨강</span>
	</c:if>
	<c:if test="${param.color == 2}">
		<span style="color:blue;">파랑</span>
	</c:if>
	<c:if test="${param.color == 3}">
		<span style="color:green;">초록</span>
	</c:if>
</div>
</body>
</html>