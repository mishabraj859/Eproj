<%@include file="header.jsp"%>
<br>
<div id="page-wrapper">
	<div class="row">
		<div class="col-xs-1"></div>
		<div id="move" class="col-xs-10">
			<div>
				<center>
					<h3>
						<img src="${pics}\ash.jpg" style="width: 140px"> &nbsp; <font
							face="Maiandra GD" color="#1e1d5a" size="7"> iNFATUATiON</font>
					</h3>
				</center>
			</div>
			<br>
			<br>
			<div class="panel panel-default">
			<div class="row">
             <div class="col-xs-6">
             <h3><strong><center>BILLING ADDRESS</center></strong></h3>
            <br><br>
			<div class="form-group">
			<label for="inputPassword" class="col-sm-2 control-label">Email.:</label>
						<div class="col-sm-8">
							<form:input class="form-control" path="user.umail" id="disabledInput" type="text"
								placeholder="Disabled input here..." disabled="true" />
						</div><br><br>
						<label for="inputPassword" class="col-sm-2 control-label">Phone number.:</label>
						<div class="col-sm-8">
							<form:input class="form-control" path="user.ucno" id="disabledInput" type="text"
								placeholder="Disabled input here..." disabled="true" />
						</div><br><br><br>
					<label for="inputPassword" class="col-sm-2 control-label">House no.:</label>
						<div class="col-sm-8">
							<form:input class="form-control" path="user.Billing.house_NO" id="disabledInput" type="text"
								placeholder="Disabled input here..." disabled="true" />
						</div>
						<br>
						<br><br>
						<label for="inputPassword" class="col-sm-2 control-label">Locality Name:</label>
						<div class="col-sm-8">
							<form:input class="form-control" path="user.Billing.LocalityName" id="disabledInput" type="text"
								placeholder="Disabled input here..." disabled="true" />
						</div>
						<br><br><br>
						<label for="inputPassword" class="col-sm-2 control-label">City:</label>
						<div class="col-sm-8">
							<form:input class="form-control" path="user.Billing.city" id="disabledInput" type="text"
								placeholder="Disabled input here..." disabled="true" />
						</div>
						<br><br><br>
						<label for="inputPassword" class="col-sm-2 control-label">Pin Code:</label>
						<div class="col-sm-8">
							<form:input class="form-control" path="user.Billing.pin_CODE" id="disabledInput" type="text"
								placeholder="Disabled input here..." disabled="true"/>
						</div>
						<br><br><br>
						<label for="inputPassword" class="col-sm-2 control-label">Country:</label>
						<div class="col-sm-8">
							<form:input class="form-control" id="disabledInput" type="text"
								placeholder="Disabled input here..." path="user.Billing.countary" disabled="true"/>
						</div>
						<br>
						<br><br>
						
			</div>
            </div>	
             <div class="col-xs-6">
             <h3><strong><center>SHIPPING ADDRESS</center></strong></h3>
             <br><br>
             <c:url value="/orderConform" var="o"/>
             <form:form action="${o}"  method="post" commandName="shippingAdd">
			<div class="form-group">
					<label for="inputPassword" class="col-sm-2 control-label">House no.:</label>
						<div class="col-sm-8">
                        <form:input type="text" class="form-control" path="house_NO" id="ship add" placeholder="enter house no"/>
						</div>
						<br>
						<br><br>
						<label for="inputPassword" class="col-sm-2 control-label">Locality Name:</label>
						<div class="col-sm-8">
						<form:input type="text" class="form-control" path="localityName" id="ship add" placeholder="enter locality name"/>						</div>
						<br><br><br>
						<label for="inputPassword" class="col-sm-2 control-label">City:</label>
						<div class="col-sm-8">
					    <form:input type="text" class="form-control" path="city" id="ship add" placeholder="enter city name"/>
						</div>
						<br><br><br>
						<label for="inputPassword" class="col-sm-2 control-label">Pin Code:</label>
						<div class="col-sm-8">
						<form:input type="text" class="form-control" path="pin_CODE" id="ship add" placeholder="enter pin code"/>
						</div>
						<br><br><br>
						<label for="inputPassword" class="col-sm-2 control-label">Country:</label>
						<div class="col-sm-8">
						<form:input type="text" class="form-control" path="country" id="ship add" placeholder="entercountry name"/>
						</div>
						<br><br><br>
						<label for="inputPassword" class="col-sm-2 control-label">First Name</label>
						<div class="col-sm-8">
						<form:input type="text" class="form-control" path="first_NAME" id="ship add" placeholder="enter email"/>
						</div>
						<br><br><br>
						<label for="inputPassword" class="col-sm-2 control-label">Last Name</label>
						<div class="col-sm-8">
						<form:input type="text" class="form-control" path="last_NAME" id="ship add" placeholder="enter phone no."/>
						</div>
						<br><br><br>
						<a href="#" class="button">Go Back</a>
                            <input type="submit" class="button" value="confirm !">             
             </div>
             </form:form>
             </div>	<br>

			</div>

		</div>
	</div>
</div>
</div>
<br>
<br>
<br>
<br>
<%@include file="foter.jsp"%>
<!-- /#page-wrapper -->
</div>
</div>
<!-- Modal -->
<%@include file="model.jsp"%>
</body>

</html>