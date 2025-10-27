<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>functions</title>
</head>
<body>
    <h1>PHP Function</h1>
    <?php
        function greet(){
            echo "Hello I'm Batman";
        }

        greet();
    ?>
    
<br>

    <?php
        function add($a,$b){
            return $a + $b;
        }

        echo "sum= " . add(5,10);
    ?>
<br>
    <?php
        echo "<button id='click' onclick='hello'>Click me</button>";
        echo "<script>function hello(){alart 'Hello';}</script>"
    ?>
    <br>
</body>
</html>