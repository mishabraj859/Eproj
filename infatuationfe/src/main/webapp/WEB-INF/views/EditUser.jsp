<%@include file="header.jsp"%>
		<br><br>
		<div id="page-wrapper">
		<div class="row">
		<div class="col-xs-1">
		</div>
		<div id="move" class="col-xs-10">
		
		
		
		<center><div><h1><font color="#1e1d5a" size="6">
		&nbsp;<i class="fa fa-shopping-basket" aria-hidden="true"></i> USERS </font></h1></div></center>	
				
<div class="table-responsive">
				<table class="table product-table">
					<!--Table head-->
					<thead>
							<tr>
								<th><img src="${pics}\ash.jpg" style="width: 140px"
									class="img-fluid"></th>
								<th>USER ID</th>
								<th>User Name</th>
								<th>ROLE</th>
								<th>ADDRESS</th>
								<th>CONTACT NO.</th>
								<th>EMAIL ID</th>
								<th>PASSWORD</th>
								<th>Edit/Remove</th>
								
							
							</tr>
						</thead>

					<tbody>
						<c:forEach items="${listu}" var="p6">
							<tr>
								<td></td>
								<td>${p6.getUid()}</td>
								<td>${p6.getUname()}</td>
								<td>${p6.getRole()}</td>
								<td>${p6.getUaddress()}</td>
								<td>${p6.getUcno()}</td>
								<td>${p6.getUmail()}</td>
								<td>${p6.getUpwd()}</td>
								
								
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
		
		
		
		
		
		
		
		
		</div>	
		</div>
		</div>
		
		<br><br><br><br><br><br>
<%@include file="foter.jsp"%>
	<!-- /#page-wrapper -->
    </div>
	 </div>  
<!-- Modal -->
 <%@include file="model.jsp"%>
</body>

</html>