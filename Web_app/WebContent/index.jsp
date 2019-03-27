<%@include file="header.jsp"%>
<div class="container">
	<center>
		<h1>Welcome to Home page</h1>
	</center>
	<%@include file="menu.jsp"%>
	
	<br /> <br /> <br /> <br />
	<h1>
		<center>
			<%
				String MSG = (String) request.getAttribute("msg");
				if (MSG != null)
					out.println(MSG);
			%>
		</center>
	</h1>
</div>
<%@include file="footer.jsp"%>
