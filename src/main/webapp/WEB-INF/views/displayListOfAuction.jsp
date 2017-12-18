<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table class="table table-striped">
			<tr>
				<th>Item Name</th>
				<th>Item Description</th>
				<th>Minimum Bidding Price</th>
				<th>Start Date</th>
				<th>End Date</th>
				<th>Auction Status</th>
			</tr>

			<c:forEach items="${listOfAuctions}" var="auction">
				<tr>
					<td width="150px">${auction.Item}</td>
					<td width="150px">${auction.minimumBidAmount}</td>
					<td width="160px">${auction.currentBidAmount}</td>
					<td width="160px">${auction.startDate}</td>
					<td width="160px">${auction.endDate}</td>
					<td width="160px">${auction.endDate}</td>
					<td width="120px">${auction.status}</td>
				</tr>
			</c:forEach>

		</table>
</body>
</html>