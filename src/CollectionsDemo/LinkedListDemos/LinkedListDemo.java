package CollectionsDemo.LinkedListDemos;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> ll =new LinkedList<>();

        ll.add("Romit");
        ll.add("Rashmi");
        ll.add("Sneha");
        ll.add("Shubham");
        ll.add("Chandu");
        ll.add("Uma");
        ll.add("Ishan");
        ll.add("Vijay");

        System.out.println(ll);
        ll.addFirst("First");
        ll.addLast("Last");
        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
