package JavaBaics;

import java.util.Scanner;

public class Addition3 {

    public static void main(String[] args) {
        double a ;
        double b ;



        Scanner sc = new Scanner(System.in);

       // char c = sc.nextLine().charAt(0);

        System.out.println("Enter a=");
        a = sc.nextDouble();

        System.out.println("Enter b=");
        b = sc.nextDouble();

        double c;
        c = a + b;

        System.out.println("JavaBaics.Addition=" + c);

    }
}
