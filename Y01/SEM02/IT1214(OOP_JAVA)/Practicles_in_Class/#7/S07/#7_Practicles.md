# Understanding Constructors and Nested Loops
**Practical Number** 
**Date** 04/04/2025
**Time** 10.30 am - 12.30 pm

## 1. Objective
-Understanding Constructors and using For Loops in Java.
-Create a Constructor Thats Prints a Rectangle of given Width and Height.

## 2.Theory/Concepts
-Constructors
-For Loops
-Nested Loops

## 3. Algorithm / Flowchart 

1. Start the program

2. Define a class named Rectangle with:

    -Two instance variables: height and width of type int.

    -A constructor that accepts two parameters (h, w) and does the following:

    -Calls a static method print(h, w) to display the rectangle using *.

3.A static method print(width, height) that:

    -Uses nested for loops to print a rectangle of stars (*) with given dimensions.

4. Define the Main class with a main method:

    -Create a new Rectangle object r0 with height 3 and width 5.

        This prints the message and displays a 5x3 rectangle of stars.

    -Create another Rectangle object r1 with height 5 and width 7.

        This prints the message and displays a 7x5 rectangle of stars.

    -Assign r3 to reference the same object as r1.

    -Print the instance variables height and width of r1.

## 4. Source Code

[Code](https://github.com/Naveen-nm27/IT1214_Practicals/blob/main/%237/S07/Rectangle.java)


## 5. Sample Input & Expected Output

[FinalOutput](https://github.com/Naveen-nm27/IT1214_Practicals/tree/main/%237/S07/Output)

## 6. Observations 

-If we Create Constructor Rectangle(int height, int width) Like This
```` java
System.out.println("Height " + r1.height + " , Width " + r1.width);
````
-Will Give you a Null Output Because Code Cant Identify Which Variable is being called because there are multiple Heights and width 

using 
``` java 
    this.width=width; 
    this.width=width;
```
can solve this

-you can assign a new object the value of a already created object

## 7. Conclusion

-Constructors can hold complex code blocs and initialize them with relevant parameters when called 
