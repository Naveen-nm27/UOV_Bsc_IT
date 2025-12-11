<?php
    session_start();
    require_once 'includes/config.php';

    if (!isset($_SESSION['user'])) {
        header("Location: Login.php");
        exit;
    }

    echo "Welcome " . $_SESSION['user'];
    $username = $_SESSION['user'];

        $sql = "SELECT * 
                FROM `20ica2` 
                WHERE username = :username;";

        $stmt = $pdo->prepare($sql);
        $stmt->bindParam('username',$username);
        $stmt->execute();
        $row = $stmt->fetch(PDO::FETCH_ASSOC);

    if($_SERVER['REQUEST_METHOD'] == 'POST'){
        $sql = "UPDATE `20ica2` website_name = :website_name WHERE username = :username;";
        $stmt = $pdo->prepare($sql);
        $stmt->bindParam('username',$username);
        $stmt->bindParam('website_name',$username);


    }
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard</title>
</head>
<body>
    <h1>Dashboard</h1>
    <a href="<?= $row['website_name'] ?>">Link</a>
    <h1>Edit Your Website</h1>
    <form action="Dashboard.php" method="post">
        <tr>
            <input type="text" name="web">
        </tr>
        <tr>
            <input type="submit" value="Change">
        </tr>
    </form>
</body>
</html>