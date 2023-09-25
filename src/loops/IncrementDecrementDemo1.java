package loops;

public class IncrementDecrementDemo1 {
    public static void main(String[] args) {
       // Post operators( i++,i-- ) :
        // here first the statement is executed
        // then increment / decrement happens
       // Pre operators(++i,--i ) :
        // here first the increment / decrement happens
        // then the statement is executed
        int i= 10;
        System.out.println(i); // 10
        System.out.println(i++); // 10
        System.out.println(i); // 11
        System.out.println(++i);//12
        System.out.println(i);// 12


    }
}
