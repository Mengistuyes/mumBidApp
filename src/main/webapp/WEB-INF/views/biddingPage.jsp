<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="header.jsp"%>
</head>
<body>
<form:form modelAttribute="newBid" action="" method="post">
<div class="jumbotron">
  <div class="container">
   <p>Item Name: ${auction.Item}</p>
   <p>Item Description: ${auction.itemDescription}</p>
   <p>Minimum Bid Amount: ${auction.minimumBidAmount}</p>
   <p>Current Bid Amount: ${auction.currentBidAmount}</p>
   
   <p>Started Date/Time: ${auction.startDate}</p>
   <p>End Date/Time: ${auction.endDate}</p>
   
   Auction Status: ${auction.status}
				
  </div>
       <c:if test="${auction.status == 'ACTIVE'}">
					<div>

						<div>
							<div>
								<label>Current Max Bid:</label> <strong>${auction.currentBidAmount }</strong>
							</div>

							<p>
								<label for="bidAmount">Next Bid: </label>
								<form:input path="bidAmount" />
								<form:errors path="bidAmount" cssStyle="color : red;" />
							</p>
							<input type="submit" value="Bid" class="buttonUrl" />
						</div>
					</div>
	    </c:if>
	   </div>
	</form:form>
</div>
<%@ include file="footer.jsp"%>
</body>
</html>