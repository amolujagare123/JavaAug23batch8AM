package StringDemo;

public class SplitDemo51 {
    public static void main(String[] args) {

        String str = "Hey baby you are so lovely";
        String[] stArr = str.split(" ");

        // print the words that ends with 'y'

        for (int i=0;i< stArr.length ; i++) {

            if(stArr[i].endsWith("y"))
                System.out.println(stArr[i]);
        }

        /* solution :     .
        1. Get individual string by split - stArr[i]
        2. individual string length
        3. index of last character - l-1
        4. if ( stArr[i].charAt(l-1)=='y' )
         */
    }
}
