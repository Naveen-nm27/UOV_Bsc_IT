import java.util.Stack;

class Demo {
    public void converterb16(int num, int base) {
        Stack<Integer> stack = new Stack<>();

        while (num > 0) {
            stack.push(num % base);
            num = num / base;
        }

        char[] arr = {'A', 'B', 'C', 'D', 'E', 'F'};
        String base16 = "";
        while (!stack.isEmpty()) {
            int digit = stack.pop();

            if (digit >= 0 && digit < 10)
                base16 = base16 + digit;
            else
                base16 = base16 + arr[digit - 10];
        }
        System.out.println(base16);
    }
}

public class App {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.converterb16(15, 16);
		demo.converterb16(256,16);
    }
}
