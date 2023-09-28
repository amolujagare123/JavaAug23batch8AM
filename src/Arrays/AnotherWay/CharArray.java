package Arrays.AnotherWay;

public class CharArray {

    public static void main(String[] args) {
        char[] ch = {'g','h','j','o'};

        for (int i=0;i<ch.length;i++)
            System.out.println(ch[i]);

        for (char c:ch)
            System.out.println(c);
    }
}
