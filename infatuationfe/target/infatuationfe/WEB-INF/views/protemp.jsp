<%@include file="header.jsp"%>
		<br><br><br><br>
		<div id="page-wrapper">
		<div class="row">
		<div class="col-xs-1">
		</div>
		<div id="move" class="col-xs-10">
		 <center><div><h1><font color="#1e1d5a" size="6">
		<img src="${pics}\ash.jpg" style="width:140px"> 
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		QUICK LooK</font></h1></div></center>
         <div>
         <br>
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
					              	<a style="color:black;">{{names.pname}}</a></font>
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
<!--                     <div class="modal-footer"> -->
<!--                         <button type="submit" class="btn btn-default" data-dismiss="modal">Close</button> -->
<!--                     </div> -->
         </div>
		</div></div>
		<br><br><br><br><br>
<%@include file="foter.jsp"%>

	<!-- /#page-wrapper -->
    </div>
	 </div>  
<!-- Modal -->
 <%@include file="model.jsp"%>	
</body>

</html>