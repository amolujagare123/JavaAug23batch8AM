package ClassesNConstructors;

public class MyClass4 {

    int a;
    double d;
    char c;
    String str;


  MyClass4(int a, double d, char c, String str)
  {
      this.a = a;
      this.d = d;
      this.c = c;
      this.str = str;
  }
    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {


       MyClass4 ob = new MyClass4(12,23.89,'f',"text");

       ob.display();





    }

}
