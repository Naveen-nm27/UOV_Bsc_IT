<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=	, initial-scale=1.0">
    <title>String</title>
    <style>
        body{
            background-color:black;
            color: lime;
            font-size: 25px;
            font-family: Consolas;
        }
        
    </style>
</head>
<body>
    <?php
        $name = "Nav";
        echo "Where is  {$name}.";
        echo "<br>";
        echo "My Name is $name.";
        $lang = "java";
        echo "<br>I'm Learning {$lang}Script<br>";
        ?>
<pre>
<?php
echo <<<_END
1
  2
    3
      4
        5
          6
_END;
    ?>
</pre>
</body>
</html>