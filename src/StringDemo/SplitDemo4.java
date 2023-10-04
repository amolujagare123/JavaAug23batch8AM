package StringDemo;

public class SplitDemo4 {
    public static void main(String[] args) {

        String str = "it is the matter of his terrace issue which is accepted";
        String[] stArr = str.split("is");

        for (int i=0;i< stArr.length ; i++)
            System.out.println(stArr[i]);
    }
}
