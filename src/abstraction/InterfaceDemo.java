package abstraction;

public interface InterfaceDemo {

    void run();
    void start();

    static void method1()
    {
        System.out.println("method 1");
    }

    default void method2()
    {
        System.out.println("method 2");
    }

    private void method3()
    {
        System.out.println("method 3");
    }
}

class ChildInterface implements InterfaceDemo
{
    public void run()
    {
        System.out.println("This is run");
    }

    public void start()
    {
        System.out.println("This is run");
    }
}
