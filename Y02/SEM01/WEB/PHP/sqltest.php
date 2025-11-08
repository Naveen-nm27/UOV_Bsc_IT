<?php
    require_once "login.php";

    try
    {
        $pdo = new PDO($attr, $user, $pass, $opts);
        //echo "Connected";
    }

    catch(PDOException $e)
    {
       throw new PDOException($e->getMessage());
    }

    $query = "SELECT * FROM classics";
    //$result = $pdo->query($query);
    //print_r($result); echo "<br>"

    $table = $pdo -> query($query)->fetchall();
    print_r($table);
   
   
?>