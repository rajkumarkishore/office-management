<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>OMS</title>
</head>
<body>
	<form name="authentication" action="/login" method="post">
		<table>
			<tr>
				<td>User Name</td>
				<td>:</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td>:</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="login" /></td>
			</tr>
		</table>
		<c:if test="${error == true }">
			<div>Login failed. Bad Credentials!</div>
		</c:if>
	</form>
</body>
</html>