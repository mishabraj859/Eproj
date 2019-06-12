<%@include file="header.jsp"%>
		<div id="page-wrapper">
		<div class="row">
		<div class="col-xs-1">
		</div>
		<div id="move" class="col-xs-10">
		<br><br><br><br>
		<center><div><h1><font color="#1e1d5a" size="6">
		&nbsp;<i class="fa fa-opencart" aria-hidden="true"></i> YOUR ORDERS</font></h1></div></center>
		   <div class="table-responsive">
    <table class="table product-table">
        <!--Table head-->
        <thead>
            <tr>
                <th><img src="${pics}\ash.jpg" style="width:140px" class="img-fluid"></th>
                <th>Product</th>
                <th>Price</th>
                <th>QTY</th>
                <th>Amount</th>
                <th></th>
            </tr>
        </thead>

        <tbody>
		<!--First row-->
            <tr>
                <th scope="row">
                    <img src="${pics}\now.jpeg" style="width:100px" class="img-fluid">
                </th>
                <td>
                    <h5><strong>Campus Sutra Solid Men's </strong></h5>
                    <p class="text-muted">Round Neck T-Shirt</p>
                </td>
                <td><i class="fa fa-inr" aria-hidden="true"></i> 650</td>
                <td>1</td>
                <td><i class="fa fa-inr" aria-hidden="true"></i> 650</td>
                <td>
                    <button class="button" style="width:100px"" data-toggle="tooltip" data-placement="top" title="track item">Track Order
                    </button>
                </td>
            </tr>
            <!--/First row-->

        </tbody>
        <!--/Table body-->
    </table>
</div>
		</div></div><br><br><br><br><br><br><br><br><br><br>
<%@include file="foter.jsp"%>
	<!-- /#page-wrapper -->
    </div>
	 </div>  
<!-- Modal -->
  <%@include file="model.jsp"%>
</body>

</html>