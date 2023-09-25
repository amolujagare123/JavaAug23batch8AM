package loops;

public class IncrementDecrementDemo2 {
    public static void main(String[] args) {
       // Post operators( i++,i-- ) :
        // here first the statement is executed
        // then increment / decrement happens
       // Pre operators(++i,--i ) :
        // here first the increment / decrement happens
        // then the statement is executed
        int i= 10;
        System.out.println(i); // 10
        System.out.println(i--); // 10
        System.out.println(i); // 9
        System.out.println(--i);// 8
        System.out.println(i);// 8


    }
}
