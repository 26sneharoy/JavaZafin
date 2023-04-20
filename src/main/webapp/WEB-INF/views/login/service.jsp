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
	<h2>Service Information</h2>
	<form action="serviceDetails" method="POST">

			<label for="serviceCode">Service Code:</label>
			<input type="text" name="serviceCode" required>


			<label for="serviceName">Service Name:</label>
			<input type="text" name="serviceName" required>


			<label for="serviceDescription">Service Description:</label>
			<textarea name="serviceDescription" required></textarea>


			<label for="serviceOwner">Service Owner:</label>
			<input type="text" name="serviceOwner" required>


			<label for="serviceOpeningDate">Opening Date:</label>
			<input type="date" name="serviceOpeningDate" required>


			<label for="serviceValidityDate">Validity Date:</label>
			<input type="date" name="serviceValidityDate" required>


			<label for="serviceExpiryDate">Expiry Date:</label>
			<input type="date" name="serviceExpiryDate" required>


			<label for="serviceCurrency">Currency:</label>
            		<select id="currency" name="serviceCurrency">
            			<option value="USD">USD</option>
            			<option value="EUR">EUR</option>
            			<option value="GBP">GBP</option>
            			<option value="JPY">JPY</option>
            		</select>


			<label for="standAlone">Standalone service:</label>
			<select name="standAlone" required>
				<option value="">--Please select--</option>
				<option value="yes">Yes</option>
				<option value="no">No</option>
			</select>

			<label for="rate"> Rate</label>

			<select name="rate">
			<c:forEach items="${rateList}" var="rates">
			<option value="${rates.rateCode}">${rates.rateCode}</option>
			</c:forEach>
            </select>

			<label for="mandatory">Mandatory service:</label>
			<select name="mandatory" required>
				<option value="">--Please select--</option>
				<option value="yes">Yes</option>
				<option value="no">No</option>
			</select>

			<input type="submit" value="Submit">

	</form>
</body>
</html>
