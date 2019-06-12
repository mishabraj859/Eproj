<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<! DOCTYPE HTML >
<HTML LANG="EN">

<HEAD>
<font face="Maiandra GD">
<title>Infatuation</title>


<spring:url value="/resources/css" var="css" />
<spring:url value="/resources/js" var="js" />
<spring:url value="/resources/pics" var="pics" />


<META CHARSET="UTF-8">
<META NAME="VIEWPORT" CONTENT="WIDTH = DEVICE -WIDTH,INITIAL SCALE= 1">
<link rel="stylesheet" href="${css}/bootstrap.min.css">
<script src="${js}/jquery.min.js"></script>
<script src="${js}/bootstrap.min.js"></script>

<script src="${js}/jquery2.min.js"></script>
<script src="${js}/bootstrap.min.js"></script>
<LINK REL="STYLESHEET" HREF="${css}/font-awesome.css" />
<LINK REL="STYLESHEET" HREF="${css}/cccc.css" />
<LINK REL="STYLESHEET" HREF="${css}/howw.css" />
<link href="${css}/sb-admin.css" rel="stylesheet" />
<link rel="icon" type="image/jpg" href="${pics}\ash.jpg" />


<style>
.navbar-default .navbar-nav>li.active>a {
	background: georgian;
	color: black;
}

a i:hover {
	color: black;
}

.img-circle {
	border-radius: 50%
}

#move {
	padding-left: 250px;
}

footer {
	padding-left: 225px;
}

.navbar-default .navbar-nav>li.active>a {
	background: gray;
	color: black;
}

.button {
	border-radius: 4px;
	background-color: gray;
	border: none;
	color: WHITE;
	text-align: center;
	font-size: 14PX;
	padding: 12px;
	width: 90px;
	transition: all 0.5s;
	cursor: pointer;
	margin: 3px;
}

.button span {
	cursor: pointer;
/* 	display: inline-block; */
	position: relative;
	transition: 0.5s;
}

.button span:after {
	content: '»'; 
	position: absolute;
	opacity: 0;
	top: 0;
	right: -20px;
	transition: 0.5s;
}

.button:hover span {
    url:<c:url value='/viewpro'/>;
	padding-right: 20px;
}

.button:hover span:after {
	opacity: 1;
	right: 0;
}

div.card {
    width: 320px;
    box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
    text-align: center;
}
div.view 
{

  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
  
}
@media (min-width: 800px)
.modal-lg
{
    width: 1500px;
    height: 1500px; 
}
@media (min-width: 700px) {
  .modal-xl {
    width: 80%;
   max-width:1200px;
   
  }
  @media (min-height: 600px) {
  .modal-xl {
    height: 60%;
   max-height:900px;
   
</style>
</HEAD>

<body>

	<div class="wrapper">

		<nav class="navbar navbar-default navbar-fixed-top">

			<!--     <div class="navbar-header"> -->
			<!--       <a class="navbar-brand" href="#"> -->
			<%-- 		<img src="${pics}\ash.jpg" style="width:20px">iNFATUATiON --%>
			<!-- 	  </a> -->
			<!--     </div> -->
		
				<div class="navbar-header">
					<a class="navbar-brand" href="#">
					 <span><img src="${pics}\ash.jpg" style="width:20px"></span>
						iNFATUATiON
					</a>
				</div>
			
			<ul class="nav navbar-nav">
				<li><a href="<c:url value='/'/>"><i
						class="fa fa-home" aria-hidden="true"></i> Home</a></li>
				<li><a href="<c:url value='/contact'/>"><i
						class="fa fa-phone" aria-hidden="true"></i> Contact Us</a></li>
				<li><a href="<c:url value='/about'/>"><i class="fa fa-info"
						aria-hidden="true"></i> About</a></li>
			</ul>
			<ul class="nav navbar-nav pull-right">
				<c:if test="${pageContext.request.userPrincipal.name==null}">
				<li><a href="#" data-toggle="modal" data-target="#myModal"><i
						class="fa fa-user" aria-hidden="true"></i> Sing In</a></li>
				<li><a href="<c:url value='/user'/>"><i
						class="fa fa-sign-in" aria-hidden="true"></i> Sign up</a></li>
				</c:if>
				<c:if test="${pageContext.request.userPrincipal.name!=null}">		
				<li><a href="<c:url value='/j_spring_security_logout'/>">
					  <i class="fa fa-sign-out" aria-hidden="true"></i>welcome${pageContext.request.userPrincipal.name} Sign out</a></li>
			   </c:if>
			</ul>

			<!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->

			<div class="collapse navbar-collapse navbar-ex1-collapse">
				<ul class="nav navbar-nav side-nav" style="background: #ECE7E7">
					<li ><a href="<c:url value='/product'/>"><i
							class="fa fa-shopping-cart" aria-hidden="true"></i> Add Product</a></li>
					<li><a href="<c:url value='/supplier'/>"><i
							class="fa fa-users" aria-hidden="true"></i> Include Supplier</a></li>
					<li><a href="<c:url value='/category'/>"><i
							class="fa fa-bars" aria-hidden="true"></i> Name Category</a></li>
					<li><a href="<c:url value='/like'/>"><i
							class="fa fa-heart" aria-hidden="true"></i> Like List</a></li>
					<li><a href="<c:url value='/order'/>"><i
							class="fa fa-truck" aria-hidden="true"></i> Your Orders</a></li>		
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</nav>