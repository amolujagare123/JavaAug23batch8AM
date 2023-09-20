package ControlStructure;

public class Marks {

    public static void main(String[] args) {

        int marks = 77;

        if(marks<40)
            System.out.println("Fail");

        else if (marks>=40 && marks<50)
            System.out.println("Pass");

        else if (marks>=50 && marks<60)
            System.out.println("Second Class");

        else if (marks>=60 && marks<70)
            System.out.println("First Class");

        else if (marks>=70)
            System.out.println("Distinction");




    }

}
