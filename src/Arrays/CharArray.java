package Arrays;

public class CharArray {

    public static void main(String[] args) {
        char[] ch = new char[5];
        ch[0]= 'k';
        ch[1]= 'w';
        ch[2]= 'e';
        ch[3]= 'r';
        ch[4]= 't';

        for (int i=0;i<5;i++)
            System.out.println(ch[i]);

        for (char c:ch)
            System.out.println(c);
    }
}
