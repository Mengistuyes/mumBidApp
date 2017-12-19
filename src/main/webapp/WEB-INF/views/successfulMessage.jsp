<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="header.jsp"%>
</head>
<body>
<form:form modelAttribute="addNewAuction" action="" method="post">
<div class="jumbotron">
<h2>Successfully Submitted</h2>
  <div class="container">
   <p>Item Name: ${ItemName}</p>
   <p>Item Description: ${ItemDescription}</p>
   <p>Minimum Bid Amount: ${MinimumBidAmount}</p>
   <p>Expected Amount: ${expectedPrice}</p>
   
  <h3> Auction Status: Pending for Approval</h3>
				
	</form:form>
</div>
<%@ include file="footer.jsp"%>
</body>
</html>