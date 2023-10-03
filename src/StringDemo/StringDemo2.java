package StringDemo;

public class StringDemo2 {
    public static void main(String[] args) {
        String str = "This is a Java Program" ;
        System.out.println(str.substring(3));

        /*substring(beginIndex,endIndex) :
        this will return a string starting with
        beginIndex and ending with endIndex.
Note :
1. beginIndexindex character is inclusive
2. endIndex character is not inclusive
*/
        System.out.println(str.substring(5,11));

    }
}
