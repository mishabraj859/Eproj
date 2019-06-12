<%@include file="header.jsp"%>
		
		<div id="page-wrapper">
		<div class="row">
		<div class="col-xs-1">
		</div>
		<div id="move" class="col-xs-10">
		<div><h1><font color="#1e1d5a" size="6"><center>
		<img src="${pics}\ash.jpg" style="width:140px"> &nbsp;THANK YOU</center></font></h1></div>
		<center><h1>YOUR ORDER IS DONE!</h1><br> <h3>your order Id is:- ${orderId}</h3>
		<h2>Your Order will be Delivered in 7 buisness days</h2>
		</center>
		
		<br><hr>
		
				<table class="table product-table">
        <!--Table head-->
        <thead>
            <tr>
            <th></th>
                <th>Product</th>
                <th>Description</th>
                <th>Price</th>
                <th></th>
            </tr>
        </thead>

        <tbody>
		<!--First row-->
            <tr>
                <td>
                    <img src="${pics}\now.jpeg" style="width:100px" class="img-fluid">
                </td>
                <td>
                    <h5><strong>name</strong></h5>
                </td>
                <td>descriptn</td>
                <td><i class="fa fa-inr" aria-hidden="true"></i> 650</td>
        </tbody>
        <!--/Table body-->
        <tr>
        <td></td>
        <td></td>
        <td><strong>Total</strong></td>
        <td><i class="fa fa-inr" aria-hidden="true"></i> ${orderprice}</td>
        </tr>
    </table>
		</div>
		</div>
	
<br><br><br><br>
<%@include file="foter.jsp"%>
	<!-- /#page-wrapper -->
    </div>
	 </div>  
<!-- Modal -->
 <%@include file="model.jsp"%>
</body>

</html>


