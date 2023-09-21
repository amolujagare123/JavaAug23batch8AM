package ControlStructure;

public class ArithmethocOpertionUsingIf {

    public static void main(String[] args) {

        int a = 100;
        int b = 20;
        int c;
        String operation = "add";

        if(operation.equals("add"))
        {
            c = a + b;
            System.out.println("c="+c);
        }
        if(operation.equals("sub"))
        {
            c = a - b;
            System.out.println("c="+c);
        }
        if(operation.equals("mult"))
        {
            c = a * b;
            System.out.println("c="+c);
        }
        if(operation.equals("div"))
        {
            c = a / b;
            System.out.println("c="+c);
        }



    }
}
