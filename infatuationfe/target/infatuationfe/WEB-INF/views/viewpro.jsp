<%@include file="header.jsp"%>
<div id="page-wrapper">
	<div class="row">
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
			<div class="col-sm-4">



				<div class="card card-cascade narrower">
					<div class="view overlay hm-white-slight">
						<img src="${pics}/wo.jpeg" style="width: 80px"> <a>
							<div class="mask"></div>
						</a>
					</div>

					<div class="card-block text-center">
						<!--Category & Title-->

						<h5>Category</h5>
						<h4 class="card-title">
							<strong><a style="color: black;">Product name</a></strong>
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
								class="fa fa-inr" aria-hidden="true"></i> 899
							</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<button type="submit" class="btn btn-default"
								data-dismiss="modal">

								<i class="fa fa-heart" style="color: black;"></i></a>
							</button>

							<!--<a class="" data-toggle="tooltip" data-placement="top" title="Add to Wishlist"><i class="fa fa-heart"></i></a> -->


							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<!--	<button class="btn btn-primary" data-toggle="modal" data-target=".bs-example-modal-lg">open modal</button> -->

							<button class="btn btn-default" data-toggle="modal"
								data-target=".bs-example-modal-lg">
								<i class="fa fa-eye" style="color: black;"></i></a>
							</button>
							<!-- <a class="" data-toggle="tooltip" data-placement="top" title="Quick Look"><i class="fa fa-eye"></i></a> -->




 <!-- Modal -->
       <div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-xl">
                <!--Content-->
                <div class="modal-content">
                    <!--Header-->
                    <div class="modal-header">
                        <h4 class="modal-title" id="myModalLabel">Quick look</h4>
                    </div>
                    <!--Body-->
                    <div class="modal-body">
                        <!--Grid-->
                        <div class="container-fluid">
                            <div class="row">
							
							
							
							
							
							
							
							
                                       <!--First column-->
                                <div class="col-md-6">
                                    <center><h2>Your Product</h2></center>
                                    <hr>
									<div>
                                       <center> <img src="${pics}\wo.jpeg" style=" width:150px"> </center>
                                     </div>
                                </div>
                                <!--/.First column-->
								
							
								
								
								<!--Second column-->
                                <div class="col-md-6">
                                    <!--Title-->
                                   <center> <h2>Product Details</h2></center>
                                    <hr>
									<h3 class="card-title"><font color="black"> 
					              	<a style="color:black;">Libas Printed Women's A-line Kurtha</a></font>
					                </h3>
                                    <!--Price-->
                                    <div class="price">
                                        <p><font color="BLACK" size="5"><span class="price-after"><i class="fa fa-inr" aria-hidden="true"></i> 899</span></font> 
										&nbsp;<span style='color:black;text-decoration:line-through'><i class="fa fa-inr" aria-hidden="true"></i> 1799</span></p>
                                    </div>
                                    <br>

                                    <hr>

                                    </center><h3>Short description:</h3></center>
                                    
                                    <font color="BLACK"size="4"><p>
									Temporibus autem quibusdam et aut officiis
						debitis aut rerum necessitatibus saepe eveniet ut et voluptates.</p></font>
                                    <br>
                                     <hr><br>
									 <center>&nbsp;&nbsp;LIKED IT!  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp; SHARE! &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									 &nbsp;BUY NOW!</center>
									 <center>
									<button type="submit" class="btn btn-default" data-dismiss="modal">
									 <a title="Add to likelist">
									<i class="fa fa-heart-o fa-3x" style="color:black;"></i></a>
									</button> 
                                     
									
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									 
									 <button type="submit" class="btn btn-default" data-dismiss="modal">
									<a title="Share">
									<i class="fa fa-share-alt fa-3x" style="color:black;"></i></a>
									</button> 
									
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									 
									 <button type="submit" class="btn btn-default" data-dismiss="modal">
									<a title="Buy Now">
									<i class="fa fa-certificate fa-3x" style="color:black;"></i></a>
									</button> 
									
									
									
									</center>


                                </div>
                                <!--/.Second column-->
								
								
								
								

								
                                
                            </div>
                        </div>
                        <!--/.Grid-->

                    </div>
                    <!--Footer-->
                    <div class="modal-footer">
                        <button type="submit" class="btn btn-default" data-dismiss="modal">Close</button>
                    </div>
                </div>
                <!--/.Content-->
            </div>
        </div>
        <!--/Modal-->





						</div>
						<br>
					</div>

				</div>
			</div>


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