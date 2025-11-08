<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Hello</h1>
    <?php
        for($i = 0;$i < 10;$i++){
            echo "Number: " . $i . "<br>";
        }

        echo "<br>";
        echo "While";
        echo "<br>";
        echo "<br>";
        $i = 0;
        while($i < 5){
            echo "Number: " . $i . "<br>";
            $i++;
        }


        echo "<br>";
        echo "Do-While";
        $i = 50;
        do{
            echo "Number: " . $i . "<br>";
            $i--;
        } while ($i > 0);

        echo "<br>";
        $names = ["Batman","Spiderman","Sperman"];
        foreach($names as $nm){
            echo "$nm <br>";
        }

        

    ?>
</body>
</html>