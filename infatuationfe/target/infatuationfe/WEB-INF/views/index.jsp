<%@include file="header.jsp"%>
		<div id="page-wrapper">
		<div class="row">
		<div class="col-xs-1">
		</div>
		<div id="move" class="col-xs-10">
		<br><br>
		
		<div><center><h1><font face="Maiandra GD" color="#1e1d5a" size="7">
		<img src="${pics}\ash.jpg" style="width:140px">&nbsp;&nbsp;iNFATUATiON</font></h1></center></div>
		<br>
		
		
		<div id="carousel" class="carousel slide carousel-fade" data-ride="carousel" style="width:1255px;height:516px">
    <ol class="carousel-indicators">
        <li data-target="#carousel" data-slide-to="0" class="active"></li>
        <li data-target="#carousel" data-slide-to="1"></li>
        <li data-target="#carousel" data-slide-to="2"></li>
    </ol>
    <!-- Carousel items -->
	
    <div class="carousel-inner carousel-zoom">
	<div class="item"><img class="img-responsive" src="${pics}\nghndghnd.jpg" style="width:100%">
          <div class="carousel-caption">
            <h2 style="color:black">OFFERS</h2>
            <p style="color:black">Hurry!!</p>
          </div>
        </div>
        <div class="active item"><img class="img-responsive" src="${pics}\hhdfbchdfc.jpg" style="width:100%">
          <div class="carousel-caption">
            <h2>OFFERS</h2>
            <p>End of Season</p>
          </div>
        </div>
        <div class="item"><img class="img-responsive" src="${pics}\shvhfdbhf.jpg" style="width:100%">
          <div class="carousel-caption">
            <h2 style="color:black">OFFERS</h2>
            <p style="color:black">Buy Now!!</p>
          </div>
        </div>
       </div>
    <!-- Carousel nav -->
    <a class="carousel-control left" href="#carousel" data-slide="prev"></a>
    <a class="carousel-control right" href="#carousel" data-slide="next"></a>
</div><br><br><br>

		
		   <div class="wrapper">
 <div class="row">
 <div class="col-xs-4">
 <div class="outherCircle">
 <img class="img-circle" src="${pics}\hhdec.jpeg" style="width:350px;height:350px"/>
 <div class="circleBorder">
 <div class="infoCircle">
 <br><br><br>
 <h2>Men'z Wear</h2>
 <br><br>
 <a href="<c:url value='/viewpro'/>">Buy Now</a>
 </div>
 </div>
 </div>
 </div>
 <div class="col-xs-4">
 <div class="outherCircle">
 <img class="img-circle" src="${pics}\fhfhf.jpg" style="width:350px;height:350px" />
 <div class="circleBorder">
  <div class="infoCircle">
  <br><br><br>
 <h2>Childern Wear</h2>
 <br><br>
 <a href="<c:url value='/viewpro'/>">Buy Now</a>
 </div>
 </div>
 </div>
 </div>
  <div class="col-xs-4">
 <div class="outherCircle">
 <img class="img-circle" src="${pics}\ama.jpg" style="width:350px;height:350px" />
 <div class="circleBorder">
  <div class="infoCircle">
  <br><br><br>
 <h2>Women'z Wear</h2>
 <br><br>
 <a href="<c:url value='/viewpro'/>">Limited offers!!</a>
 </div>
 </div>
 </div>
 </div>
 </div>
	</div>
	
	</div></div><br><br>
<%@include file="foter.jsp"%>
	<!-- /#page-wrapper -->
    </div>
	 </div>  
<!-- Modal -->
  <%@include file="model.jsp"%>
</body>

</html>