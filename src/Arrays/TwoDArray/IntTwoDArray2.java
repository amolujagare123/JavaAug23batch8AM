package Arrays.TwoDArray;

public class IntTwoDArray2 {

    public static void main(String[] args) {
       // int[][] a= { {a1,a2,a3} , {b1,b2,b3}, {c1,c2,c3} ,{d1,d2,d3}};

        int[][] a = {
                {12,13,14},
                {22,23,24},
                {25,26,27},
                {35,36,37}
        };

        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }


        System.out.println("row="+a.length);
        System.out.println("col="+a[0].length);
    }
}
