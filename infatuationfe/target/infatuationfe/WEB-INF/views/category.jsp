<%@include file="header.jsp"%>
<br>
<br>

<div id="page-wrapper">
	<div class="row">
		<div class="col-xs-1"></div>
		<div id="move" class="col-xs-10">
			<div class="container">
				<div>
					<h1>
						<font color="#1e1d5a" size="6"> <img
							src="${pics}\ash.jpg" style="width: 140px"> &nbsp;<i
							class="fa fa-th-large" aria-hidden="true"></i> SPECIFY CATEGORY
						</font>
					</h1>
				</div>
				<br>
				<c:url value='/addcat' var="add" />
				<form:form action="${add}" method="post" commandName="category">
					<div class="form-group">
						<label for="c_id">Category ID:</label>
						<form:input type="text" class="form-control" path="cid" id="c_id"
							placeholder="Enter c_id" />
					</div>
					<div class="form-group">
						<label for="c_name">Category Name:</label>
						<form:input type="text" class="form-control" path="cname"
							id="c_name" placeholder="Enter c_name" />
					</div>
					<div class="col-sm-offset-1">
						<button type="submit" class="button">
							<span>Submit</span>
						</button>
					</div>
				</form:form>
				 <br> <br> <br>
				<br> <br>
			</div>


			<c:choose>
				<c:when test="${msg=='null'}">
					<br />
				</c:when>
				<c:otherwise>
					<div class="alert alert-success">
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




			<!-- 	the table begining -->
			<center>
				<div>
					<h1>
						<font color="#1e1d5a" size="6"> &nbsp;<i
							class="fa fa-th-large" aria-hidden="true"></i> CATEGORIES
						</font>
					</h1>
				</div>
			</center>
			<br>
			<div class="table-responsive">
				<table class="table product-table">
					<!--Table head-->
					<thead>
						<tr>
							<th><img src="${pics}\ash.jpg" style="width: 140px"
								class="img-fluid"></th>
							<th>Category ID</th>
							<th>Category Name</th>
							<th>Delete/Edit</th>
							<!-- 							<th>Amount</th> -->
							<!-- 							<th></th> -->
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${listc}" var="c1">
							<tr>
								<td></td>
								<td>${c1.getCid()}</td>
								<td>${c1.getCname()}</td>
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