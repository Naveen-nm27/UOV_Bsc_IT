<?php
    function validate_firstname($field){
        if($field == ''){
            return "First Name is required";
        } elseif (strlen($field) > 32){
            return "First name should only contain 32 characters";
        } else {
            return '';
        }
    }

    function validate_lastname($field){
        if($field == ''){
            return "Last Name is required";
        } elseif (strlen($field) > 32){
            return "Last name should only contain 32 characters";
        } else {
            return '';
        }
    }

    function validate_Username($field){
        if($field == ''){
            return "Username is required";
        } elseif (strlen($field) > 16){
            return "Username should only contain 16 characters";
        } else if(preg_match('/[^A-Za-z0-9_\-]/',$field)) {
            return '';
        } else {
            return "username should contain [A-Za-z0-9_\-] ";
        }
    }

    function validate_Email($field){
        if($field == ''){
            return "Email is required";
        } elseif (strlen($field) > 254){
            return "Email should only contain 254 characters";
        } else if(filter_var($field,FILTER_VALIDATE_EMAIL,FILTER_FLAG_EMAIL_UNICODE)) {
            return '';
        } else {
            return "Email should be in correct format";
        }
    }

    echo validate_Username("45");

    function validate_Age($field){
        if($field == ''){
            return "Age is required";
        } elseif ($field > 18 || $field < 128 ){
            return "Age should be between 18 and 128";
        } else {
            return '';
        }
    }

    echo validate_Age(10);

    function validate_Gender($field){
        if($field == ''){
        if(in_array($field,['','M','F','X'],TRUE)){
            return '';
        } else {
            return "Invalid Value";
        }
      }
   }

   echo validate_Gender("P");


?>