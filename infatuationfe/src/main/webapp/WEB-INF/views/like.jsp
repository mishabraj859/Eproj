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
                <th>des</th>
                <th>Price</th>
                <th>Category Name</th>
                <th>Supplier Name</th>
                <th>Remove/Buy</th>
            </tr>
        </thead>
        <!--/Table head-->

        <!--Table body-->
        <tbody>
       
        <c:forEach items="${allCartItems}" var="cit">
		<!--First row-->
            <tr>
                <td>
                    <image src="${pics}/${cit.getProduct().getPid()}.jpg" style="width:150px;height:150px">
                </td>
                <td>
                    <h5><strong>${cit.getProduct().getPname()}</strong></h5>
                </td>
                <td>${cit.getProduct().getPdesc()}</td>
                <td><i class="fa fa-inr" aria-hidden="true"></i> ${cit.getProduct().getPcost()}</td>
                <td>${cit.getProduct().getCategory().getCname()}</td>
                <td>${cit.getProduct().getSupplier().getSname()}</td>
                <td>
                <br>
                    <a href="<c:url value="/removeItem/${cit.getCartItem_Id()}"/>" class="button" style="width:40px" data-toggle="tooltip" data-placement="top" title="Remove item">
                    <i class="fa fa-times" aria-hidden="true"></i>
                    </a>
                    <a href="<c:url value="/order/${cit.getProduct().getPid()}/${cit.getCartItem_Id()}"/>" class="button" style="width:40px" data-toggle="tooltip" data-placement="top" title="Buy This Item">
                    <i class="fa fa-certificate"></i>
                    </a>
                </td>
            </tr>
           </c:forEach>
            <!--/First row-->
		<!--total row-->
            <tr>
            <td></td>
            <td></td>
                <td>
                    <h4><strong>Total</strong></h4></td>
                <td>
                    <h4><strong><i class="fa fa-inr" aria-hidden="true"></i> ${gTotal}</strong></h4></td>
                <td><a href="<c:url value="/buyall"/>"  class="button"><span>Buy All</span></a>
                <a href="<c:url value="/removeAllItems"/>" class="button"><span>Empty List</span></a>
                </td>
				
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