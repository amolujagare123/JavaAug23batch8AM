package StringDemo;

public class StringPatternDemo2 {
    public static void main(String[] args) {
        String str = "YASHWANT" ;
       for (int i=0;i<str.length();i++)
        System.out.println(str.substring(i) +  str.substring(0,i) );

        /*String str1 = "ISHAN" ;
        System.out.println(str1.substring(0) +  str.substring(0,0) );
        System.out.println(str1.substring(1) +  str.substring(0,1) );
        System.out.println(str1.substring(2) +  str.substring(0,2) );
        System.out.println(str1.substring(3) +  str.substring(0,3) );*/


    }
}
