<%@include file="header.jsp"%>
		<div id="page-wrapper">
		<div class="row">
		<div class="col-xs-1">
		</div>
		<div id="move" class="col-xs-10">
      <div class="container">
      
  <div><h1><font color="#1e1d5a" size="6">
		<img src="${pics}\ash.jpg" style="width:140px"> &nbsp;
		<i class="fa fa-shopping-basket" aria-hidden="true"></i> INCLUDE PRODUCT</font></h1></div>
		
  <c:url value='/addpro' var="add" />
				<form:form action="${add}" method="post" commandName="product">
    <div class="form-group">
      <label for="p_id">Product ID:</label>
      <form:input type="text" class="form-control" path="pid" id="p_id" placeholder="Enter p_id"/>
    </div>
    <div class="form-group">
      <label for="p_name">Product Name:</label>
      <form:input type="text" class="form-control" path="pname" id="p_name" placeholder="Enter p_name"/>
    </div>
	<div class="form-group">
      <label for="cost">Cost:</label>
      <form:input type="number" class="form-control" path="pcost" id="cost" placeholder="Enter cost"/>
    </div>
	<div class="form-group">
      <label for="desc">Description:</label>
      <form:input type="text" class="form-control" path="pdesc" id="desc" placeholder="Enter desc"/>
    </div>
    <div class="form-group">
      <label for="quant">Quantity:</label>
      <form:input type="number" class="form-control" path="pquan" id="quant" placeholder="Enter quant"/>
    </div>
	<div class="form-group">
      <label for="s_id">Supplier ID:</label>
      <form:input type="text" class="form-control" path="sid" id="s_id" placeholder="Enter s_id"/>
    </div>
	<div class="form-group">
      <label for="c_id">Category ID:</label>
      <form:input type="text" class="form-control" path="cid" id="c_id" placeholder="Enter c_id"/>
    </div>
	
<!-- 	<div class="form-group"> -->
<!--       <label for="img">Product image:</label> -->
<%--       <form:input type="text" class="form-control" id="img" placeholder="Enter img"> --%>
<!--     </div> -->
	
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
		&nbsp;<i class="fa fa-shopping-basket" aria-hidden="true"></i> PRODUCTS </font></h1></div></center>	
				
<div class="table-responsive">
				<table class="table product-table">
					<!--Table head-->
					<thead>
							<tr>
								<th><img src="${pics}\ash.jpg" style="width: 140px"
									class="img-fluid"></th>
								<th>Product ID</th>
								<th>Product Name</th>
								<th>Cost</th>
								<th>Description</th>
								<th>QTY</th>
								<th>Supplier ID</th>
								<th>Category ID</th>
								<th>Delete/Edit</th>
								<!-- 							<th>Amount</th> -->
								<!-- 							<th></th> -->
							</tr>
						</thead>

					<tbody>
						<c:forEach items="${listp}" var="p1">
							<tr>
								<td></td>
								<td>${p1.getPid()}</td>
								<td>${p1.getPname()}</td>
								<td>${p1.getPcost()}</td>
								<td>${p1.getPdesc()}</td>
								<td>${p1.getPquan()}</td>
								<td>${p1.getSid()}</td>
								<td>${p1.getCid()}</td>
								
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
			</div><br><br>
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