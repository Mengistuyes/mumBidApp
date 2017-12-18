<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>	
    	<!-- <a href="views/electronic.jsp" ac>Electronic Items</a>
    	<a href="clothing.jsp">Clothing</a>
    	<a href="shoesAndClothing.jsp">Shoes and Boots</a>
        <h1>Hello World!</h1>
        <p>This is the homepage!</p> -->
        
        <!-- <img src="/resources/images/bidding.jpg" width="100" height="100"/> -->
        <!-- <img src="clothing.jpg" alt="Flowers in Chania">
        <img src="shoesAndBoots.jpg" alt="Flowers in Chania">
        <img src="all.jpg" alt="Flowers in Chania"> -->
        <a href="<spring:url value="add" />">Add Auciton</a>
        <a href="<spring:url value="auction/bid" />">Bidding Page</a>
        

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

			<c:forEach items="${auctions}" var="auction">
				<tr>
					<td width="150px">${auction.item}</td>
					<td width="160px">${auction.itemDescription}</td>
					<td width="150px">${auction.minimumBidAmount}</td>
					<td width="160px">${auction.currentBidAmount}</td>
					<td width="120px">${auction.status}</td>
					<td align="right"><spring:url
							value="bid/${auction.id}" var="ApprovedList" />
						<a type="button" class="buttonUrl" href="${ApprovedList}">Go to Bidding -></a>
						</td>
				</tr>
			</c:forEach>

		</table>
</div>
    </body>
</html>
