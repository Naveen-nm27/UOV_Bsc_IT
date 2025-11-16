<?php
session_start();
require_once 'includes/config.php';
require_once 'includes/validate.php';

if (isset($_SESSION['username'])){
?>
<!DOCTYPE html>
<html lang="en">
<body>
    <?php echo 'Hi '.htmlentities($_SESSION['username']); ?>
    <br /><a href="logout.php">Logout </a>
</body>
</html>
<?php
exit;
}

if($_POST){
    if(isset($_POST['username'])){
        $username = trim($_POST['username']);
    }

    if(isset($_POST['password'])){
        $password = trim($_POST['password']);
    }

    $stmt = $pdo -> prepare('SELECT username,password FROM users WHERE username=:username');
    $stmt->execute([':username' => $username]);

    $result = $stmt -> fetch();

    if($result){
        if(password_verify($password, $result['password'])){
            session_regenerate_id();
            $_SESSION['username'] = $result['username'];
            header('location: login.php');
            echo "Login-Success";
            exit;
        }
    }

    $error = "Incorrect username or password";
}

?>
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
    <link rel="stylesheet" href="css/style.css" />
    <script src="js/jquery-3.7.1.min.js"></script>
    <script src="js/validate.js"></script>
    </head>
    <body>
    <table class="interface">
        <?php
            if (isset($error)) {
                echo '<tr><td colspan="2" class="error">' . htmlentities($error) . '</td></tr>';
            }
        ?>
        <form method="post" action="">
            <tr>
                <td>Username</td>
                <td><input type ="text" name="username" maxlength=16 required /></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type ="password" name="password" minlength=8 required></td>
            </tr>
            <tr>
               <td colspan="2" align="center"><input type="submit" value="login" class="safe"></td>
            </tr>
           
        </form>
        </table>
    </body>
    </html>
