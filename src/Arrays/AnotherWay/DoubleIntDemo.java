package Arrays.AnotherWay;

public class DoubleIntDemo {

    public static void main(String[] args) {

        double[] a = {23.78,56.11,89.66,10.23};



        //System.out.println(a[3]);

        int l = a.length;
        System.out.println("l="+a.length);
        for (int i =0;i< a.length;i++)
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
