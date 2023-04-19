<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>Banking Application Service Information</title>
</head>

<style>
@charset "ISO-8859-1";
.container {
	max-width: 600px;
	margin: 0 auto;
	padding: 20px;
	background-color: #f2f2f2;
}
ul{
list-style-type:none;
margin:0;
padding:0;
overflow:hidden;
background-color:#AE275F;
position:-webkit-sticky; /* Safari */
position:sticky;
top:0;
}
li{
float:left;
}
li a{
display:block;
color:white;
text-align:center;
padding:14px 16px;
text-decoration:none;
}
li a:hover{
background-color:#111;
}

h1 {
	text-align: left;
	margin-bottom: 30px;
	color:white;
}
h2{
    text-align: center;

}

form {
	display: grid;
	grid-template-columns: 1fr 1fr;
	grid-gap: 20px;
}

label {
	display: block;
	margin-bottom: 5px;
	font-weight: bold;
}

input[type="text"],
select,
textarea {
	padding: 10px;
	font-size: 16px;
	border-radius: 5px;
	border: none;
	box-shadow: 0 0 5px rgba(0,0,0,0.1);
}

input[type="submit"] {
	padding: 10px 20px;
	font-size: 16px;
	background-color: #AE275F;
	color: #fff;
	border: none;
	border-radius: 5px;
	cursor: pointer;

}

input[type="submit"]:hover {
	background-color: black;
}
</style>
<body>

<ul>
<h1>Ohio Platform</h1>
</ul>
	<div class="container">
	<h2>Account Information</h2>
	<form action="accountDetails" method="POST">

			<label for="accountNumber">Account Number :</label>
			<input type="text" name="accountNumber">


			<label for="accountType">Account Type:</label>
			<input type="text" name="accountType">


			<label for="product"> Products</label>

			<select name="product">
			<c:forEach items="${products}" var="prod">
			<option value="${prod.productCode}">${prod.productCode}</option>
			</c:forEach>
            </select>


			<input type="submit" value="Submit">

	</form>
</body>
</html>
