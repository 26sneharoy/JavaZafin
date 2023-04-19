<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>
    <head>
    	<title>Admin Page</title>
    	<link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <style>
    /* Reset Styles */
    * {
    	margin: 0;
    	padding: 0;
    	box-sizing: border-box;
    }

    /* Global Styles */
    body {
    	font-family: Arial, sans-serif;
    	line-height: 1.5;
    }

    .container {
    	max-width: 1200px;
    	margin: 0 auto;
    	padding: 0 20px;
    }

    header {
    	background-color: #007bff;
    	color: #fff;
    	padding: 10px 0;
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


    main {
    	padding: 50px 0;
    }

    h1 {
    	text-align: left;
    	margin-bottom: 30px;
    	color:white;
    }

    h2 {
    	font-size: 36px;
    	margin-bottom: 30px;
    }

    .dashboard {
    	display: flex;
    	flex-wrap: wrap;
    }

    .card {
    	background-color: #f2f2f2;
    	padding: 20px;
    	box-shadow: 0 0 10px rgba(0,0,0,0.2);
    	margin-right: 20px;
    	margin-bottom: 20px;
    	width: calc(33.33% - 20px);
    }

    .card:last-child {
    	margin-right: 0;
    }

    .card a {
    	color: #AE275F;
    	text-decoration: none;
    }

    .card i {
    	display: block;
    	font-size: 36px;
    	margin-bottom: 10px;
    	color: #AE275F;
    }

    .card h3 {
    	font-size: 24px;
    	margin-bottom: 10px;
    }

    .card p {
    	font-size: 16px;
    	color: #666;
    }

    footer {
    	background-color: #ccc;
    	padding: 10px 0;
    	text-align: center;
    	margin-top: 50px;
    }

    footer p {
    	font-size: 14px;
    	color: #333;
    }

    @media screen and (max-width: 768px) {
    	nav ul {
    		flex-direction: column;
    		align-items: center;
    	}

    	nav ul li {
    		margin-right: 0;
    		margin-bottom: 10px;
    	}

    	.dashboard .card {
    		width: 100%;
    		margin-right: 0;
    	}
    }
    </style>
    <body>

    <ul>
    <h1>Ohio Platform</h1>
    </ul>

    	<main>
    		<div class="container">
    			<h2>Admin Dashboard</h2>
    			<div class="dashboard">
    				<div class="card">
    					<a href="createProduct">
    						<i class="fas fa-plus"></i>
    						<h3>Create Product</h3>
    						<p>Add a new product to the catalog</p>
    					</a>
    				</div>

    				<div class="card">
    					<a href="view_products.html">
    						<i class="fas fa-eye"></i>
    						<h3>View Products</h3>
    						<p>View all products in the catalog</p>
    					</a>
    				</div>

    				<div class="card">
    					<a href="createService">
    						<i class="fas fa-plus"></i>
    						<h3>Create Service</h3>
    						<p>Add a new service to the list</p>
    					</a>
    				</div>

    				<div class="card">
    					<a href="view_services.html">
    							<i class="fas fa-eye"></i>
    							<h3>View Services</h3>
    							<p>View all services in the list</p>
    						</a>
    				</div>

    				<div class="card">
    					<a href="showLogin">
    							<i class="fas fa-plus"></i>
    							<h3>Create Rates</h3>
    							<p>Add a new rate to the list</p>
    						</a>
    				</div>

    				<div class="card">
    					<a href="view_customers.html">
    						<i class="fas fa-eye"></i>
    						<h3>View Customers</h3>
    						<p>View all customers in the database</p>
    					</a>
    				</div>
    			</div>
    		</div>
    	</main>

    	<footer>
    		<div class="container">
    			<p>&copy; 2023 Banking Application</p>
    		</div>
    	</footer>

    	<script src="https://kit.fontawesome.com/a076d05399.js"></script>
    </body>
    </html>