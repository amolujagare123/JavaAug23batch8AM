package CollectionsDemo.StackDemo;

import java.util.Stack;

public class StackDemo2 {

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();

        s.push("amol");
        s.push("romit");
        s.push("krupa");  //
        s.push("shubham");
        s.push("vijay");
        s.push("sneha");

        System.out.println(s);

        System.out.println(s.search("amol"));

    }
}
