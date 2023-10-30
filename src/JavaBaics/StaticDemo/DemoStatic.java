package JavaBaics.StaticDemo;

import FinalNStatic.Student2;

import static FinalNStatic.Student2.*;



import java.util.Date;

public class DemoStatic {


    public static void main(String[] args) {
        Student2.college = "xyz";

        college = "xyz";
       staticMethod1();
       staticMethod2();
       
        // Date date = new Date();
    }
}
