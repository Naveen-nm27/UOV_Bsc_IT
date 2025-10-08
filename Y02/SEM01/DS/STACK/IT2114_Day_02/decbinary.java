import java.util.Scanner;

public class decbinary 
{

    int maxSize, top=-1;
    int stackArray[];

    decbinary(int size) 
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
            temp = stackArray[top];
            top--;
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

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
		
        int number = sc.nextInt();
	
	decbinary stack=new decbinary(32);
		
        while (number > 0) 
	{
            int remainder = number % 2;
            stack.push(remainder);
            number /= 2;
        }

        System.out.print("Binary representation: ");
        while (!stack.isEmpty()) 
	{
            System.out.print(stack.pop());
        }
        System.out.println();
    }
    }

