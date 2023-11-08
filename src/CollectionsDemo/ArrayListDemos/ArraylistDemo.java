package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArraylistDemo {

    public static void main(String[] args) {

       ArrayList<Integer> al = new ArrayList<>();

        al.add(12);
        al.add(13);
        al.add(32);
        al.add(32);
        al.add(52);
        al.add(52);
        al.add(52);
        al.add(52);
      /*  al.add("text");
        al.add(52.89);
        al.add('g');
        al.add("dsds");
        al.add('g');
        al.add(true);*/

        al.remove(new Integer(32));

       // System.out.println(al);


        ArrayList<String> al1 = new ArrayList<>();
        al1.add("text");
        al1.add("dsds"); // remove

        al1.remove("dsds");
    }
}
