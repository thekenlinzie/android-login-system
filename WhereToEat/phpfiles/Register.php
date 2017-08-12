<?php

    $con = mysqli_connect("localhost", "root", "", "thedatabase");
    
	
	
    $name = $_POST["name"];
    $age = $_POST["age"];
    $username = $_POST["username"];
   	$password = $_POST["password"];
    $aboutme =$_POST["aboutme"];
	$email =$_POST["email"];
	
    $statement = mysqli_prepare($con, "INSERT INTO thetable (name, username, age, password,aboutme ,email) VALUES (?, ?, ?, ?,?, ?)");
    mysqli_stmt_bind_param($statement, "ssisss", $name, $username, $age, $password,$aboutme,$email);
    mysqli_stmt_execute($statement);
    
    $response = array();
    $response["success"] = true;  
    
    echo json_encode($response);
?>
