<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>servlet async support</title>
</head>
<body>
	<script type="text/javascript" src="assets/js/jquery.js"></script>
	<script type="text/javascript">
		deferred();
		function deferred() {
			$.get('defer', function(data) {
				console.log(data);
				deferred();
			});
		}
	</script>
</body>
</html>