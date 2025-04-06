package April;

import java.sql.*;

public class DataBaseConnection {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("url","username","password");
        Statement st = con.createStatement();
        ResultSet result = st.executeQuery("Select * from table");

        while(result.next()){
            System.out.println("user : "+result.getString("username"));
        }

        con.close();
    }
}
