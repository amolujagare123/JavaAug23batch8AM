package CollectionsDemo.ArrayListDemos;

import java.util.ArrayList;

public class ArraylistDemo4 {

    public static void main(String[] args) {

       ArrayList<String> al = new ArrayList<>();

        al.add("text");
        al.add("dsds1");
        al.add("dsds2");
        al.add("dsds3");
        al.add("dsds4");

        System.out.println(al);
        al.remove(2);
        System.out.println(al);
        al.remove("adds3");
        System.out.println(al);


    }
}
