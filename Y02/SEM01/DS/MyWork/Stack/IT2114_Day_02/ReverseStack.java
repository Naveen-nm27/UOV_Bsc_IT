import java.util.Scanner;

public class ReverseStack 
{

    int maxSize, top=-1;
    int stackArray[];

    ReverseStack(int size) 
	{
        maxSize = size;
        stackArray = new int[maxSize];
    }

    public void push(int x) 
	{
        if (isFull()) 
		{
            System.out.println("The stack is full");
        } 
		else 
		{
            stackArray[++top] = x;
        }
    }

    public int pop() 
	{
        int temp = -1;
        if (isEmpty()) 
		{
            System.out.println("The stack is empty");
        } 
		else 
		{
            temp = stackArray[top--];
        }
        return temp;
    }

    public boolean isFull() 
	{
        return top == maxSize - 1;
    }

    public boolean isEmpty() 
	{
        return top == -1;
    }
	
	public void displayS() 
	{
        for (int i = 0; i <= top; i++) 
		{
            System.out.print(stackArray[i] + " ");
        }
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
	
        ReverseStack s1 = new ReverseStack(10);
        ReverseStack s2 = new ReverseStack(10);

        System.out.println("Enter 5 elements to push into the stack:");

        for (int i = 0; i < 5; i++) 
		{
            int element = sc.nextInt();
            s1.push(element);
        }
		s1.displayS();
        while (!s1.isEmpty()) 
		{
            s2.push(s1.pop());
        }
		

		System.out.println("");
		s2.displayS();
		
    }
}
