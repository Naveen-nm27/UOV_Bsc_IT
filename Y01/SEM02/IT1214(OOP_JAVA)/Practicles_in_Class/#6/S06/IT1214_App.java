class Student{
	int marks;
	String name;
	
	Student(){
		System.out.println("Createing a Student Object");
		name="Default Name";
	}
	
	Student(String n,int m){
		System.out.println("Name of thr Student is : " + n + " Marks of S02 is : " + m);	
	}
}

class Printer{
	void print(String s){
		System.out.println(s);
	}
}

class App{
	public static void main(String[] args){
		Printer p=new Printer();

		System.out.println("Wllcome to demo class App");
		
		Student S01=new Student("Alice",100);
		/*System.out.println("Name of the Student S01 is : " + S01.name + " Marks of S01 is: " + S01.marks);
		S01.name="naveen";
		S01.marks=85;
		System.out.println("Name of the Student S01 is : " + S01.name + " Marks of S01 is: " + S01.marks);*/

		//Student S02=new Student();
		//S02.name="Hatter";
		//S02.marks=75;
		
		Student S02=new Student("Hatter",75);
		//System.out.println("Name of thr Student S02 is : " + S02.name + " Marks of S02 is : " + S02.marks);
	}
}