<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>Customer Account Creation</title>
	<link rel="stylesheet"  href="../resources/css/style2.css">
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

		<h2>Customer Details</h2>
	<form action="customerDetails" method="POST">
		<label for="customerId">Customer Id:</label>
		<input type="text" id="customerId" name="customerId">

		<label for="customerName">Customer Name:</label>
		<input type="text" id="customerName" name="customerName">

		<label for="customerPhon">Phone Number :</label>
		<textarea id="customerPhon" name="customerPhon"></textarea>

		<label>Email Id :</label>
		<input type="text" >

			<label>Address:</label>
        		<input type="text" >


		<label > Date of joining :</label>
		<input type="date">

		<label for="account"> Account </label>

        			<select name="account">
        			<c:forEach items="${accountLists}" var="accounts">
        			<option value="${accounts.accountNumber}">${accounts.accountNumber}</option>
        			</c:forEach>
                    </select>

		<input type="submit" value="Submit">
	</form>
	</div>
</body>
</html>