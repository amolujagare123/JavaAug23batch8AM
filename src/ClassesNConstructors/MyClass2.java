package ClassesNConstructors;

public class MyClass2 {

    int a;
    double d;
    char c;
    String str;

  /*  MyClass2()
    {
       // empty constructor
    }*/
  MyClass2()
  {
      a = 200;
      d =44.3;
      c = 'a';
      str = "class name";
  }
    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {


       MyClass2 ob = new MyClass2();

       ob.display();





    }

}
