<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Page Redirect</title>
</head>
<body>
<h2>Spring Page Redirection</h2>
<p>Click the below button to redirect</p>
<form:form method="GET" action="/SpringMvc/redirect">
<table>
	<tr>
	<td>
	<input type="submit" value="Redirect Page">
	</td>
	</tr>
</table>
</form:form>
</body>
</html>