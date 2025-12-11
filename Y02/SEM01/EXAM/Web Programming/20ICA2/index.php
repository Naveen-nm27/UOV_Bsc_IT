
<?php

require_once "includes/config.php";
require_once "includes/validation.php";


    $values = [
        'name' => '',
        'username' => '',
        'email' => '',
        'password' => '',
        'website_name' => ''
    ];

    $error = [];

if($_SERVER["REQUEST_METHOD"] == "POST"){

    foreach($values as $key => $_){
        $values[$key] = trim($_POST[$key] ?? "");
    }

    $error['name'] = validateName($values['name']); 
    $error['website_name'] = validateWebsite($values['website_name']);
    $error['email'] = validateEmail($values['email']);
    $error['password'] = validatePassword($values['password']);

    if(isUnique($values['username'])){
        $error['username'] = validateUsername($values['username']);
    }


    $error = array_filter($error);

    $hashed_password = password_hash($values['password'], PASSWORD_DEFAULT);

if(!$error){
        try{
        $sql = "INSERT INTO `20ica2` (name, username, email, password, website_name) VALUES (:name, :username, :email, :password, :website_name)";
        $stmt = $pdo->prepare($sql);

        $stmt->bindParam(':name', $values['name']);
        $stmt->bindParam(':username', $values['username']);
        $stmt->bindParam(':email', $values['email']);
        $stmt->bindParam(':password', $values['password']);
        $stmt->bindParam(':website_name', $values['website_name']);

        // $hashed_password = password_hash($values['password'], PASSWORD_DEFAULT);
        // $stmt->bindParam(':password', $hashed_password);


        $stmt->execute();

        $values['password'] = '';
        header("Location: Login.php");
        exit;

        }catch(PDOException $e){
            die("query failed: " .$e->getMessage());
        }
    }
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Index</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <form action="index.php" method="POST">
        <div>
            <table>
                <tr>
                    <td>
                        <label class="required">Name</label>
                        <?=  showError($error,'name') ?>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="text" name="name" value="<?= htmlspecialchars($values['name']) ?>">                 
                    </td>
                </tr>
                <tr>
                <td>
                    <label class="required">Username</label>
                    <?=  showError($error,'username') ?>
                </td>
                </tr>
                <tr>
                    <td>
                        <input type="text" name="username" value="<?= htmlspecialchars($values['username']) ?>">                     
                    </td>
                </tr>
                <tr>
                <td>
                    <label class="required">Email</label>
                    <?=  showError($error,'email') ?> 
                </td>
                </tr>
                <tr>    
                    <td>
                        <input type="text" name="email" value="<?= htmlspecialchars($values['email']) ?>">                    
                    </td>
                </tr>
                <tr>
                <td>
                    <label class="required">Password</label>
                    <?=  showError($error,'password') ?>
                </td>
                </tr>
                <tr>    
                    <td>
                        <input type="password" name="password" value="<?= htmlspecialchars($values['password']) ?>">                    
                    </td>
                </tr>
                <tr>
                <td>
                    <label class="required">Website Name<label>
                    <?=  showError($error,'website_name') ?>
                </td>
                </tr>
                <tr>
                    <td>
                        <input type="text" name="website_name" value="<?= htmlspecialchars($values['website_name']) ?>">                    
                    </td>
                </tr>
            </table>
        </div>
        <div>
            <input type="submit" value="Register" id="sub">
        </div>
    </form>
</body>
</html>