package Arrays;

public class StrngArray {

    public static void main(String[] args) {
        String[] st = new String[5];
        st[0] = "Shalini";
        st[1] = "Ishan";
        st[2] = "Tashwant";
        st[3] = "Krupa";
        st[4] = "Rnuni";

        for (int i=0; i<st.length; i++)
            System.out.println(st[i]);

        for (String str : st)
            System.out.println(str);

    }

}
