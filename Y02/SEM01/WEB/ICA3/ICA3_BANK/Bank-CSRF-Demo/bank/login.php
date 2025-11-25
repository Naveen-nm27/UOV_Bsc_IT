<?php
session_start();
require_once "db.php";

if ($_SERVER['REQUEST_METHOD'] === 'POST') {

    $username = $_POST['username'];
    $password = $_POST['password'];

    $stmt = $pdo->prepare("SELECT * FROM users WHERE username = ? AND password = ?");
    $stmt->execute([$username, $password]);

    if ($stmt->rowCount() === 1) {
        $_SESSION['user'] = $username;
        header("Location: transfer.php");
        exit;
    } else {
        echo "Invalid login.";
    }
}
?>
<!DOCTYPE html>
<html>
<head><title>Bank Login</title></head>
<body>
<h2>Bank Login</h2>
<form method="POST">
    Username: <br>
    <input type="text" name="username" required><br><br>

    Password: <br>
    <input type="password" name="password" required><br><br>

    <button type="submit">Login</button>
</form>
</body>
</html>
