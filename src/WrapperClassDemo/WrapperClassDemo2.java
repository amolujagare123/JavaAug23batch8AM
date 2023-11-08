package WrapperClassDemo;

public class WrapperClassDemo2 {
    public static void main(String[] args) {

        Integer ii1 = new Integer(5);
        int i1 = ii1.intValue(); // unboxing / unwrapping
        System.out.println("ii1="+ii1);
        System.out.println("i1="+i1);

        int i2 = ii1; // auto unboxing / auto unwrapping
        System.out.println("i2="+i2);
    }
}
