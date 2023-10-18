package InheritanceDemo.Polymorphism;

public class Employee {

    Employee()
    {
        System.out.println("inside employee constructor");
    }

    Employee(int id)
    {
        System.out.println("id="+id);
        System.out.println("inside employee constructor");
    }

    int salary = 45000;
    void empWork()
    {
        System.out.println("put attendance");
    }

      void calculateSalary()
    {
        int days = 28;
        int sal = 1500 * 28;
        System.out.println("Emp Salary="+salary);
    }
}

class Programmer extends Employee
{
    Programmer()
    {
       // super(234);
        System.out.println("inside programmer constructor");
    }
   int salary = 66550;
   int bonus = 25000;

    void calculateSalary()
    {   int salary = 250;
        int days = 28;
       // int sal = 2000 * 28;
        System.out.println("Programmer Salary="+salary);
        System.out.println("Programmer Salary="+this.salary);
        System.out.println("Programmer Salary="+super.salary);
    }
   void programmerWork()
   {
       System.out.println("coding ..... ");
       System.out.println("salary="+salary);
       System.out.println("salary="+super.salary);
       calculateSalary();
       super.calculateSalary();
   }

    public static void main(String[] args) {

        Programmer p = new Programmer();

        Programmer p1; // object reference

        System.out.println(p.bonus);
        p.programmerWork();
        p.calculateSalary();

        Employee emp = new Programmer(); // upcasting

        emp.calculateSalary();

    }
}
