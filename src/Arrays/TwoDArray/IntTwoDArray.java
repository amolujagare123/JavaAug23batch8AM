package Arrays.TwoDArray;

public class IntTwoDArray {

    public static void main(String[] args) {
        int[][] a = new int[4][3];

        // 1st row
        a[0][0] = 12;
        a[0][1] = 13;
        a[0][2] = 14;

        // 2nd row
        a[1][0] = 22;
        a[1][1] = 23;
        a[1][2] = 24;

        // 3rd row
        a[2][0] = 25;
        a[2][1] = 26;
        a[2][2] = 27;

        // 4th row
        a[3][0] = 35;
        a[3][1] = 36;
        a[3][2] = 37;

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
