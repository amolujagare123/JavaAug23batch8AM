package JDBCDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1. loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. create the connection
        String username = "root";
        String password = "root";
        String url ="jdbc:mysql://localhost:3306/8ambatch";
        Connection con = DriverManager.getConnection(url,username,password);

        // 3. create a statement
        Statement st = con.createStatement();

        // 4. execute the query ( DML - Data Manipulation language query)
      String sql = "insert into student values(4,'Vijay','IT',74)";
    //    String sql = "update student set marks=100 where rno=4";
   //     String sql = "delete from student where rno=4";
        st.executeUpdate(sql);
    }
}
