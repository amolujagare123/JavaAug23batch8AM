package Arrays.AnotherWay;

public class StrngArray {

    public static void main(String[] args) {
        String[] st ={"Kathick","Yashwant","","Amol","Rajan","Krups","Rahul","sumeet"};

        for (int i=0; i<st.length; i++)
            System.out.println(st[i]);

        for (String str : st)
            System.out.println(str);

    }

}
