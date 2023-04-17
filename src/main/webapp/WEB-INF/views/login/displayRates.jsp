<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Configure Rate</title>
	<style>
		body {
			font-family: Arial, sans-serif;
		}
		.container {
        max-width: 600px;
        margin: 0 auto;
        padding: 20px;
        background-color: #f2f2f2;
        }

		form {
			max-width: 500px;
			margin: 0 auto;
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

		input[type="submit"] {
			background-color: #AE275F;
			color: #fff;
			padding: 12px 20px;
			border: none;
			border-radius: 4px;
			cursor: pointer;
			font-size: 16px;
		}

		input[type="submit"]:hover {
			background-color: #AE275F;
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
		ul {
		list-style-type: none;
        margin: 0;
         padding: 0;
         overflow: hidden;
          color: white;
        background-color: #AE275F;
        position: -webkit-sticky; /* Safari */
        position: sticky;
         top: 0;
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
</head>
<body>


	<div>
		<ul><h2>Ohio Bank</h2></ul><br><br>
		<form action="welcomeLogin" method="post">
		<div class="container">
			<label for="rateCode">Rate Code:</label>
			<input type="text" id="rateCode" name="rateCode" required><br><br>

			<label for="rate-description">Rate Description:</label>
			<input type="textarea" id="rateDescription" name="rateDescription" required><br><br>

			<label for="rateType">Rate Type:</label>
			<select id="rateType" name="rateType" required>
				<option value="">--Select--</option>
			<option value="one-time">One Time</option>
			<option value="monthly">Monthly</option>
			<option value="recurring">Recurring</option>
		</select><br><br>

		<label for="basedOn">Based On :</label>
        			<select id="basedOn" name="basedOn" required>
                    <option value="">--Select--</option>
        			<option value="value">Value</option>
        			<option value="volume">Volume</option>
        		</select><br><br>

		<label for="pricingMethodology">Pricing Methodology:</label>
		<select id="pricingMethodology" name="pricingMethodology" required>
			<option value="">--Select--</option>
			<option value="flat-absolute">Flat Absolute</option>
			<option value="flat-rate">Flat Rate</option>
			<option value="tiered-rate">Tiered Rate</option>
		</select><br><br>

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
<br><br>

		<input type="submit" value="Save">
		</div>
	</form>
</div>
</body>
</html>
