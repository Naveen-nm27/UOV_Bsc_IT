import java.util.*;

class Student{
	public String name;
	public int age;
	public int regNo;
	public double gpa;
	
	Student(String name,int age,int regNo,double gpa){
		this.name = name;
		this.age = age;
		this.regNo = regNo;
		this.gpa = gpa;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public int getRegNo(){
		return regNo;
	}
	
	public double getGPA(){
		return gpa;
	}
	
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setRegNo(int RegNo){
		this.regNo = regNo;
	}
	
	public void gpa(double gpa){
		this.gpa = gpa;
	}
	
	public void printStudent(){
		System.out.println("Name: " + name + "\nAge: " + age + "\nRegistration num: " + regNo + "\nGPA: " + gpa);
		System.out.println("----------------------");
	}
}

class StudentArrayOps{
	public void printArray(Student[] stArray){
		for(int i = 0; i < stArray.length;i++){
			stArray[i].printStudent();
		}
	}
	
	public void oldestStudent(Student[] stArray){
		Student st = stArray[0];
		for(int i = 0; i < stArray.length;i++){
			if(stArray[i].getAge() > st.getAge()){
				st = stArray[i];
			}
		}
		
		System.out.println("//////////////////////Oldest Student");
		st.printStudent();
	}
	
	public void youngestStudent(Student[] stArray){
		Student st = stArray[0];
		for(int i = 0; i < stArray.length;i++){
			if(stArray[i].getAge() < st.getAge()){
				st = stArray[i];
			}
		}
		
		System.out.println("//////////////////////Youngest Student");
		st.printStudent();
	
}

	public void highestGPA(Student[] stArray){
		Student st = stArray[0];
		for(int i = 0; i < stArray.length;i++){
			if(stArray[i].getGPA() > st.getGPA()){
				st = stArray[i];
			}
		}
		
		System.out.println("//////////////////////Highest GPA");
		st.printStudent();
	}
	
	public void classHolders(Student[] stArray){
		System.out.println("//////////////////////classHolders");
		for(int i = 0; i < stArray.length;i++){
			if(stArray[i].getGPA() > 3.0){
				stArray[i].printStudent();
			}
		}
		
	}
	
	public void search(Student[] stArray,int regNo){
		System.out.println("//////////////////////Search " + regNo);
	
		for(int i = 0; i < stArray.length;i++){
			if(stArray[i].getRegNo() == regNo){
				stArray[i].printStudent();
			}
		}
	}
}

class stuDemo{
	public static void main(String args[]){
		Student st01 = new Student("jane Doe",22,1001,4.0);
		StudentArrayOps sops = new StudentArrayOps();
		st01.printStudent();
		
		Student[] student = new Student[10]; 
		
		student[0] = new Student("John Doe",22,1001,4.0);
		student[1] = new Student("Alice",20,1002,2.0);
		student[2] = new Student("Mike",19,1003,1.0);
		student[3] = new Student("Scott",13,1004,3.5);
		student[4] = new Student("Mack",18,1005,3.2);
		student[5] = new Student("Peter",22,1006,1.0);
		student[6] = new Student("Kate",24,1007,2.4);
		student[7] = new Student("Jess",25,1008,3.2);
		student[8] = new Student("Henry",18,1009,4.0);
		student[9] = new Student("Bishop",12,1010,1.2);
		
		sops.printArray(student);
		sops.oldestStudent(student);
		sops.youngestStudent(student);
		sops.highestGPA(student);
		sops.search(student,1003);
	}
}