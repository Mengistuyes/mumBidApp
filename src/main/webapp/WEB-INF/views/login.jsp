<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<style>
 
    .error {
        color: #ff0000;
    }
</style>
</head>
<body>
	<form:form id="loginForm" commandName="loginUserDto" action="validLogin" method="post">
		<table align="center">
			<tr><td style="color: red">${errMsg}</td></tr>
			<tr>
				<td><form:label path="eMail">Username: </form:label></td>
				<td><form:input path="eMail" name="username" id="username" /></td>
				<td><form:errors path="eMail" cssClass="error"/></td>
				
			</tr>
			<tr>
				<td><form:label path="password">Password:</form:label></td>
				<td><form:password path="password" name="password" id="password" /></td>
				<td><form:errors path="password" cssClass="error"/></td>
			</tr>
			<tr>
				<td></td>
				<%-- <td align="left"><form:button id="login" name="login" >Login</form:button></td> --%>
				<td align="left"><input type="submit" value="Login" onclick="validLogin"/></td>
			</tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><a href="newUser">Register</a></td>
			</tr>
		</table>
	</form:form>
	<table align="center">
		<tr>
			<td style="font-style: italic; color: red;">${message}</td>
		</tr>
	</table>
</body>
</html>
