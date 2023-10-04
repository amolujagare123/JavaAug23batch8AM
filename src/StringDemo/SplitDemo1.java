package StringDemo;

public class SplitDemo1 {
    public static void main(String[] args) {

        String str = "This is Java Program";
        String[] stArr = str.split(" ");

        for (int i=0;i< stArr.length ; i++)
            System.out.println(stArr[i]);
    }
}
