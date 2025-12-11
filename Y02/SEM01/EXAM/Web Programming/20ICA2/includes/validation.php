<?php
include_once "config.php";

function validateName($name){
    $name  = trim($name);
    if($name === '') return "Name is Required";
    if(!preg_match("/^[a-zA-Z\s]+$/",$name))
        return "Must Only Contain Letters and Whitespace";
    return "";
}

function validateUsername($username){
    $username = trim($username);
    if($username === '') return "Username must be valid";
    if(!preg_match("/^[a-zA-Z0-9\s_]+$/",$username))
        return "Use only Characters form A-Z and  0-9 and _";
    if (strlen($username) < 3) return "Username must be at least 3 characters";
 return "";
}

function validateEmail($email){
    $email = trim($email);
    if($email === '') return "Email Cannot Be Empty";
    if(!filter_var($email,FILTER_VALIDATE_EMAIL))
        return "Enter an Valid Email";
    return"";
}

function validateWebsite($website){
    $website = trim($website);
    if($website === '') return "Website Must be Entered";
    if(!filter_var($website,FILTER_VALIDATE_URL))
        return "Enter Valid URL";
}

function validatePassword($pass){
    if($pass === '') return "Password Cannot be Empty";
    if(strlen($pass) < 8) return "Password Must be Greater Than 8";
}

function isUnique($username){
    global $pdo;
    $sql = "SELECT 1 FROM 20ica2 WHERE username = :username;";
    $stmt = $pdo->prepare($sql);
    $stmt->bindParam(':username',$username);
    $stmt->execute();
    return $stmt->fetchColumn() === false;
}

function showError($error,$field){
    if(!empty($error[$field])){
        return '<span class="error">' . htmlspecialchars($error[$field]) . '</span>';
    }
    return '';
}

?>