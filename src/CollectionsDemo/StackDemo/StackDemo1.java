package CollectionsDemo.StackDemo;

import java.util.Stack;

public class StackDemo1 {

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();

        s.push("amol");
        s.push("romit");
        s.push("krupa");
        s.push("shubam");
        s.push("vijay");
        s.push("sneha");

        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
    }
}
