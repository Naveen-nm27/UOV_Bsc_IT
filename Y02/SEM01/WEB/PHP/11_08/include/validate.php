<?php
    function validate_username($field){
        if($field == ''){
            return "No username Entered";
        } elseif (strlen($field) > 32){
            return "username should only contain 32 characters";
        } else {
            return '';
        }
    }

    function validate_firstname($field){
        if($field == ''){
            return "No firstname Entered";
        } elseif (strlen($field) > 32){
            return "First name should only contain 32 characters";
        } else {
            return '';
        }
    }

    function validate_lastname($field){
        if($field == ''){
            return "No lastname Entered";
        } elseif (strlen($field) > 32){
            return "Last name should only contain 32 characters";
        } else {
            return '';
        }
    }

    function validate_password($field){
        if($field == ''){
            return "Password Mustbe Entered";
        } elseif (strlen($field) < 8){
            return "Password should contain 8 characters";
        } else {
            return '';
        }
    }
?>