package ExceptionHandling;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] a = new int[5];

        try {

            a[0] = 89;
            a[1] = 19;
            a[2] = 81;
            a[3] = 29;
            a[4] = 82;
       //     a[5] = 82;
        }
       /* catch (Exception e)
        {
            System.out.println("inside catch");
        }*/ catch (ArithmeticException e)
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
        finally {
            System.out.println("finally");
        }

        for (int i =0;i<5;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("End of the program");

    }
}
