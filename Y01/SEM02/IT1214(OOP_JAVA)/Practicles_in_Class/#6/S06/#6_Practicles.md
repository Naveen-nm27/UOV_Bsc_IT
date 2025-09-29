# Understanding Classes,Objects and Constructors
**Practical Number** 6
**Date** 04.03.2025
**Time** 10.30-12.30

## 1. Objective
- Understanding How to Create a New Class
- Use Student() Class to Create new Student Object called S01 and S02 and assign the names and marks
- Understanding How we Can Create a Constructor in a Class
- Create a Printer Method to Replace Typing 
    ```java
    System.out .println()
    ``` 
  over and over again

## 2.Theory/Concepts

**A constructor in oop is a special type of method that gets called an object created(instantiated)**

### Features and Workings of a Constructor

- **Same Name as the Class**  
  A constructor always has the same name as the class it belongs to.

- **No Return Type**  
  Constructors do not have a return type, not even `void`.

- **Automatic Invocation**  
  A constructor is automatically called when an object of the class is created.

- **Multiple Constructors (Overloading)**  
  A class can have multiple constructors with different parameter lists. This allows the creation of objects in multiple ways.

---

### Example in Java:

```java
class Student {
    int marks;
    String name;

    // Default constructor
    Student() {
        System.out.println("Creating a Student Object");
        name = "Default Name";
    }

    // constructor with parameters
    Student(String n, int m) {
        System.out.println("Name of the Student is: " + n + " Marks of S02 is: " + m);
    }
}
```
## 3. Algorithm / Flowchart 
    
### Define a class Student

-Declare two variables: name (String) and marks (int).

-Define a default constructor:

    Print "Creating a Student Object".

    Assign "Default Name" to name.

-Define a parameterized constructor:

    Accept parameters String n and int m.

    Print "Name of the Student is: n Marks of S02 is: m".

### Define a class Printer

    -Contains a method print(String s) to display a string.

### Define the App class with main() method

    -Create an object of Printer class (currently this will cause a compile error because Printer is commented out).

    -Print "Welcome to demo class App".

### Create Student object S01 using the parameterized constructor

-Pass "Alice" and 100 as arguments.

-Update S01's name and marks manually.

-Print updated details.

### Create Student object S02 using the parameterized constructor

    -Pass "Hatter" and 75 as arguments.

## 4. Source Code

[Code](https://github.com/Naveen-nm27/IT1214_Practicals/blob/main/%236/S06/IT1214_App.java)


## 5. Sample Input & Expected Output

[FinalOutput](https://github.com/Naveen-nm27/IT1214_Practicals/tree/main/%236/Output)

## 6. Observations 
    
    -We Can Create Many Constructors in a Class With Different Parameters 

    -We Can Create Methods to Make our Code more Efficient by adding Repeating Code Blocks in them 


## 7. Conclusion

    -Constructors Run Automatically when you crete a new object which can be very useful to initializes the objects
