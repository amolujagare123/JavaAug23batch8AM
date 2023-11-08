package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArraylistDemo6 {

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

        System.out.println("al="+al);

        ArrayList<Integer> al2 = new ArrayList<>();

        al2.add(11);
        al2.add(22);
        al2.add(33);

        System.out.println("al2="+al2);

        al2.addAll(al);
        System.out.println("al2="+al2);







    }
}
