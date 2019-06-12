<%@include file="header.jsp"%>
		<br><br>
		<div id="page-wrapper">
		<div class="row">
		<div class="col-xs-1">
		</div>
		<div id="move" class="col-xs-10">
		<div><center><h3><font face="Maiandra GD" color="#1e1d5a" size="7">
		iNFATUATiON</font></h3></center></div>
		<br><br>
<!-- 		<div><h1><font color="#1e1d5a" size="6"> -->
<%-- 		<img src="${pics}\ash.jpg" style="width:140px"> &nbsp;<i class="fa fa-info-circle" aria-hidden="true"></i> ABOUT</font></h1></div> --%>
		
		<!-- Nav tabs -->
<ul class="nav nav-tabs tabs-3 nav-justified" >
    <li class="nav-item">
        <a class="nav-link active" data-toggle="tab" href="#panel1" role="tab" style="color:black">
       <h3><i class="fa fa-map-marker" aria-hidden="true"></i> TELL US WHERE!?</h3></a>
    </li>
    <li class="nav-item">
        <a class="nav-link" data-toggle="tab" href="#panel2" role="tab" style="color:black">
        <h3><i class="fa fa-check-circle" aria-hidden="true"></i> CONFIRM US</h3></a>
    </li>
    <li class="nav-item">
        <a class="nav-link" data-toggle="tab" href="#panel3" role="tab" style="color:black">
       <h3><i class="fa fa-money" aria-hidden="true"></i>  PAY US</h3></a>
    </li>
</ul>
<!-- Tab panels -->
<div class="tab-content">
    <!--Panel 1-->
    <div class="tab-pane fade in show active" id="panel1"><br>
	 1
	 <hr>
	<a class=button >Continue <i class="fa fa-angle-double-right" aria-hidden="true"></i></a>	
    </div>
    <!--/.Panel 1-->
    <!--Panel 2-->
    <div class="tab-pane" id="panel2" >
	2
	<hr>
	<a class=button><i class="fa fa-angle-double-left" aria-hidden="true"></i> Previous</a>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a class=button >Pay <i class="fa fa-angle-double-right" aria-hidden="true"></i></a>	
    </div>	
    <!--/.Panel 2-->
    <!--Panel 3-->
    <div class="tab-pane" id="panel3" >
      3
      <hr>
	<a class=button><i class="fa fa-search" aria-hidden="true"></i> View Order</a>	
    </div>
   </div>
    <!--/.Panel 3-->
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