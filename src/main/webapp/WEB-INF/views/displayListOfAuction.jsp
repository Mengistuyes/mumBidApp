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
	<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

		<script type="text/javascript"
	src="<spring:url value="src/main/webapp/resources/js/adminAjaj.js"/>">
	
	$('approve').on('click', function () {

		   $.ajax({
		   type:'POST',
		   url :"result",
		   success: function(data) {
		        console.log('success',data);
		   },
		   error:function(exception){alert('Exeption:'+exception);}
		}); 
		 e.preventDefault();
		});
	
	</script>
	</head>
<body>

<div class="panel panel-default">
  <!-- Default panel contents -->
  <div class="panel-heading">List of Auction</div>
  <div class="panel-body">
    <p>...</p>
  </div>

  <!-- Table -->
	<table class="table">
			<thead>
				<th>Item Name</th>
				<th>Item Description</th>
				<th>Minimum Bidding Price</th>
				<th>Auction Status</th>
			</thead>

			<c:forEach items="${listOfAuctions}" var="auction">
				<tr>
					<td width="150px">${auction.item}</td>
					<td width="160px">${auction.itemDescription}</td>
					<td width="150px">${auction.minimumBidAmount}</td>
					<td width="160px">${auction.currentBidAmount}</td>
					<td width="120px">${auction.status}</td>
					<td align="right"><spring:url
							value="/auction/getApprovedById/${auction.id}" var="auctionApprove" />
						<a type="button" class="buttonUrl" href="${auctionApprove}">Edit</a>
						<spring:url value="/auction/reject/${auction.id}"
							var="notApproved" /> <a type="button" class="buttonUrl"
						href="${notApproved}">Cancel</a></td>
					<td><button onclick="approve(${auction.id})">Approve</button></td>
					
				</tr>
			</c:forEach>
		</table>
</div>
<%@ include file="footer.jsp"%>
</body>
</html>