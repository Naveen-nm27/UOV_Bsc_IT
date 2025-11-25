<?php
session_start();
require_once "db.php";

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $username = $_POST['username'];
    $password = $_POST['password'];

    // In a real app, hash passwords!
    $stmt = $pdo->prepare("SELECT * FROM users WHERE username = ? AND password = ?");
    $stmt->execute([$username, $password]);

    if ($stmt->rowCount() > 0) {
        $_SESSION['user'] = $username;
        header("Location: transfer.php");
        exit;
    } else {
        $error = "Invalid login.";
    }
}
?>
<!DOCTYPE html>
<html>
<head>
    <style>
        body { font-family: sans-serif; background: #f4f7f6; padding: 50px; text-align: center; }
        .login-box { background: white; padding: 30px; display: inline-block; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1); }
        input { padding: 10px; margin: 10px 0; width: 200px; }
        button { padding: 10px 20px; background: #3498db; color: white; border: none; cursor: pointer; }
    </style>
</head>
<body>
    <div class="login-box">
        <h2>🔒 Secure Bank Login</h2>
        <?php 
        
        if(isset($error)) {
            echo "<p style='color:red'>$error</p>"; 
        }
            
        
        ?>
        <form method="POST">
            <input type="text" name="username" placeholder="Username" required><br>
            <input type="password" name="password" placeholder="Password" required><br>
            <button type="submit">Login</button>
        </form>
    </div>
</body>
</html>