package ClassesNConstructors;

public class MyClass {

    int a;
    double d;
    char c;
    String str;

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {
        int x;
        x = 887;

       MyClass ob = new MyClass();
        ob.a = 89 ;
        ob.d = 89.67 ;
        ob.c = 'i' ;
        ob.str = "Java" ;
        ob.display();

        MyClass ob2 = new MyClass();
        ob2.a = 100 ;
        ob2.d = 55.55;
        ob2.c = 'a' ;
        ob2.str = "Selenium" ;
        ob2.display();

       /* int y;

        y = 'u';*/
    }

}
