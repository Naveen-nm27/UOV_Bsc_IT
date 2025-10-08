import java.util.*;
class ParenthesesEvaluation
{
	static boolean isCorrect(String equ)
	{
		boolean result=true;
		Stack<Character> cs = new Stack<>();

		for(int i=0;i<equ.length();i++)
		{
			char p=equ.charAt(i);
			switch(p)
			{
				case '{' :
				case '[' :
				case '(' :
							cs.push(p);
							break;
				case '}' :
				case ']' :
				case ')' :
							if(!(cs.isEmpty()))
							{
								char e=cs.pop();
								if((e=='{' && p!='}') || (e=='[' && p!=']') || (e=='(' && p!=')'))
								{
									result=false;
									break;									
								}
							}
							else
							{
								result=false;
								break;
							}
							break;
				default :
							break;
			}
		}
		return (result && cs.isEmpty());
	}
	
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Equation : ");
		String equation=sc.nextLine();
		
		if(isCorrect(equation))
			System.out.println("Parentheses nested correctly");
		else
			System.out.println("Parentheses nested wrong");
	}
}