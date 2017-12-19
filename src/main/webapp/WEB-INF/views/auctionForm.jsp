<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
 
<head>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Auction</title>
 <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
   $( function() {
    $( "#startDate" ).datepicker();
  } );
  
  $( function() {
	  $( "#endDate" ).datepicker();
   } );  
  
   /* $(function () {
	    $('#startDate').datetimepicker({
	        use24hours: true,
	        format: 'HH:mm'
	    });
	});
  
  $(function () {
	    $('#endDate').datetimepicker({
	        use24hours: true,
	        format: 'HH:mm'
	    });
	});
  
   $('#startDate').datetimepicker({
	   format : 'DD/MM/YYYY HH:mm'
	});

  $('#endDate').datetimepicker({
	   format : 'DD/MM/YYYY HH:mm'
	});
 */  </script>
  
<style>
 
    .error {
        color: #ff0000;
    }
</style>
 
</head>
 
<body class="container-fluid">
<form:form modelAttribute="addNewAuction" action="add" method="POST">
		<fieldset>
			<legend>Auction Registration Form</legend>
			<p>
				<form:errors path="*" cssStyle="color : red;" />
			</p>
			
			<div class="form-group">
				<label for="item">Item Name:           </label>
				<form:input path="item" />
			<div>
			<div class="form-group">
				<label for="itemDescription">Item Description:   </label>
				<form:input path="itemDescription" />
			
			<div class="form-group">
			<label for="minimumBidAmount">Minimum Bid Amount: </label>
				<form:input path="minimumBidAmount" />
			</div>
			
			<div class="form-group">
			<label for="expectedPrice">Expected Amount: </label>
				<form:input path="expectedPrice" />
			</div>
			
			<p>Date: <input type="text" id="startDate"></p>
			<p>Date: <input type="text" id="endDate"></p>
			
			<div>
			<p>
					<label for="imagePath">Item Image</label>
					<form:input id="imagePath" path="imagePath" name="imagePath" type="file" />
			<p>
				<input type="submit" value="submit" class="buttonUrl" />
			</p>
		</fieldset>

	</form:form>
	 <br/>
    <br/>
    Go back to <a href="<c:url value='/home' />">List of All Auctions</a>
    <%@ include file="footer.jsp"%>
</body>
</html>