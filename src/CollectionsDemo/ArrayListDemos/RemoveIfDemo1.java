package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;

public class RemoveIfDemo1 {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("Romit");
        al.add("Rashmi");
        al.add("Sneha");
        al.add("Shubham");
        al.add("Chandu");
        al.add("Uma");
        al.add("Ishan");
        al.add("Vijay");

        System.out.println(al);

        // remove elements with name starting with 'S'

       // al.removeIf(str -> str.charAt(0)=='S');
        // remove elements whose length is less than or equal to 5

        al.removeIf(str -> str.length()<=5);

        System.out.println(al);

    }
}
