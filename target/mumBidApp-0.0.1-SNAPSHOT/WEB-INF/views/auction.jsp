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
 
    <h2>Auction</h2>
  
    <form:form method="POST" modelAttribute="auction">
        <form:input type="hidden" path="id" id="id"/>
        <table>
            <tr>
                <td><label for="name">Auction: </label> </td>
                <td><form:input path="name" id="name"/></td>
                <td><form:errors path="name" cssClass="error"/></td>
            </tr>
         
            <tr>
                <td><label for="startDate">Start Date: </label> </td>
                <td><form:input path="startDate" id="startDate"/></td>
                <td><form:errors path="startDate" cssClass="error"/></td>
            </tr>
            <tr>
                <td><label for="endDate">End Date: </label> </td>
                <td><form:input path="endDate" id="endDate"/></td>
                <td><form:errors path="endDate" cssClass="error"/></td>
            </tr>
            
            <tr>
                <td><label for="InitialPrice">Initial Price: </label> </td>
                <td><form:input path="InitialPrice" id="InitialPrice"/></td>
                <td><form:errors path="InitialPrice" cssClass="error"/></td>
            </tr>
     		
     		 <tr>
                <td><combobox for="InitialPrice">Initial Price: </label> </td>
                <td><form:input path="InitialPrice" id="InitialPrice"/></td>
                <td><form:errors path="InitialPrice" cssClass="error"/></td>
            </tr>
            
            <form:select path="auction">
   			<form:option value="NONE" label="--- Select ---"/>
   			<form:options items="${AuctionStatus}" />
			</form:select>
            
            <tr>
                <td colspan="3">
                    <c:choose>
                        <c:when test="${edit}">
                            <input type="submit" value="Update"/>
                        </c:when>
                        <c:otherwise>
                            <input type="submit" value="Register"/>
                        </c:otherwise>
                    </c:choose>
                </td>
            </tr>
        </table>
    </form:form>
    <br/>
    <br/>
    Go back to <a href="<c:url value='/list' />">List of All Auctions</a>
</body>
</html>
WEB-IN