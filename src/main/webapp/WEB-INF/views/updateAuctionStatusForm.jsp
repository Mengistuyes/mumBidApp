<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src=""src/main/webapp/resources/jquery-3.2.1.min.js"></script>

<script type="text/javascript">
$( function() {
    $( "#startDate" ).datepicker();
  } );
  
  $( function() {
	  $( "#endDate" ).datepicker();
   } );
$(document).ready(function() {
$('#txtApprovedid option').click(function(){
    $('#txtApprovedid').val($(this).val());
        });
});
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="header.jsp"%>
</head>
<body>
<div class="jumbotron">
  <div class="container">
  <form:form modelAttribute="status" action="/mumBidApp/approve/${id}" method="POST">	
   <p>Item Name: ${auction.item}</p>
   
   <p>Start Date: <input type="text" id="startDate"></p>
	<p>End Date: <input type="text" id="endDate"></p>
   
   Auction Status: ${auction.status}
			<spring:url
				value="/approve/${auction.id}" var="auctionApp" />
			<a type="button" class="buttonUrl" href="${auctionApp}">Edit</a>	
			<select name="select" id="slectStatusid">
				<option value="PENDING">PENDING</option>
				<option value="APPROVED">APPROVED</option>
				<option value="ACTIVE">ACTIVE</option>
				<option value="COMPLETED">COMPLETED</option>
				<option value="CANCELLED">CANCELLED</option>
				</select>
		<input type="text" name="text" id="txtApprovedid" />
		<p>
				<input type="submit" value="submit" class="buttonUrl" />
			</p>
</form:form>
		</div>
</div>
<%@ include file="footer.jsp"%>
</body>
</html>