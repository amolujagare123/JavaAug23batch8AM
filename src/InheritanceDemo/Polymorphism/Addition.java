package InheritanceDemo.Polymorphism;

public class Addition {
    int a;
    int b;
    void add()
    {
        int c;
        c = a + b;
        System.out.println("c="+c);
    }

    void add(int a)
    {
        int c;
        c = a + b;
        System.out.println("c="+c);
    }



    void add(int a,int b)
    {
        int c;
        c = a + b;
        System.out.println("c="+c);
    }

    void add(int a,int b,int x)
    {
        int c;
        c = a + b + x;
        System.out.println("c="+c);
    }

    void add(double a,double b)
    {
        double c;
        c = a + b;
        System.out.println("c="+c);
    }


    void add(String a,String b)
    {
        String c;
        c = a + b;
        System.out.println("c="+c);
    }
    public static void main(String[] args) {

        Addition ob =new Addition();
        ob.add();

        ob.b = 23;
        ob.add(100);
        ob.add(100,300);
        ob.add(100,150,211);
        ob.add(10.230,11.300);
        ob.add("Name=","Krupa");



    }
}
