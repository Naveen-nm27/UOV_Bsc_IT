<?php
    $_SESSION = [];
    setcookie(session_name(), FALSE);
    session_destroy();
    header('Location: login.php');
?>