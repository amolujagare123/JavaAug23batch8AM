package ClassesNConstructors.pack1;

public class Java1 {

    public int a;
    double d;
    protected char c;
    public String str;

    public void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        Java1 ob = new Java1();
        ob.a = 89 ;
        ob.d = 89.67 ;
        ob.c = 'i' ;
        ob.str = "Java" ;
        ob.display();
    }

}


