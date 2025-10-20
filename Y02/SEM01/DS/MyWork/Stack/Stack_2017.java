import java.util.Scanner;
public class Stack_2017 
{
int maxSize,top=-1;
int stackArray[];
		
Stack_2017 (int size)
{
    maxSize=size;
    stackArray =new int [maxSize] ;      
}
	 
public void push(int x)
{
if(isFull())
    {
	System.out.println("the stack is full");
    }
 else
  { 
	stackArray[++top]=x;
  }
}
  
public int pop()
{
 int temp=-1;
    if(isEmpty())
        System.out.println("the stack is Empty" );
    else
        {
	temp=stackArray[top];
        top--;
	}
    return temp;
}
public int peek()
	{
		return stackArray[top];
	} 
	
public boolean isFull()
{ 
	return top==maxSize-1; 
}
	
	
public boolean isEmpty()
{ 
	return top==-1; 
}
	
public void displayS()
    { 
	for(int i=0;i<=top;i++)
	{
		System.out.print(stackArray[i]+" ");
	}
        	
    }
	
	public static void main(String[] args) 
	{
        Stack_2017 s1 = new Stack_2017(10); 
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) 
		{
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number < 0) 
			{
                if (s1.isEmpty()) 
				{
                    System.out.println("Stack is empty, nothing to pop.");
                    break;
                } 
				else if (s1.top < 4) 
				{
                    System.out.println("Error: Less than five numbers in the stack.");
                    break;
                } 
				else 
				{
                    System.out.println("Popping and printing 5 numbers:");
                    for (int i = 0; i < 5; i++) 
					{
                        System.out.println(s1.pop());
                    }
                }
            } 
			else 
			{
                s1.push(number);
            }
        }

        if (!s1.isEmpty()) 
		{
            System.out.println("Remaining numbers in the stack:");
            s1.displayS();
        }
    }


 }








    