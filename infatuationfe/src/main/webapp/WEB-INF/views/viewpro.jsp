<%@include file="header.jsp"%>
<div id="page-wrapper">
	<div class="row">
	<div class="col-xs-1"></div>
		<div id="move" class="col-xs-10">
			<div>
				<center>
					<h1>
						<font color="#1e1d5a" size="6"> <img src="${pics}\ash.jpg"
							style="width: 140px"> &nbsp;<i class="fa fa-search"
							aria-hidden="true"></i> Product view
						</font>
					</h1>
				</center>
			</div>
			<br>
			<br>
	<c:forEach items="${products}" var="pro">
			<div class="col-sm-4">


				<div class="card card-cascade narrower">
					<div class="view overlay hm-white-slight">
						<img src="${pics}/${pro.getPid()}.jpg" style="width:300px;height:300px"> <a>
							<div class="mask"></div>
						</a>
					</div>

					<div class="card-block text-center">
						<!--Category & Title-->

						<h5>Category</h5>
						<h4 class="card-title">
							<strong><a style="color: black;">Product name</a></strong>
							<h3>${pro.getPname()}</h3>
						</h4>
						<hr>
						<!--Description-->
						<p class="card-text">Temporibus autem quibusdam et aut
							officiis debitis aut rerum necessitatibus saepe eveniet ut et
							voluptates.</p>
						<hr>
						<!--Card footer-->
						<div class="card-footer">
							<span class="pull-left">&nbsp;&nbsp;&nbsp; <i
								class="fa fa-inr" aria-hidden="true"></i>${pro.getPcost()}
							</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<a href="<c:url value="/addToCart/${pro.getPid()}"/>"  class="btn btn-default">  

								<i class="fa fa-heart" style="color: black;"></i></a>
							</a>
							
							<!--<a class="" data-toggle="tooltip" data-placement="top" title="Add to Wishlist"><i class="fa fa-heart"></i></a> -->


							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<!--	<button class="btn btn-primary" data-toggle="modal" data-target=".bs-example-modal-lg">open modal</button> -->

							<a href="<c:url value='/viewall/${pro.getPid()}'/>" class="btn btn-default">
								<i class="fa fa-eye" style="color: black;"></i></a>
							<!-- <a class="" data-toggle="tooltip" data-placement="top" title="Quick Look"><i class="fa fa-eye"></i></a> -->


						</div>
						<br>
					</div>

				</div>
			</div>
</c:forEach>

			<!-- /card -->



		</div>
	</div>
	<br> <br> <br> <br> <br>
	<%@include file="foter.jsp"%>
	<!-- /#page-wrapper -->
</div>
</div>
<!-- Modal -->
<%@include file="model.jsp"%>
</body>

</html>