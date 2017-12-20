<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

 <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<%@ include file="header.jsp"%>

</head>
<body>
<form:form modelAttribute="newBid" action="" method="post">
<div class="">
  <div class="container">
  
  <div class="col-md-6">
	<div class="col-md-3">
	 <p>Item Name: ${auction.item}</p>
   <p>Item Description: ${auction.itemDescription}</p>
   <p>Minimum Bid Amount: ${auction.minimumBidAmount}</p>
	</div>
	<div class="col-md-3">
		<img src="<c:url value="/resource/images/Logo.jpg"></c:url>" alt="imagePlaceHolder"/>
	</div>
	  
     <c:if test="${auction.status != 'ACTIVE'}">
	<%-- 	<p>Started Date/Time: ${auction.startDate}</p>
		<p>End Date/Time: ${auction.endDate}</p>  
 --%>		
  <div class="alert alert-danger" role="alert">
 		 Bid will start in <p id="timeExpired"></p>
</div>  
   </c:if>
<%--    Auction Status: ${auction.status} --%>
				
  </div>
  
 
  <div  class="jumbotron">
       <c:if test="${auction.status == 'ACTIVE'}">
					<div>
 <div class="alert alert-success" role="alert">
  harry up! Bid expires in <p id="timeExpired"></p>
</div>  
						<div>
							<div>
								<%-- <label>Current Max Bid:</label> <strong>${CurrentMaxAmount }</strong> --%>
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
	   </div>
	</form:form>
	
	<script>
// Set the date we're counting down to
/* var countDownDate = new Date("Dec 20, 2017 11:20:25").getTime(); */
/* var countDownDate = new Date("${auction.endDate}"); */

var countDownDate = ${endDate1};
// Update the count down every 1 second
var x = setInterval(function() {

    // Get todays date and time
    var now = new Date().getTime();
    
    // Find the distance between now an the count down date
    var distance = countDownDate - now;
    
    // Time calculations for days, hours, minutes and seconds
    var days = Math.floor(distance / (1000 * 60 * 60 * 24));
    var hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
    var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
    var seconds = Math.floor((distance % (1000 * 60)) / 1000);
    
    // Output the result in an element with id="demo"
    document.getElementById("timeExpired").innerHTML = days + "d " + hours + "h "
    + minutes + "m " + seconds + "s ";
    
    // If the count down is over, write some text 
    if (distance < 0) {
        clearInterval(x);
        document.getElementById("timeExpired").innerHTML = "EXPIRED";
    }
}, 1000);
</script>
</div>
<%@ include file="footer.jsp"%>
</body>
</html>