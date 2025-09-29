# Understanding Classes,Objects and Constructors
**Practical Number** 5 
**Date** 03-28-2025
**Time** 10.30 a.m to 12.30 p.m

## 1. Objective

### Create a Paper Class
### Create a Document Class
### Create new Document object and Add Paper Object inside that document 

## 2.Theory/Concepts
-How to Create Classes
-How to Create Objects


## 3. Algorithm / Flowchart 

### I.START

### II.Define Class Paper
    -Declare integer variables: length, width
    -Declare a string variable: text

### III.Define Class Document
    -Declare a string variable: name
    -Declare a variable p of type Paper

### IV.In the main() Method
    -Create a Document object d
    -Set the name of d
    -Create a Paper object and assign it to d.p
    -Set properties of Paper object p
        > Assign: length = 75
        > Assign: width = 25
        > Assign: text = "Hello World"

### V.Print paper details

### VI.END

## 4. Source Code

[Code](https://github.com/Naveen-nm27/IT1214_Practicals/blob/main/%235/S05/Practicle01.java)


## 5. Sample Input & Expected Output

[FinalOutput](https://github.com/Naveen-nm27/IT1214_Practicals/tree/main/%235/S05/Output)

## 6. Observations

-We Can Create a Object of Paper Inside Document Class

```java
    d.p=new Paper();
```

-We Can Assign Value to the Object Variables

```java
d.p.length = 75;
d.p.width = 25;
d.p.text= "Hello World!";
```

## 7. Conclusion

-In Java We Can Create Classes And Object Using Those Classes Classes Can Be Seen As Building Blocks That Help Create Objects
