<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tag Lib Directive</title>
</head>
<body>
	<c:set var="dat" scope="session" value="25000" />
	<c:out value="Welcome to my World where value of a " />
	<br />
	<c:out value=" a = ${dat}" />

	<br />

	<c:catch var="expressionpakdayu">
		<%
			int a = 2 / 0;
		%>
	</c:catch>

	<c:if test="${expressionpakdayu != null}">
		<p>
			The erros is :
			<c:out value="${expressionpakdayu}"></c:out>
	</c:if>
	
	
</body>
</html>