package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadOperation {

    public static void main(String[] args) throws FileNotFoundException {

     //   try {
            FileInputStream fis = new FileInputStream("D:\\amol.txt1");
       /* }
        catch (FileNotFoundException e) {
            System.out.println("inside catch");
        }*/

        System.out.println("End of the program");
    }
}
