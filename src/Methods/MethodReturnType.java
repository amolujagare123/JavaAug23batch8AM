package Methods;

import ClassesNConstructors.MyClassExt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodReturnType {

    Date conversion(String str1) throws ParseException {

        System.out.println("str1="+str1);
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        Date myDate  = sd.parse(str1);
        System.out.println("myDate="+myDate);
        return myDate;

    }

    double[] getMyArray()
    {
        double[] d = {23.56,11.23,32.45,55.63,56.11,24.67};


        return d;
    }


    MyClassExt getMyLoadedObject()
    {
        MyClassExt obj = new MyClassExt();
        obj.a = 89 ;
        obj.d = 89.67 ;
        obj.c = 'i' ;
        obj.str = "Java" ;

        return obj;
    }

    String[][] getAllValues()
    {
        String[][] st = {
                {"Rahul", "Priya", "Amit"},
                {"Anjali", "Vikas", "Neha"},
                {"Suresh", "Meera", "Rajesh"},
                {"Kiran", "Swati", "Sanjay"}
        };

        return  st;
    }


    int method()
    {
        int a  = 67;
        return a;
    }

    char method2()
    {
        char a  = 67;
        return a;
    }

    String getMyString()
    {
        String str = "This is the string";
        return str;
    }


    public static void main(String[] args) throws ParseException {
        MethodReturnType ob = new MethodReturnType();
      /*  int a;
        a = 10 ;
        System.out.println("a="+a);
        int x = a;
        System.out.println("x="+x);

        MethodReturnType ob = new MethodReturnType();

        int methodValue = ob.method(); // --> 67
        System.out.println("ob.method()="+ob.method());
        System.out.println("methodValue="+methodValue);

        System.out.println(ob.getMyString());
        System.out.println("char="+ob.method2());

        System.out.println(ob.conversion("21/09/1990"));

        double[] myDoubleArray = ob.getMyArray();
        for (double dd:myDoubleArray)
            System.out.print(dd+"\t");
        System.out.println();

        String[][] stArr =ob.getAllValues();

        for (int i=0;i<stArr.length;i++) {
            for (int j = 0; j < stArr[0].length; j++)
            {
                System.out.print(stArr[i][j]+"\t");
            }
            System.out.println();
        }
        */
        MyClassExt myClassExt = new MyClassExt();
        myClassExt.display(); // default;

        myClassExt = ob.getMyLoadedObject();

        myClassExt.display();

    }
}
