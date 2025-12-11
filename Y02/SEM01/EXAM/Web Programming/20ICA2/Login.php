<?php
session_start();
require_once 'includes/config.php';

$errors = [];

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $username = trim($_POST['username']);
    $password = $_POST['password'];

    if ($username === '' || $password === '') {
        $errors[] = "Username and Password cannot be Empty";
    } else {
        $sql = "SELECT username, password 
                FROM `20ica2` 
                WHERE username = :username AND password = :password 
                LIMIT 1;";
        $stmt = $pdo->prepare($sql);
        $stmt->bindParam(':username', $username);
        $stmt->bindParam(':password', $password);
        $stmt->execute();
        $row = $stmt->fetch(PDO::FETCH_ASSOC);

        if (!$row) {
            $errors[] = "Invalid Login";
        } else {
            $_SESSION['user'] = $row['username'];
            header("Location: Dashboard.php");
            exit;
        }
    }
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<form action="Login.php" method="POST">
    <div>
        <table>
            <tr><td><h1>Login</h1></td></tr>
            <tr><td>Username</td></tr>
            <tr><td><input type="text" name="username" required></td></tr>
            <tr><td>Password</td></tr>
            <tr><td><input type="password" name="password" required></td></tr>
        </table>
    </div>
    <div>
        <input type="submit" value="Login" id="sub">
    </div>
</form>
<?php
if (!empty($errors)) {
    echo '<div class="errors">';
    foreach ($errors as $err) {
        echo "<p>$err</p>";
    }
    echo '</div>';
}
?>
</body>
</html>
