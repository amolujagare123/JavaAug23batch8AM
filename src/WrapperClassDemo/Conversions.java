package WrapperClassDemo;

public class Conversions {

    public static void main(String[] args) {

        String str1 = "11";
        String str2 = "22";
        System.out.println(str1+str2);

        int a1 = Integer.parseInt(str1);
        Integer a2 = Integer.parseInt(str2); //--> 22

        System.out.println(a1 + a2);

        String str3 = "11.34";
        String str4 = "55.34";
        System.out.println(str3 + str4);

        double d1 = Double.parseDouble(str3);
        double d2 = Double.parseDouble(str4);
        System.out.println(d1 + d2);

        float f1 = Float.parseFloat(str3);
        float f2 = Float.parseFloat(str4);
        System.out.println(f1 + f2);

        String str = "false";

        boolean b = Boolean.parseBoolean(str);

        if (b)
            System.out.println("this is true");
        else
            System.out.println("this is false");

        String str6 = "k";

        char c = str6.charAt(0);

        System.out.println(c);

    }
}
