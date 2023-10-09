package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {
    public static void main(String[] args) throws ParseException {

        String dateStr = "06-02-1985";
        System.out.println("dateStr="+dateStr);
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
        Date date = sd.parse(dateStr);
        System.out.println(date);

        String dateStr0= "23-June-2016" ;
        //→  dd-MMMM-yyyy
        System.out.println("dateStr0="+dateStr0);
        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");
        Date date0 =sd0.parse(dateStr0);
        System.out.println("date0="+date0);

        String dateStr1= "23 | June 16  8:34";
        //→ dd | MMMM yy hh:mm
        System.out.println("dateStr1="+dateStr1);
        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        Date date1 =sd1.parse(dateStr1);
        System.out.println("date1="+date1);

        String dateStr2= "2016-06-23 | 8:34:23";
        //→ yyyy-MM-dd | hh:mm:ss

        String dateStr3= "Thursday 2016/06/23";
        //→ EEEE yyyy/MM/dd

        String dateStr4= "23-06-2016 | thu | 8:34";
        // dd-MM-yyyy | EEE | hh:mm

        String dateStr5= "8:34:22" ;
        // → hh:mm:ss

    }
}
