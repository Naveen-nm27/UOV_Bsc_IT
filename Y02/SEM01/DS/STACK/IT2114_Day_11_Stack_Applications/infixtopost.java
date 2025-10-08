import java.util.*;

class infixtopost {
    private int maxSize, top;
    private char[] stackArray;

    infixtopost(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    void push(char dataElement) {
        if (isFull()) {
            System.out.println("Stack overflow");
        } else {
            stackArray[++top] = dataElement;
        }
    }

    char pop() {
        if (isEmpty()) {
            return 0;
        }
        return stackArray[top--];
    }

    char peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else
            return 0;
    }

    boolean isFull() {
        return top == maxSize - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    static int Prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an infix expression:");
        String exp = scan.nextLine();

        infixtopost ob = new infixtopost(20); // Create stack with sufficient size
        String result = ""; // Initialize the result string

        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);

            // If the scanned character is an operand, add it to output.
            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
   
               
                result += c;
            }

            // If the scanned character is an '(', push it to the stack.
            else if (c == '(') {
                ob.push(c);
            }

            // If the scanned character is a ')', pop until '(' is encountered.
            else if (c == ')') {
                while (!ob.isEmpty() && ob.peek() != '(') {
                    result += ob.pop();
                }
                ob.pop(); // Discard the '('
            }

            // If an operator is encountered
            else {
                while (!ob.isEmpty() && ob.Prec(c) <= ob.Prec(ob.peek())) {
                    result += ob.pop();
                }
                ob.push(c);
            }
        }
		
        // Pop all remaining operators from the stack
        while (!ob.isEmpty()) {
            result += ob.pop();
        }

        System.out.println("Postfix expression: " + result);
	}   
}
