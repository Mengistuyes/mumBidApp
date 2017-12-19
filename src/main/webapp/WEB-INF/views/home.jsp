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
        <%@ include file="header.jsp"%>
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
        <div align="center">
	        <a href="<spring:url value="add" />"><button type="button" class="btn btn-primary">Add Auction</button></a>
	        <a href="<spring:url value="getAllAuctions" />"><button type="button" class="btn btn-success">This page displays All Auctions</button></a>
	        <a href="<spring:url value="/auction/bid" />"><button type="button" class="btn btn-primary">Bidding Page</button></a></a>
        </div>
        <div>
        <hr width=100%  align=left> 
<br><br>
</div>
<div>	
		</div>
	<c:forEach items="${auctions}" var="auction">
	

	<div class="row">
	<div class="col-md-3">
		<div>Item Name:${auction.item}</div>
		<div>Item Description:${auction.itemDescription}</div>		
		<div><div>Minimum Bidding Price:${auction.minimumBidAmount}</div>
	</div>
	<div class="col-md-3">
		<img src="<c:url value="/resource/images/fridge.jpg"></c:url>" alt="fridge"/>	
		<img src="<c:url value="/resources/images/Logo.jpg"></c:url>" alt="logo"/>
		<div><spring:url value="/auction/bid/${auction.id}" var="ApprovedList" />
		<a type="button" class="buttonUrl" href="${ApprovedList}">Go to Bidding -></a></div>
	</div>
	</div>
	</c:forEach>
		
</div>
    </body>
</html>
