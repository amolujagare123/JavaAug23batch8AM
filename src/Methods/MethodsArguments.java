package Methods;

public class MethodsArguments {

    void myMethod()
    {
        System.out.println("this is my method");
    }

    void method2(int a)
    {
        System.out.println(a);
        System.out.println("I am inside method 2");
    }
    void method3(int b,int a,int c) // method3(22,56,78)
    {
        System.out.println("a="+a);
        System.out.println("addition="+(b+c));
        System.out.println("I am inside method 3");
    }

    void method4(int a,double d,char c,String str)
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    void arrayMethod1(char[] chr)
    {
        for (char c:chr)
            System.out.print(c+"\t");

        System.out.println();
    }

    void arrayMethod2(String[][] stArr)
    {
        for (int i=0;i<stArr.length;i++) {
            for (int j = 0; j < stArr[0].length; j++)
            {
                System.out.print(stArr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        MethodsArguments ob = new MethodsArguments();
       /* ob.myMethod();
        ob.method2(100);
        ob.method3(23,45,12);*/
       // ob.method4(23,45.67,'f',"text");

        char[] ch = {'a','s','d','f','g','h','j'};

       // ob.arrayMethod1(ch);

        String[][] st = {
                {"Rahul", "Priya", "Amit"},
                {"Anjali", "Vikas", "Neha"},
                {"Suresh", "Meera", "Rajesh"},
                {"Kiran", "Swati", "Sanjay"}
        };

        ob.arrayMethod2(st);

    }
}
