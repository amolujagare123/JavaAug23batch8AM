package abstraction;

public interface InterfaceDemo2 {
    void run();
    void start();
    void display();
    static void method1()
    {
        System.out.println("method 1");
    }

    static void method2()
    {
        System.out.println("method 2");
    }
}

interface AnotherInterface
{
    void display();
    static void method2()
    {
        System.out.println("method 2");
    }
}

class ChildInterface2 implements InterfaceDemo2,AnotherInterface
{

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void display() {
        System.out.println("display");
    }
}
