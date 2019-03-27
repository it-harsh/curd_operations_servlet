<%@include file="header.jsp"%>
<center>
	<h1>Welcome to GetUser page</h1>
</center>
<%@include file="menu.jsp"%>
<div class="container">
	<form action="GetUser" method="POST">
		<div class="card">
			<div class="card-header">ADIT user detail</div>
			<div class="card-body">
				<table>
					<tr>
						<td>Enter Username :</td>
						<td><input type="text" name="uname"></td>
					</tr>
					<tr>
						<td>
							<center>
								<br />
								<input type="Submit" class="btn btn-success" value="Get User">
							</center>
						</td>
					</tr>
				</table>
			</div>
		</div>
	</form>
		<center>
			<%
				String MSG = (String) request.getAttribute("msg");
				if (MSG != null)
					out.println(MSG);
			%>
		</center>
</div>
<%@include file="footer.jsp"%>