class Paper{
	int length,width;
	String text;
}

class Document{
	String name;
	Paper p;
	
	public static void main (String[] args){
			Document d=new Document();
			System.out.println("Created a Document Object d");
			d.name = "My First Document";
			System.out.println("Name of the Document d is : " + d.name);
			d.p=new Paper();
			//Set the length and width of the paper object p and
			
			d.p.length = 75;
			d.p.width = 25;
			d.p.text = ("Hello World");
			
			System.out.println("Size (l * w ) of the paper the document d is " + d.p.length + "*" + d.p.width);
			System.out.println("This is the text in the paper of the document: " + d.p.text);
			
			/*
			Document d2=new Document();
			System.out.println("Created a object d2");
			
			d2.name = "My Second Documnet";
			System.out.println("Name of my Second Document is : "+d2.name);
			
			Documnet d2=new Document();
			System.out.println("Creted document object d2");
			
			d2.name = "My Second Document";
			System.out.println("Name of the Document d2 is :" + d2.name);
			
			
			d2.p=new Paper();*/
			
	}
}