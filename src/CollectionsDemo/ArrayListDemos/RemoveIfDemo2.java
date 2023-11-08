package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;

public class RemoveIfDemo2 {

    public static void main(String[] args) {

       ArrayList<Integer> al = new ArrayList<>();

        al.add(12);
        al.add(13);
        al.add(32);
        al.add(16);
        al.add(43);
        al.add(52);
        al.add(61);
        al.add(72);

        System.out.println("al="+al);

        // remove odd numbers

        al.removeIf( a -> a%2 != 0);
        System.out.println("al="+al);






    }
}
