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

table {
			border-collapse: collapse;
			width: 100%;
			margin-bottom: 20px;
		}

		th, td {
			padding: 10px;
			text-align: center;
			border: 1px solid #ccc;
		}

		th {
			background-color: #f2f2f2;
			font-weight: normal;
		}

		input[type="number"] {
			width: 100%;
			padding: 8px 10px;
			border: 1px solid #ccc;
			border-radius: 4px;
			box-sizing: border-box;
			font-size: 16px;
		}

		select {
			width: 100%;
			padding: 8px 10px;
			border: 1px solid #ccc;
			border-radius: 4px;
			box-sizing: border-box;
			font-size: 16px;
		}
		.add-row, .remove-row {
        			background-color: #AE275F;
        			color: #fff;
        			padding: 8px 10px;
        			border: none;
        			border-radius: 4px;
        			cursor: pointer;
        			font-size: 16px;
        			margin-right: 10px;
        		}

        		.add-row:hover, .remove-row:hover {
        			background-color: #AE275F;
        		}

input[type="submit"]:hover {
	background-color: black;
}
</style>
<script>
		function addRow() {
			var table = document.getElementById("charge-quantity-table");
			var rowCount = table.rows.length;
			var row = table.insertRow(rowCount);
			var minimum = row.insertCell(0);
			var maximum = row.insertCell(1);
			var rate = row.insertCell(2);
			minimum.innerHTML = '<input type="number" name="minimum[]" required>';
			maximum.innerHTML = '<input type="number" name="maximum[]" required>';
			rate.innerHTML = '<input type="number" name="rate[]" required>';
		}

		function removeRow() {
			var table = document.getElementById("charge-quantity-table");
			var rowCount = table.rows.length;
			if (rowCount > 2) {
				table.deleteRow(rowCount - 1);
			}
		}
	</script>
<body>

<ul>
<h1>Ohio Platform</h1>
</ul>
	<div class="container">

		<h2>Rate Details</h2>
	<form action="displayRates" method="POST">
		<label for="rateCode">Rate Code:</label>
		<input type="text" id="rateCode" name="rateCode">



		<label for="rateDescription">Rate Description:</label>
		<textarea id="rateDescription" name="rateDescription"></textarea>
		<label for="rateType">Rate Type:</label>
        			<select id="rateType" name="rateType" required>
        				<option value="">--Select--</option>
        			<option value="one-time">One Time</option>
        			<option value="monthly">Monthly</option>
        			<option value="recurring">Recurring</option>
        		</select>


		<label for="basedOn">Based On :</label>
        			<select id="basedOn" name="basedOn" required>
                    <option value="">--Select--</option>
        			<option value="value">Value</option>
        			<option value="volume">Volume</option>
        		</select>

		<label for="pricingMethodology">Pricing Methodology:</label>
		<select id="pricingMethodology" name="pricingMethodology" required>
			<option value="">--Select--</option>
			<option value="flat-absolute">Flat Absolute</option>
			<option value="flat-rate">Flat Rate</option>
			<option value="tiered-rate">Tiered Rate</option>
		</select>

		<h3>Charge Quantity Rate:</h3>
		<table id="charge-quantity-table">
			<thead>
				<tr>
					<th>Minimum</th>
					<th>Maximum</th>
					<th>Rate</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><input type="number" name="min[]" required></td>
					<td><input type="number" name="max[]" required></td>
					<td><input type="number" name="rateValue[]" required></td>
				</tr>
				<tr>
					<td><input type="number" name="min[]" required></td>
					<td><input type="number" name="max[]" required></td>
					<td><input type="number" name="rateValue[]" required></td>
				</tr>
			</tbody>
		</table>
		<div>
			<button type="button" class="add-row" onclick="addRow()">Add Row</button>
			<button type="button" class="remove-row" onclick="removeRow()">Remove Row</button>
		</div>



		<input type="submit" value="Submit">
	</form>
	</div>
</body>
</html>