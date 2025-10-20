<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        body{
            color: violet;
            font-family: Consolas;
            font-size: 40px; 
        }

        h1{
            font-size: 50px;
            color: red;
        }
    </style>
</head>
<body>
    <h1>This is variable</h1>
    <?php
    $x = print "hello<br>";
    echo $x;
        $marks = 30;
        // if($marks >= 50){
        //     echo "Pass";
        // } else {
        //     echo "Fail";
        // }

        ($marks  >= 50) ? print "pass<br>" : print "Fail<br>";

        var_dump($marks);
        echo "<br>";
        
        $var1 = 5.5;
        $var2 = 'Apple';
        $var3 = 'Banana';
        $var4 = TRUE;
        $var5 = [0,8,6,8];
        $var6 = array(78,25,95,45);
        $var6 = [[1,2,3],[2,3,4],[5,6,5]];

        var_dump($var1);
        echo "<br>";
        var_dump($var2);
        echo "<br>";
        var_dump($var3);
        echo "<br>";
        var_dump($var4);
        echo "<br>";
        var_dump($var5);
        echo "<br>";
        var_dump($var5);
        echo "<br>";
        var_dump($var6);
        echo "<br>";
    ?>
</body>
</html>