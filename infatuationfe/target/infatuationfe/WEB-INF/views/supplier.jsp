<%@include file="header.jsp"%>
		<div id="page-wrapper">
		<div class="row">
		<div class="col-xs-1">
		</div>
		<div id="move" class="col-xs-10">
      <div class="container">
  <div><h1><font color="#1e1d5a" size="6">
		<img src="${pics}\ash.jpg" style="width:140px"> &nbsp;
	<i class="fa fa-truck" aria-hidden="true"></i> SUPPLIER DETAILS</font></h1></div>
	
  <c:url value='/addsup' var="add" />
				<form:form action="${add}" method="post" commandName="supplier">
    <div class="form-group">
      <label for="s_id">Supplier ID:</label>
      <form:input type="text" class="form-control" path="sid" id="s_id" placeholder="Enter s_id"/>
    </div>
    <div class="form-group">
      <label for="s_name">Supplier Name:</label>
      <form:input type="text" class="form-control" path="sname" id="s_name" placeholder="Enter s_name"/>
    </div>
	<div class="form-group">
      <label for="s_address">Address:</label>
      <form:input type="text" class="form-control" path="saddress" id="s_address" placeholder="Enter s_address"/>
    </div>
    <div class="form-group">
      <label for="s_cno">Contact no. :</label>
      <form:input type="number" class="form-control" path="scno" id="s_cno" placeholder="Enter s_cno"/>
    </div>
    <div class="form-group">
      <label for="s_mail">E-mail:</label>
      <form:input type="email" class="form-control" path="smail" id="s_mail" placeholder="Enter s_mail"/>
    </div>
<div class="col-sm-offset-1">
<button type="submit" class="button"><span>Submit</span></button>	</div>
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



<br><br>
<center><div><h1><font color="#1e1d5a" size="6">
		&nbsp;<i class="fa fa-truck" aria-hidden="true"></i>SUPPLIERS </font></h1></div></center>	
				
<div class="table-responsive">
				<table class="table product-table">
					<!--Table head-->
					<thead>
							<tr>
								<th><img src="${pics}\ash.jpg" style="width: 140px"
									class="img-fluid"></th>
								<th>Supplier ID</th>
								<th>Supplier Name</th>
								<th>Supplier Mail ID</th>
								<th>Supplier Contact</th>
								<th>Supplier Address</th>
								<th>Delete/Edit</th>
							</tr>
						</thead>

					<tbody>
						
						<c:forEach items="${lists}" var="s1">
							<tr>
								<td></td>
								<td>${s1.getSid()}</td>
								<td>${s1.getSname()}</td>
								<td>${s1.getSmail()}</td>
								<td>${s1.getScno()}</td>
								<td>${s1.getSaddress()}</td>
								
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
			<br><br><br>
	</div>
	
	</div></div>
<%@include file="foter.jsp"%>

	<!-- /#page-wrapper -->
    </div>
	 </div>  
<!-- Modal -->
 <%@include file="model.jsp"%>
</body>

</html>