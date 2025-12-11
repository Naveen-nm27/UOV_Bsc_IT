public class Printer <T>{
    T input;
    public void printer(T input){
        System.out.println(input);
    }
}

class Demo_2{
    public static void main(String[] args){
        Printer<Object> printer = new Printer<>();
        
        printer.printer("HEllO");
}
}
