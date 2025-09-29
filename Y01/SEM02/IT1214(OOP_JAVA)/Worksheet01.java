class Student{
	private String name;
	private int rollNo;
	private	 String course;
	
	Student(String name, int rollNo, String course){
		this.name = name;
		this.rollNo = rollNo;
		this.course = course;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name){
		
	}
	
	public int getRollNo(){
		return rollNo;
	}
	
	public void setRollNo(int rollNo){
		
	}
	
	public void setCourse(String course){
		
	}
	
	public String getCourse(){
		return course;
	}
	
	
	public void display(){
		System.out.println("Student Name: " + name +"\n"+ "Roll No:"+ rollNo + "\n" +"Course: " + course);
	}	

}

class Calculator{
	int add(int a,int b){
		return a + b;
	}
	
	int add(int a,int b, int c){
		return a + b +c;
	}
	
	double add(double a,double b){
		return a + b;
	} 
	
}

class Rectangle {
	private int length;
	private int width;
	
	Rectangle(){
		
	}
	
	Rectangle(int length,int width){
		this.width = width;
		this.length = length;
	}
	
	
	public int area(){
		return length*width;
	}
	
	
}

class Vehicle{
	String brand;
	int speed;
	
	void display() {
		System.out.println("Brand: " + brand);
		System.out.println("Speed: " + speed);
		
	}
}

class Car extends Vehicle{
	String modle;
	
	@Override
	void display(){
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + modle);
		System.out.println("Speed: " + speed);	
		}
}

class BankAccount{
	private String accountHolderName;
	private double balance;
	
	public void deposit(double amount){
		balance += amount;
	}
	
	public void withdraw(double amount){
		if(balance>amount){
			balance -= amount;
		}else{
			System.out.println("insufficient Credit");
		}
	}
	
	public void displayBalance(){
		System.out.println("Balance: " + balance);
	}
}

class Book {
	private String title;
	private String author;
	private double price;
	
Book(String title,String author,double price){
	this.title = title;
	this.author = author;
	this.price = price;
}

Book(String title,String author){
	this.price = 0;
	this.author = author;
	this.title = title;
}
}

class Shape {
	void area() {
		System.out.println("Area not defined");
	}
}

class Circle extends Shape{
	double radius;
	
	Circle(double radius){
		this.radius =  radius;
	}
	
	@Override
	void area() {
		System.out.println("Area: " + (Math.PI * Math.pow(radius,2)));
	}
}

class Person{
	private String name;
	private int age;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name =name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
}

class TempeatureConverter {
	double toFaranhite(double celsius){
		return (celsius * 9/5) + 32;
	}
	
	double toCelcius(double fahrenheit){
		return (fahrenheit - 32) * 5/9;
	}
}

class Employee{
	String name;
	int id;
	double salary;
	
	Employee(String name,int id,double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	void displayDetails(){
		System.out.println("Employee  ID: "+ id +"\n"+"Employee  name: " + name +"\n"+salary);
	}
}

class Manager extends Employee {
    Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus");
    }
}


	
	public class Worksheet01 {
		public static void main(String[] args) {
			// Q1: Student
			Student student = new Student("Naveen Malinga",138, "Information Technology");
			student.display();
			
			//Q2: Rectangle
			Rectangle rect1 = new Rectangle();
			Rectangle rect2 = new Rectangle(5,10);
			
			System.out.println("Area of rect2 " + rect2.area());
			System.out.println("Area of rect1 " + rect1.area());

			// Q3: Calculator
			Calculator calc = new Calculator();
			System.out.println("Add two integers: " + calc.add(2, 3));
			System.out.println("Add three integers: " + calc.add(2, 3, 4));
		    System.out.println("Add two doubles: " + calc.add(2.5, 3.5));

			//Q4: Vehicle and car
			Car car = new Car();
			car.brand = "Toyota";
			car.speed = 120;
			car.modle = "Corolla";
			car.display();
			
			
			//Q5: BankAccount
			BankAccount account = new BankAccount();
			account.deposit(5000);
			account.withdraw(1500);
			account.displayBalance();
			
			//Q6:Book
			Book book1 = new Book("Java Basics", "Author A", 300.0);
			Book book2 = new Book("Python Essentials", "Author B");
			
			//Q07:Shape and Circle
			Circle circle = new Circle(5.0);
			circle.area();
			
			//Q08:Person Class
			Person person = new Person();
			person.setName("Alice");
			person.setAge(25);
			System.out.println("Person Name: " + person.getName());
			System.out.println("Person Age: " + person.getAge());
			
			//Q09:TempeatureConverter
			TempeatureConverter converter = new TempeatureConverter();
			System.out.println("30 Celsius to Fahrenheit: " + converter.toFaranhite(30));
			System.out.println("86 Fahrenheit to celsius: " + converter.toCelcius(86));
			
			//Q10:Employee and Manager
			Manager manager = new Manager("Jane", 101, 801452.00);
			manager.displayDetails();
		}
		

}

