package ControlStructure;

public class ArithmethocOpertionUsingSwitch {

    public static void main(String[] args) {

        int a = 100;
        int b = 20;
        int c;
        String operation = "div";

        switch (operation)
        {
            case "add" : c = a + b;
                System.out.println("Addition="+c);
                break;
            case "sub" : c = a - b;
                System.out.println("Subtraction="+c);
                break;
            case "mult" : c = a * b;
                System.out.println("Multiplication="+c);
                break;
            case "div" : c = a / b;
                System.out.println("division="+c);
                break;
            default:
                System.out.println("wrong choice");
                break;
        }




    }
}
