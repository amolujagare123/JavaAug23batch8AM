package ClassesNConstructors.pack2;

import ClassesNConstructors.pack1.Java1;

public class Java3 extends Java1 {


    public static void main(String[] args) {
        Java1 ob = new Java1();
        ob.a = 89 ;
     //   ob.d = 89.67 ;
     //   ob.c = 'i' ; // protected
        ob.str = "Java" ;
        ob.display();


        Java3 j3 = new Java3();
        j3.str ="";
        j3.c = 'j';
    }

}
