<%@include file="header.jsp"%>
<div id="page-wrapper">
	<div class="row">
		<div class="col-xs-1"></div>
		<div id="move" class="col-xs-10">
			<div class="container">
				<div>
					<h1>
						<font color="#1e1d5a" size="6"> <img
							src="${pics}\ash.jpg" style="width: 140px"> &nbsp; <i
							class="fa fa-user-plus" aria-hidden="true"></i> REGISTER
						</font>
					</h1>
				</div>

				<c:url value='/adduser' var="add" />
				<form:form action="${add}" method="post" commandName="user">
				<div class="form-group">
						<label for="u_id">User ID:</label>
						<form:input type="text" class="form-control" path="uid" id="u_id"
							placeholder="Enter ID" />
					</div>
					<div class="form-group">
						<label for="name">Name:</label>
						<form:input type="text" class="form-control" path="uname"
							id="name" placeholder="Enter name" />
					</div>
					<div class="form-group">
						<label for="email">Email:</label>
						<form:input type="email" class="form-control" path="umail"
							id="email" placeholder="Enter email" />
					</div>
					<div class="form-group">
						<label for="pwd">Password:</label>
						<form:input type="password" class="form-control" path="upwd"
							id="pwd" placeholder="Enter password" />
					</div>
					<div class="form-group">
						<label for="address">ADDRESS:</label>
						<form:input type="text" class="form-control" path="uaddress"
							id="address" placeholder="Enter address" />
					</div>
					<div class="form-group">
						<label for="phoneno"> PHONE NUMBER:</label>
						<form:input type="number" class="form-control" path="ucno"
							id="phoneno" placeholder="Enter phone no." />
					</div>
					<div class="col-sm-offset-1">
						<button type="submit" class="button">
							<span>Submit</span>
						</button>
					</div>
				</form:form>
				
				
				
<c:choose>
  <c:when test="${msg=='null'}">
        <br />
    </c:when>    
    <c:otherwise>
        <div class="alert alert-info">
  <strong>${msg}</strong>
</div>

        
        <br />
    </c:otherwise>
</c:choose>
				
<c:choose>
  <c:when test="${msg2=='null'}">
        <br />
    </c:when>    
    <c:otherwise>
        <div class="alert alert-danger">
  <strong>${msg2}</strong>
</div>

        
        <br />
    </c:otherwise>
</c:choose>
				
				
				
				
				
				
				
				
	
	<center><div><h1><font color="#1e1d5a" size="6">
		&nbsp;<i class="fa fa-user" aria-hidden="true"></i> USERS </font></h1></div></center>	
				
<div class="table-responsive">
				<table class="table product-table">
					<!--Table head-->
					<thead>
						<tr>
							<th><img src="${pics}\ash.jpg" style="width: 140px"
								class="img-fluid"></th>
							<th>User ID</th>
							<th>User Name</th>
								<th>User Mail ID</th>
								<th>User Contact</th>
							<th>User Password</th>
							<th>User Address</th>
							<th>Delete/Edit</th>
<!-- 							<th>Amount</th> -->
<!-- 							<th></th> -->
						</tr>
					</thead>

					<tbody>
						<c:forEach items="${listu}" var="u1">
							<tr>
								<td></td>
								<td>${u1.getUid()}</td>
								<td>${u1.getUname()}</td>
								<td>${u1.getUmail()}</td>
								<td>${u1.getUcno()}</td>
								<td>${u1.getUpwd()}</td>
								<td>${u1.getUaddress()}</td>
								
								<td>
									<button class="button" style="width: 35px"
										" data-toggle="tooltip" data-placement="top"
										title="Remove item">
										<i class="fa fa-trash-o" aria-hidden="true"></i>
									</button>
									<button class="button" style="width: 35px"
										" data-toggle="tooltip" data-placement="top"
										title="Remove item">
										<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
									</button> 
								</td>
							</tr>
						</c:forEach>
					</tbody>
					<!--/Table body-->
				</table>
			</div>
<br> <br>
				<br> <br>
			</div>
		</div>
	</div>

	<%@include file="foter.jsp"%>

	<!-- /#page-wrapper -->
</div>
</div>
<!-- Modal -->
<%@include file="model.jsp"%>
</body>

</html>
