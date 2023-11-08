package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo3 {

    public static void main(String[] args) {

       ArrayList<Integer> al = new ArrayList<>();

        System.out.println(al.isEmpty()); // true
        al.add(12);
        al.add(13);
        al.add(32);
        al.add(16);
        al.add(42);
        al.add(52);
        al.add(62);
        al.add(72);
        System.out.println(al.isEmpty()); // false

        System.out.println(al);
        al.remove(4);
        System.out.println(al);
        al.remove(new Integer(32));
        System.out.println(al);


    }
}
