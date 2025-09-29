class Rectangle {
	
	int height;
	int width;
	
	//Rectangle(int h, int w){
	Rectangle(int height, int width){
		this.height=height;
		//height = h;
		this.width=width;
		//width = w;
		System.out.println("just created a Rectangle object with (h*w) " + height + "*" + width); 
		print(width,height);
	}
	
	
	static void print(int width, int height){
		
		for(int i=0; i<height; i++){
				for(int j=0; j<width;j++){
					System.out.print("* ");
				}
				System.out.println();
			}
			/*
			for(int i=0; i<height;i++){
				System.out.print(" ");
				for (int j=0; j <width; j++){
					System.out.print("* ");
				}
				System.out.println();
			}
			*/
	}
	
}

class Main{
	public static void main(String[] args){
		
		/*for(int i=0; i<10; i++){
			System.out.println("Value of i is " + i);
		
		}*/
		
			Rectangle r0=new Rectangle(3,5);
			Rectangle r1=new Rectangle(5,7);
			Rectangle r2=new Rectangle(7,9);
			
			Rectangle r4=new Rectangle(11,13);
			
			
			//you can assigne a new object the value of a alredy created object
			Rectangle r3=r1;
			
			System.out.println("Height " + r1.height + " , Width " + r1.width);
			
			
			//r1.print(3,4);
			
			//r1.print(7,8);
	
	}
		
}

