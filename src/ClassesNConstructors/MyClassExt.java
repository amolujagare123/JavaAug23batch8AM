package ClassesNConstructors;

public class MyClassExt {

    public int a;
    public double d;
    public char c;
    public String str;

    public void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {
        int x;
        x = 887;

       MyClassExt ob = new MyClassExt();
        ob.a = 89 ;
        ob.d = 89.67 ;
        ob.c = 'i' ;
        ob.str = "Java" ;
        ob.display();

        MyClassExt ob2 = new MyClassExt();
        ob2.a = 100 ;
        ob2.d = 55.55;
        ob2.c = 'a' ;
        ob2.str = "Selenium" ;
        ob2.display();

       /* int y;

        y = 'u';*/
    }

}
