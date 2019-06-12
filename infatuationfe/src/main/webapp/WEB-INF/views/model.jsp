<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<font face="Maiandra GD"> <div class="modal" id="myModal" role="dialog">

    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title"><img src="${pics}\ash.jpg" style="width:20px"> iNFATUATiON</h4>
        </div>
        <div class="modal-body">
		 <c:url value="/j_spring_security_check" var="a"/>
		<form:form action="${a}" method="post"> <!-- FORM BEGINS-->
           <div class="form-group">
      <label for="email">name</label>
      <input type="email" class="form-control" name="j_username" placeholder="Enter user name">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" name="j_password" placeholder="Enter password">
    </div>
	<div class="modal-footer">
	<button type="submit" class="btn btn-default"><span>Submit</span></button>
	</div>
	</form:form>
        </div>
		 </div>
      
    </div>
  </div></font>	