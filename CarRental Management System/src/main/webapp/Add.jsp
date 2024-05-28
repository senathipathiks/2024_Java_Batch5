<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Car Add Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            background-color: #f9f9f9;
        }
        .form-container {
            background-color: #ffffff;
            border-radius: 10px;
            padding: 20px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 350px;
        }
        .form-container h2 {
            color: #0074D9;
            text-align: center;
        }
        .form-container label {
            display: block;
            margin-bottom: 10px;
        }
        .form-container input[type="text"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            margin-bottom: 10px;
        }
        .form-container input[type="submit"] {
            background-color: #FF4136;
            color: white;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
            width: 100%;
        }
        .form-container input[type="submit"]:hover {
            background-color: #E71D36;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Car Add Form</h2>
        <form action="Controller" name="carform" onsubmit="return validateForm();" method="get" id="myform">
            <label for="id">Car Id:</label>
            <input type="text" id="id" name="id">
            
            <label for="brand">Car Brand:</label>
            <input type="text" id="brand" name="brand">
            
            <label for="modal">Car Modal:</label>
            <input type="text" id="modal" name="modal">
            
            <label for="price">Price:</label>
            <input type="text" id="price" name="price">
            
            <input type="submit" value="Add" name="Insert">
        </form>
    </div>
</body>
</html>
