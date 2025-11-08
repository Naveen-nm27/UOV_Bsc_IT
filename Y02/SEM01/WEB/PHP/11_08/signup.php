<?php
    require_once "include/config.php";
    require_once "include/validate.php";    

    $username = $_POST['username'] ?? '';
    $firstname = $_POST['firstname'] ?? '';
    $lastname = $_POST['lastname'] ?? '';
    $password = $_POST['password'] ?? '';
    $errors = [];

    if($_POST){
    $error = validate_username($username);
    if($error){
        $errors['username'] = $error;
      }

    $error = validate_firstname($firstname);
    if($error){
          $errors['firstname'] = $error;
    }

    $error = validate_lastname($lastname);
    if($error){
          $errors['lastname'] = $error;
    }

    $error = validate_password($password);
    if($error){
          $errors['password'] = $error;
    }
        if($errors){
            echo "the form has following errors <br/>";
            foreach($errors as $msg){
                echo $msg . '<br />';
            }
        } else {
            $stmt = $pdo->prepare("SELECT COUNT(*) FROM users WHERE username = :username");
            $stmt->execute(['username' => $username]);
            $exist = $stmt->fetchColumn();

            if($exist){
                echo "user exists";
            } else {
                $stmt = $pdo->prepare("INSERT INTO users (username, password, firstname, lastname) VALUES (:username, :password, :firstname, :lastname)");
                $stmt->execute([
                    'username' => $username,
                    'password' => $password,
                    'firstname' => $firstname,
                    'lastname' => $lastname
                ]);
            }
        }
    }

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SignUp</title>
</head>
<body>
    <h1>SignUp</h1>
</body>
</html>
<form action="" method="post">
        <input type ="text" name="username" maxlength=16 value="<?php echo $username; ?>" placeholder="username" /><br/>
        <input type ="text" name="firstname" maxlength=32 value="<?php echo $firstname; ?>" placeholder="First Name" /><br/>
        <input type ="text" name="lastname" maxlength=32 value="<?php echo $lastname; ?>" placeholder="Last Name" /><br/>
        <input type ="password" name="password" minlength=8 value="<?php echo $password; ?>" placeholder="Password" required/><br/>
        <input type ="submit" value="Sign Up" />
</form>
