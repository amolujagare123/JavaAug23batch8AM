package FinalNStatic;

public class Student2 {
    int rno;
    String name;
    public static String college="ITS";
    void display() // nonstatic
    {
        System.out.println("rno="+rno);// non-static :  allowed
        System.out.println("name="+name);// non-static :  allowed
        System.out.println("college="+college);//static :  allowed
        nonStaticMethod();//static :  allowed
        staticMethod1();//static :  allowed
        staticMethod2();//static :  allowed
    }
    void nonStaticMethod()
    {
        System.out.println("nonStaticMethod");
    }
    public static void staticMethod1() // static
    {
        System.out.println("staticMethod1");
      //  System.out.println("rno="+rno); // non-static : not allowed
      //  System.out.println("name="+name);// non-static : not allowed
        System.out.println("college="+college);// static : allowed
        staticMethod2();// static : allowed
      //  nonStaticMethod();// non-static : not allowed
     //   display();// non-static : not allowed
    }

    public static void staticMethod2()
    {
        System.out.println("staticMethod2");
    }


    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.staticMethod1();
        s1.staticMethod2(); // called using object

        Student2.staticMethod1();
        Student2.staticMethod2();



    }
}
