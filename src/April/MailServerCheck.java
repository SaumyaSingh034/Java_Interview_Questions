package April;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.Properties;

public class MailServerCheck {
    public static void main(String[] args) throws SQLException {
        Properties prop = new Properties();
        prop.setProperty("mail.store.protocol","imaps");
       // Session session = Session.getDefaultInstance(prop, null);
        Connection cn = DriverManager.getConnection("url","userName","password");
       Statement st =  cn.createStatement();
       ResultSet result = st.executeQuery("Select * from tableName");
    }
}
