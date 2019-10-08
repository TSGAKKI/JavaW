<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix= "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>查询所有账户</h3>
	<c:forEach items="${list}" var="account">
		${account.name}
	</c:forEach>
	
<h3></h3>
<a>list</a>
</body>
</html>