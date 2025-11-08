<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pre_Defined_Functions</title>
    <style>
        body{
            font-family:monospace;
            font-size: 16px;
            color: lime;
            background-color: black;
            padding: 5px;
            margin: 5px;
        }
    </style>
</head>
<body>
    <h1>Pre Defined</h1>
    <?php
        $nums = [10,15,20,325];
        $colors = ["red","green","blue","yello"];

        echo count($nums);
        echo "<br>";
        echo "Total numbers: " . count($nums) . "<br>";
        echo "<br>";

        echo "Sum of Numbers: " .array_sum($nums);

        array_push($colors,"Tomato");
        echo "</br>";
        echo "After Push";
        echo "</br>";
        print_r($colors);

        echo "</br>";
        echo "Poped Element:" . array_pop($colors);

        echo "<br>";
        sort($nums);
        echo "Numers after Sort Accendding <br>";
        print_r($nums);
        echo "<br>";

        //get All Keys
        $student = ["name" => "Kavi", "age" => 22,"city" => "colombo"];
        echo "Keys of student array";
        print_r(array_keys($student));
        echo "<br>";

        $text = "hello world";
        echo "Uppercase: " .strtoupper($text) . "</br>";
        echo "Lowercase: " .strtolower($text) . "</br>";
        echo "Length Of Text: " .strlen($text) . "</br>";
        echo "Rplace Word with PHP";
        str_replace("word", "PHP", $text) . "<br/>"

    ?>
</body>
</html>