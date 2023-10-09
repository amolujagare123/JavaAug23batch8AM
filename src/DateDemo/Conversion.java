package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversion {

    public static void main(String[] args) throws ParseException {
        String str1 = "21/01/1994";
        System.out.println("str1="+str1);
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        Date myDate  = sd.parse(str1);
        System.out.println("myDate="+myDate);

        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd");
        String str2 = sd2.format(myDate);
        System.out.println("str2="+str2);

    }

}
