package abstraction;

public abstract class AbstractClassDemo {
    abstract void run();
    abstract void start();
    void display()
    {
        System.out.println("This is display");
    }
}

class ChildAbstract extends AbstractClassDemo
{
    void run()
    {
        System.out.println("This is run");
    }

    void start()
    {
        System.out.println("This is run");
    }

    public static void main(String[] args) {

        AbstractClassDemo ob = new ChildAbstract();
        ob.run();
        ob.start();
        ob.display();
    }
}
