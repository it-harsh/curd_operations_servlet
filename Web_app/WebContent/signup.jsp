<%@include file="header.jsp"%>
	<center>
		<h1>Welcome to Sign up page</h1>
	</center>
	<%@include file="menu.jsp" %> 
	<div class="container">
		<form action="Signup" method="POST">
		<div class="card">
			<div class="card-header"> ADIT Sign up </div>
			<div class="card-body">
					<table>
						<tr>
							<td>
							Enter Username :
							</td>
							<td>
							<input type="text" name="suname">
							</td>
						</tr>
						<tr>
							<td>
							Enter Password :
							</td>
							<td>
							<input type="password" name="spass">
							</td>
						</tr>
						<tr>
							<td>
							<center><br/><input type="Submit" class="btn btn-success" value="Create user" ></center>
							</td>
						</tr>
					</table>
				 </div>
			 </div>
		</form>
	</div>
<%@include file="footer.jsp"%>