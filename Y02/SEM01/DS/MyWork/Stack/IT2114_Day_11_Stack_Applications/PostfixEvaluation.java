import java.util.*;

class PostfixEvaluation 
{

    public static void postfixEvaluation() 
	{
        //String input = "23+645*+*1-"; // Postfix expression
		String input = "234+*"; 
        char ch;
        int j, num1, num2, interAns;
        Stack<Integer> cs = new Stack<>(); 

        for (j = 0; j < input.length(); j++) 
		{
            ch = input.charAt(j); 

            if (ch >= '0' && ch <= '9') 
			{
                cs.push(ch - '0');
            } 
			else 
			{
                if (cs.isEmpty()) 
				{
                    System.out.println("Error: Insufficient operands in the stack.");
                    return;
                }

                num2 = cs.pop(); 
                if (cs.isEmpty()) 
				{
                    System.out.println("Error: Insufficient operands in the stack.");
                    return;
                }

                num1 = cs.pop(); 

                switch (ch) 
				{
                    case '+':
                        interAns = num1 + num2;
                        break;
                    case '-':
                        interAns = num1 - num2;
                        break;
                    case '*':
                        interAns = num1 * num2;
                        break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero.");
                            return;
                        }
                        interAns = num1 / num2;
                        break;
                    default:
                        System.out.println("Error: Invalid operator.");
                        return;
                }
                cs.push(interAns);
            }
        }

        if (cs.isEmpty()) 
		{
            System.out.println("Error: Stack is empty after evaluation.");
        } 
		else 
		{
            interAns = cs.pop(); 
            if (!cs.isEmpty()) 
			{
                System.out.println("Error: Too many operands left in the stack.");
            } 
			else 
			{
                System.out.println("The result of the postfix expression is: " + interAns);
            }
        }
    }

    public static void main(String[] args) 
	{
        postfixEvaluation(); 
		
    }
}
