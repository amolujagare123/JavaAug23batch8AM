package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo2 {

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


        System.out.println(al.get(4));

        System.out.println(al.size());

        System.out.println("using for loop...");
        for(int i =0; i<al.size();i++)
        {
            System.out.println(al.get(i));
        }
        System.out.println("using for each loop...");

        for(int x:al)
        {
            System.out.println(x);
        }

        System.out.println("using Iterator...");

        Iterator itr = al.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("Before Clearing="+al);
        al.clear();
        System.out.println("After Clearing="+al);
    }
}
