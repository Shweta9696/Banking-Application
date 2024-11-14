<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Transaction Status</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            font-family: Arial, sans-serif;
            background-color: #f8d7da;
        }
        .message-container {
            text-align: center;
            background-color: #ffffff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            max-width: 400px;
        }
        h2 {
            color: #721c24;
            margin-bottom: 20px;
        }
        a {
            text-decoration: none;
            color: #ffffff;
            background-color: #dc3545;
            padding: 10px 20px;
            border-radius: 4px;
            font-weight: bold;
        }
        a:hover {
            background-color: #c82333;
        }
    </style>
</head>
<body>

    <div class="message-container">
        <h2>Transaction Failed!</h2>
        <a href="application.html">Back to Application</a>
    </div>

</body>
</html>
