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
<button type="button" class="btn btn-primary">Primary</button>
<button type="button" class="btn btn-secondary">Secondary</button>
<button type="button" class="btn btn-success">Success</button>
<button type="button" class="btn btn-danger">Danger</button>
<button type="button" class="btn btn-warning">Warning</button>
<button type="button" class="btn btn-info">Info</button>
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
				<th>Start Date</th>
				<th>End Date</th>
				<th>Auction Status</th>
			</thead>

			<c:forEach items="${listOfAuctions}" var="auction">
				<tr>
					<td width="150px">${auction.item}</td>
					<td width="160px">${auction.itemDescription}</td>
					<td width="150px">${auction.minimumBidAmount}</td>
					<td width="160px">${auction.currentBidAmount}</td>
					<td width="160px">${auction.startDate}</td>
					<td width="160px">${auction.endDate}</td>
					<td width="120px">${auction.status}</td>
					ddddddddddddddd
					<td align="right"><spring:url
							value="/auction/bid/${auction.id}" var="auctionApprove" />
							<a type="button" class="buttonUrl" href="${auctionApprove}">Edit</a>
					</td>
				</tr>
			</c:forEach>

		</table>
</div>
<%@ include file="footer.jsp"%>
</body>
</html>