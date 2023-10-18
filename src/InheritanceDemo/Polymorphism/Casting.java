package InheritanceDemo.Polymorphism;

public class Casting {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        double c = (double) a/b; // type casting
        // if you want to store one type of value into another type
        // use that type with round brackets in font of the value to be stored
        // note : prefer to make type casting in similar category of data type
        // primitive / non - primitive

        System.out.println("c="+c);

    }
}
