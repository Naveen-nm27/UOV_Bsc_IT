<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP_Array</title>
</head>
<body>
    <h1>PHP_Array</h1>

    <?php
        $cars = ["BMW","Toyota","Tesla"];
        echo $cars[0];
    ?>

    <br>

    <?php
        $students = [
            ["sonal",22],
            ["naveen",23],

        ];

        echo $students[0][0];
    ?>

        <br>

    <?php
        $students = ["name" => "Ram","Age" => 22,"city" => "Colombo"];
        echo $students["name"];
    ?>
</body>
</html>