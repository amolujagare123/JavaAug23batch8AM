package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArraylistDemo5 {

    public static void main(String[] args) {

       ArrayList<Integer> al = new ArrayList<>();

        al.add(12);
        al.add(13);
        al.add(32);
        al.add(16);
        al.add(42);
        al.add(52);
        al.add(62);
        al.add(72);

        System.out.println(al);

        al.set(5,100);
        System.out.println(al);




    }
}
