<%@include file="header.jsp"%>
		<br><br><br><br>
		<div id="page-wrapper">
		<div class="row">
		<div class="col-xs-1">
		</div>
		<div id="move" class="col-xs-10">
		 <center><div><h1><font color="#1e1d5a" size="6">
		&nbsp;<i class="fa fa-gratipay" aria-hidden="true"></i> LIKE LIST</font></h1></div></center>
		   <div class="table-responsive">
    <table class="table product-table">
        <!--Table head-->
        <thead>
            <tr>
                <th><img src="${pics}\ash.jpg" style="width:140px" class="img-fluid"></th>
                <th>Product</th>
                <th>Color</th>
                <th>Size</th>
                <th>Price</th>
                <th>QTY</th>
                <th>Amount</th>
                <th></th>
            </tr>
        </thead>
        <!--/Table head-->

        <!--Table body-->
        <tbody>
		<!--First row-->
            <tr>
                <th scope="row">
                    <img src="${pics}\ffrffgh.jpg" style="width:200px" class="img-fluid">
                </th>
                <td>
                    <h5><strong>Girlz Wear</strong></h5>
                    <p class="text-muted">by FifeSteps</p>
                </td>
                <td>Navy Blue</td>
                <td>20</td>
                <td><i class="fa fa-inr" aria-hidden="true"></i> 899</td>
                <td>
                    <span class="qty">1 </span>
                    <div class="btn-group" data-toggle="buttons">
                       <label class="button" style="width:40px">&mdash;</label><label class="button" style="width:40px">+</label>
                    </div>
                </td>
                <td><i class="fa fa-inr" aria-hidden="true"></i> 899</td>
                <td>
                    <button class="button" style="width:40px" data-toggle="tooltip" data-placement="top" title="Remove item">X
                    </button>
                </td>
            </tr>
            <!--/First row-->
		<!--total row-->
            <tr>
                <td colspan="3"></td>
                <td>
                    <h4><strong>Total</strong></h4></td>
                <td>
                    <h4><strong><i class="fa fa-inr" aria-hidden="true"></i> 899</strong></h4></td>
                <td colspan="3"><button type="submit" class="button"><span>Buy All</span></button></td>
				
            </tr>
            <!--/total row-->

        </tbody>
        <!--/Table body-->
    </table>
</div>
		</div></div><br><br><br><br><br>
<%@include file="foter.jsp"%>

	<!-- /#page-wrapper -->
    </div>
	 </div>  
<!-- Modal -->
 <%@include file="model.jsp"%>	
</body>

</html>