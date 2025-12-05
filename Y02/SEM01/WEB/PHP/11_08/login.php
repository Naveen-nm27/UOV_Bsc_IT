<?php
session_start();

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    require_once 'include/config.php';
    
    $username = $_POST['username'] ?? '';
    $password = $_POST['password'] ?? '';
    
    if ($username && $password) {
        $stmt = $pdo->prepare("SELECT * FROM users WHERE username = :username AND password = :password");
        $stmt->execute(['username' => $username, 'password' => $password]);
        
        if ($user = $stmt->fetch()) {
            $_SESSION['username'] = $username;
            echo "Login successful!";
            // Redirect to a dashboard or home page
        } else {
            echo "Invalid username or password";
        }
    }
}
?>
