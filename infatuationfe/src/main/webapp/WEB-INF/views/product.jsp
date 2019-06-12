<head>
</head>
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
   <form:form action="${add}" method="post" commandName="product" enctype="multipart/form-data">
      <form:input type="hidden" class="form-control" path="pid" id="p_id" placeholder="Enter p_id"/>

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
      <label>Category</label>
	  <form:select class="form-control" path="category.cid" id="soflow-color">
		<option value="-1">Select Category</option>
		   <c:forEach items="${cat}" var="c1">
			 <option value="${c1.getCid()}">${c1.getCname()}</option>
		    </c:forEach>
			</form:select>
	</div>
					
<div class="form-group">
	<label>Supplier</label>
	<form:select class="form-control" path="supplier.sid" id="soflow-color">
	<option value="-1">Select Supplier</option>
	<c:forEach items="${Sup}" var="sup">
	<option value="${sup.getSid()}">${sup.getSname()}</option>
	</c:forEach>
	</form:select>				
</div>


 <div class="form-group">
 <label>Upload Product Picture</label>   
<form:input type="file" path="pimg" class="filestyle" data-icon="false"></form:input>						
	</div>
			
<!--  <div class="form-group">    -->
<%--     <form:input class="form-control" type="file" path="pimg" ></form:input> --%>
<!--  </div>     -->
    
    
<!-- <!--     <div class="form-group"> --> 
<!--     <label for="category">Category</label> -->
<%--     <form:select name="cattttt" class="required" path="${category.getCid()}"> --%>
<!--     <option value="null" label="Select cat"/> -->
<%--       <c:forEach var="ca" items="${categorise}"> --%>
<%--       <option value="${ca.getCid()}" label="${ca.getCname()}"/> --%>
<%--            </c:forEach></form:select> --%>
     
<!--       <label for="Suppliers">Supplier</label> -->
<%--       <form:select name="supp" class="required" path="${supplier.getSid()}"> --%>
<!--     <option value="null" label="Select sup"/> -->
<%--       <c:forEach var="s" items="${Suppliers}"> --%>
<%--       <option value="${s.getSid()}" label="${s.getSname()}"> --%>
<%--       </option></c:forEach></form:select> --%>
<!--       </div> -->
<!-- 	<div class="form-group"> -->
<!--       <label for="img">Product image:</label> -->
<%--       <form:input type="text" class="form-control" id="img" placeholder="Enter img"> --%>
<!--     </div> -->
	<br><br>
	
<div class="col-sm-offset-1">
<button type="submit" class="button" value="submit"><span>Submit</span></button></div>
</form:form>


<%-- <c:choose> --%>
<%--   <c:when test="${msg=='null'}"> --%>
<!--         <br /> -->
<%--     </c:when>     --%>
<%--     <c:otherwise> --%>
<!--         <div class="alert alert-info"> -->
<%--   <strong>${msg}</strong> --%>
<!-- </div> -->

        
<!--         <br /> -->
<%--     </c:otherwise> --%>
<%-- </c:choose> --%>
				
<%-- <c:choose> --%>
<%--   <c:when test="${msg2=='null'}"> --%>
<!--         <br /> -->
<%--     </c:when>     --%>
<%--     <c:otherwise> --%>
<!--         <div class="alert alert-danger"> -->
<%--   <strong>${msg2}</strong> --%>
<!-- </div> -->

        
<!--         <br /> -->
<%--     </c:otherwise> --%>
<%-- </c:choose> --%>

<br><br>




<center><div><h1><font color="#1e1d5a" size="6">
		&nbsp;<i class="fa fa-shopping-basket" aria-hidden="true"></i> PRODUCTS </font></h1></div></center>	
				
<div class="table-responsive">
				<table class="table product-table">
					<!--Table head-->
					<thead>
							<tr>
								<th><img src="${pics}\ash.jpg" style="width: 140px"
									class="img-fluid"></th><br>
								<th>Product Name</th>
								<th>Cost</th>
								<th>Description</th>
								<th>QTY</th>
								<th>Supplier Name</th>
								<th>Category Name</th>
								<th>Delete/Edit</th>
								<!-- 							<th>Amount</th> -->
								<!-- 							<th></th> -->
							</tr>
						</thead>

					<tbody>
						<c:forEach items="${pro}" var="p1">
							<tr>
								<td><image src="${pics}/${p1.getPid()}.jpg" style="width:150px;height:150px"></td>
								<td>${p1.getPname()}</td>
								<td>${p1.getPcost()}</td>
								<td>${p1.getPdesc()}</td>
								<td>${p1.getPquan()}</td>
								<td>${p1.getSupplier().getSname()}</td>
								<td>${p1.getCategory().getCname()}</td>
								
								<td>
								<br>
									<a href="<c:url value="/deleteproduct/${p1.getPid()}"/>" class="button" style="width: 35px"
										" data-toggle="tooltip" data-placement="top"
										title="Remove item">
										<i class="fa fa-trash-o" aria-hidden="true"></i>
									</a>
									<a href="<c:url value="/editproduct/${p1.getPid()}"/>" class="button" style="width: 35px"
										" data-toggle="tooltip" data-placement="top"
										title="Remove item">
										<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
									</a> 
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