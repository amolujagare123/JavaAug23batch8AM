package Arrays;

public class ArrayIntDemo {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 89;
        a[1] = 19;
        a[2] = 81;
        a[3] = 29;
        a[4] = 82;

        //System.out.println(a[3]);

      /*  for (int i =0;i<5;i++)
        {
            System.out.println(a[i]);
        }*/

        for (int x:a)
        {
            System.out.println(x);

            // print the values by subtracting 5 from it
        }
    }
}
