package Arrays;

public class DoubleIntDemo {

    public static void main(String[] args) {

        double[] a = new double[5];

        a[0] = 8.9;
        a[1] = 1.9;
        a[2] = 8.1;
        a[3] = 2.9;
        a[4] = 8.2;

        //System.out.println(a[3]);

        int l = a.length;
        System.out.println("l="+a.length);
        for (int i =0;i<5;i++)
        {
            System.out.println(a[i]);
        }

        for (int i =0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        for (double y:a) // a[i]
        {
            System.out.println(y);
        }

    }
}
