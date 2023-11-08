package ExceptionHandling;

public class CheckNumber {

    void checkMyNumber(int x)
    {
        if(x>=1 && x<=10)
            System.out.println("we are safe");
        else {

           /* ArithmeticException ar = new ArithmeticException("we are in danger");
            throw ar;*/


            throw new ArithmeticException("we are in danger");
        }
    }

    public static void main(String[] args) {
        CheckNumber ob = new CheckNumber();
        int a = 11;
        System.out.println("start the program");

        ob.checkMyNumber(a);

        System.out.println("a="+a);
        System.out.println("end the program");
    }
}
