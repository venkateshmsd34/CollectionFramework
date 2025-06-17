import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/demo";
        String uname = "root";
        String pwd = "pwd";
        String query ="Select * from student";

        try {
            Connection con = DriverManager.getConnection(url, uname, pwd);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            System.out.println("Id "+ "Name ");
            while(rs.next()) {
                int num = rs.getInt(1);
                String name = rs.getString(2);


                System.out.println(num+"  "+name);
            }
            con.close();

        }

        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}

//output
Id Name 
1  raju
2  pallavi
3  jyo
4  santhu