<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <!DOCTYPE html>
    <html>
    <head>



     <title>Bank Login Page</title>



    </head>
    <style>
    @charset "ISO-8859-1";
    body {
     background-color: #f1f1f1;
     font-family: Arial, sans-serif;

    }



    .container {
     background-color: #fff;
     padding: 20px;
    margin: 50px auto;
    max-width: 400px;
    border-radius: 5px;
     box-shadow: 0 0 10px rgba(0,0,0,0.3);
    }
    ul{
    list-style-type:none;
    margin:0;
    padding:0;
    overflow:hidden;
    background-color:#AE275F;
    position:-webkit-sticky; /* Safari */
    position:sticky;
     color: white;
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
   text-align: center;
   margin-bottom: 30px;
    }


    form {
  display: flex;
  flex-direction: column;
    }

    label {
    font-weight: bold;
  margin-bottom: 5px;
    }



    input[type=text], input[type=password] {
    padding: 10px;
    border-radius: 5px;
    border: none;
   margin-bottom: 20px;
    }



    input[type=submit] {
     background-color: #AE275F;
     color: #fff;
     padding: 10px;
     border: none;
     border-radius: 5px;
     cursor: pointer;
    }



    input[type=submit]:hover {
    background-color: black;
    }
    </style>

    <body>

    <ul><h1>Ohio Platform</h1>
    </ul>
    <div class="container">
    <h1>Bank Login</h1>
    <form action ="/projectBilling/adminPage"method="post">
    <label for="userid">User ID</label>
    <input type="text" id="userid" name="userid" placeholder="Enter your User ID" required>
    <br><br>
    <label for="password">Password</label>
    <input type="password" id="password" name="password" placeholder="Enter your password" required>
    <br><br>
    <input type="submit" value="Login">
    </form>
    </div>
    </body>
    </html>