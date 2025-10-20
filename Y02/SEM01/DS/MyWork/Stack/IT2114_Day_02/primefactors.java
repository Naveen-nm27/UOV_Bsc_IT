import java.util.Scanner;

public class primefactors 
{

    int maxSize, top=-1;
    int stackArray[];

    primefactors(int size) 
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
        int temp=-1 ;
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

    public void displayS() 
	{
        for (int i = 0; i <= top; i++) 
		{
            System.out.print(stackArray[i] + " ");
        }
    }

    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its prime factors: ");
        int number = sc.nextInt();
        
     
        primefactors s1 = new primefactors(number);
		

        for (int i = 2; i <= number; i++) 
		{
            while (number % i == 0) 
			{
                s1.push(i);
                number /= i;
            }
        }
	
        System.out.println("Prime factors in descending order:");
        while (!s1.isEmpty()) {
            System.out.print(s1.pop() + " ");
        }
    }
}

