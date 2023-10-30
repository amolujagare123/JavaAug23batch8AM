package ExceptionHandling;

public class ArithmeticOperation {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int c = 0 ;

        try {
            c = a / b;
        }
        catch (ArithmeticException e)
        {
            System.out.println("in ArithmeticException catch block");
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            e.printStackTrace();
        }
        catch (Exception e)
        {
            System.out.println("in  Exception catch block");
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            e.printStackTrace();
        }

        System.out.println("c="+c);
        System.out.println("End of the program");
    }
}
