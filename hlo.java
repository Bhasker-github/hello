package hello;
import java.sql.*;

public class hlo{
  public static void main(String[] args)throws Exception {
    String url="jdbc:mysql://localhost:3306/lion";
    String uname="root";
    String pass="mysql";
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection(url, uname, pass);
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("select *from lb");
    while(rs.next()){
        String a=rs.getInt("sno")+" "+rs.getString("name");
System.out.println(a);
    }
   con.close();
   st.close();
  }
}