<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
 
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Auction</title>
 
<style>
 
    .error {
        color: #ff0000;
    }
</style>
 
</head>
 
<body>
<form:form modelAttribute="addNewAuction" action="../add" method="POST">
		<fieldset>
			<legend>Auction Registration Form</legend>
			<p>
				<form:errors path="*" cssStyle="color : red;" />
			</p>
			
			<div class="form-group">
				<label for="item">Item Name: </label>
				<form:input path="item" />
			<div>
			<div class="form-group">
				<label for="itemDescription">Dtem Description: </label>
				<form:input path="itemDescription" />
			<div>
			<p>
					<label for="imagePath">Item Image</label>
					<form:input id="imagePath" path="imagePath" name="imagePath" type="file" />
			<div class="form-group">
			<label for="minimumBidAmount">Minimum Bid Amount: </label>
				<form:input path="minimumBidAmount" />
			</div>
			<div class="form-group">
				<label><span>Start Date:</span></label>
				<div class='input-group date' id="startDate">
					<form:input path="startDate" cssClass="form-control" />
					<span class="input-group-addon"><span
						class="glyphicon glyphicon-th"></span></span>
				</div>
				<form:errors path="startDate" cssStyle="color : red;" />
			</div>
			<div class="form-group">
				<label><span>End Date:</span></label>
				<div class='input-group date' id="endDate">
					<form:input path="endDate" cssClass="form-control" />
					<span class="input-group-addon"><span
						class="glyphicon glyphicon-th"></span></span>
				</div>
				<form:errors path="endDate" cssStyle="color : red;" />
			</div>
			<p>
				<input type="submit" value="submit" class="buttonUrl" />
			</p>
		</fieldset>

	</form:form>
	 <br/>
    <br/>
    Go back to <a href="<c:url value='/home' />">List of All Auctions</a>
</body>
</html>