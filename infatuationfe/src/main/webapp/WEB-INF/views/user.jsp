<%@include file="header.jsp"%>
<div id="page-wrapper">
	<div class="row">
		<div class="col-xs-1"></div>
		<div id="move" class="col-xs-10">
			<div class="container">
				<div>
					<h1>
						<font color="#1e1d5a" size="6"> <img
							src="${pics}\ash.jpg" style="width: 140px"> &nbsp; <i
							class="fa fa-user-plus" aria-hidden="true"></i> REGISTER
						</font>
					</h1>
				</div>

				<c:url value='/adduser' var="add" />
				<form:form action="${add}" method="post" commandName="user">
				<DIV CLASS="FORM-GROUP">
						<LABEL FOR="U_ID">USER ID:</LABEL>
						<FORM:INPUT TYPE="hide" CLASS="FORM-CONTROL" PATH="UID" ID="U_ID"
							PLACEHOLDER="ENTER ID" />
					</DIV>
					<div class="form-group">
						<label for="name">NAME:</label>
						<form:input type="text" class="form-control" path="uname"
							id="name" placeholder="Enter name" />
					</div>
					<div class="form-group">
						<label for="email">EMAIL:</label>
						<form:input type="email" class="form-control" path="umail"
							id="email" placeholder="Enter email" />
					</div>
					<div class="form-group">
						<label for="pwd">PASSWORD:</label>
						<form:input type="password" class="form-control" path="upwd"
							id="pwd" placeholder="Enter password" />
					</div>
					<div class="form-group">
						<label for="address">ADDRESS:</label>
						<form:input type="text" class="form-control" path="uaddress"
							id="address" placeholder="Enter address" />
					</div>
					<div class="form-group">
						<label for="phoneno"> PHONE NUMBER:</label>
						<form:input type="number" class="form-control" path="ucno"
							id="phoneno" placeholder="Enter phone no." />
					</div>
					<div class="form-group">
<!-- 						<label for="billid"> BILLING ID:</label> -->
						<form:input type="hidden" class="form-control" path="billing.billing_ID"
							id="billid" />
					</div>
					<div class="form-group">
						<label for="houseno"> HOUSE NO:</label>
						<form:input type="number" class="form-control" path="billing.house_NO"
							id="houseno" placeholder="Enter house no." />
					</div>
					<div class="form-group">
						<label for="country"> COUNTRY:</label>
						<form:input type="text" class="form-control" path="billing.countary"
							id="country" placeholder="Enter country " />
					</div>
					<div class="form-group">
						<label for="city"> CITY:</label>
						<form:input type="text" class="form-control" path="billing.city"
							id="city" placeholder="Enter city" />
					</div>
					<div class="form-group">
						<label for="pincode"> PINCODE:</label>
						<form:input type="number" class="form-control" path="billing.pin_CODE"
							id="pincode" placeholder="Enter pincode" />
					</div>
					
					<div class="col-sm-offset-1">
						<button type="submit" class="button">
							<span>Submit</span>
						</button>
					</div>
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
				
				
				
				
				
				
				
				
	
	
<br> <br>
				<br> <br>
			</div>
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
