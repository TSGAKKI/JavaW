<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SSE Demo</title>
</head>
<body>
	<div id="msgFrompPush"></div>
	<script type="text/javascript" src="<c:url value="assets/js/jquery.js" />"></script>
	<script type="text/javascript">
		if (!!window.EventSource) {
			var source = new EventSource('push');
			s = '';
			source.addEventListener('message', function(e) {
				s += e.data + "<br/>";
				$("#msgFrompPush").html(s);
			},false)
			source.addEventListener('open', function(e) {
				console.log("连接打开");
			}, false)

			source.addEventListener('error', function(e) {
				if (e.readyState == EventSource.CLOSE) {
					console.log("连接关闭");
				} else {
					console.log("e.readyState");
				}
			}, false);
		} else {
			console.log("unsupport you web brower");
		}
	</script>
</body>
</html>