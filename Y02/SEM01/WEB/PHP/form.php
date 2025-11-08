<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="form.css">
</head>
<body>
    <form>
        <h1>Signup form</h1>
        <table class="signup">
            <tr>
                <td>First Name</td>
                <td><input type="Text"></td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td><input type="Text"></td>
            </tr>
            <tr>
                <td>Username</td>
                <td><input type="Text"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="Email"></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="Password"></td>
            </tr>
            <tr>
                <td>Confirm Password</td>
                <td><input type="Password"></td>
            </tr>
            <tr>
                <td>Age</td>
                <td><input type="Text"></td>
            </tr>
            <tr>
                <td>Gender</td>
                <td>
                    <Select>
                        <option>------</option>
                    </Select>
                </td>
            </tr>
            <tr>
                <td>
                    I agree to the <a href="#">terms and conditions</a>
                    <input type="checkbox">
                </td>
            </tr>
            <tr>
                <td id="submit">
                    <input type="submit" value="SignUp">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>