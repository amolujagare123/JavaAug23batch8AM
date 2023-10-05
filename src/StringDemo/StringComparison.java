package StringDemo;

public class StringComparison {
    public static void main(String[] args) {

        /*int i =10 ;
        int j =10;
        System.out.println(i==j);*/

        String str1 = "shalini";
        String str2 = "shalini";
        String str3 = "yash";
        String str4 = "Shalini";
        String str5 = new String("shalini");
        String str6 = new String("shalini");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str4));
        System.out.println(str1.equalsIgnoreCase(str5));
        System.out.println(str1.equals(str5));

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str5);

        System.out.println(str6==str5);


    }
}
