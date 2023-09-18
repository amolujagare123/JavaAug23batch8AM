package JavaBaics;

import java.util.Scanner;

public class Addition2 {

    public static void main(String[] args) {
        int a ;
        int b ;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a=");
        a = sc.nextInt();

        System.out.println("Enter b=");
        b = sc.nextInt();

        int c;
        c = a + b;

        System.out.println("JavaBaics.Addition=" + c);

    }
}
