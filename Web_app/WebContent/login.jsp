<%@include file="header.jsp"%>
	<center>
		<h1>Welcome to Login page</h1>
	</center>
		 <%@include file="menu.jsp" %>
	<div class="container">
		<form action="Authenticator" method="POST">
		<div class="card">
			<div class="card-header"> ADIT LOGIN </div>
			<div class="card-body">
					<table>
						<tr>
							<td>
							Login
							</td>
							<td>
							<input type="text" name="uname">
							</td>
						</tr>
						<tr>
							<td>
							Password
							</td>
							<td>
							<input type="password" name="pass">
							</td>
						</tr>
						<tr>
							<td>
							<center><br/><input type="Submit" class="btn btn-success" value="Submit" ></center>
							</td>
						</tr>
					</table>
				 </div>
			 </div>
		</form>
	</div>
<%@include file="footer.jsp"%>