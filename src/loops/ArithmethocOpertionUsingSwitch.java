package loops;

import java.util.Scanner;

public class ArithmethocOpertionUsingSwitch {

    public static void main(String[] args) {

        int a;
        int b ;
        int c;
        String operation  ;
        String choice  ;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a : ");
        a = sc.nextInt();
        System.out.println("enter b : ");
        b = sc.nextInt();



        do {
            System.out.println("enter Operation : ");
            operation = sc.nextLine();

            switch (operation) {
                case "add":
                    c = a + b;
                    System.out.println("Addition=" + c);
                    break;
                case "sub":
                    c = a - b;
                    System.out.println("Subtraction=" + c);
                    break;
                case "mult":
                    c = a * b;
                    System.out.println("Multiplication=" + c);
                    break;
                case "div":
                    c = a / b;
                    System.out.println("division=" + c);
                    break;

            }


            System.out.println("Do you wnat to contine (Y/N) ? :");
            choice= sc.nextLine();
        }while (operation.equalsIgnoreCase("y"));


    }
}
