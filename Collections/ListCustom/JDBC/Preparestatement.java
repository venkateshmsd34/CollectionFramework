import java.sql.*;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



                String url = "jdbc:mysql://localhost:3306/demo";
                String dbUser = "root";           // MySQL username
                String dbPwd = "raju";            // MySQL password

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter username: ");
                String uname = sc.nextLine();
                System.out.print("Enter password: ");
                String pwd = sc.nextLine();


                String query = "select * from users where username=? and password=?";

                try {
                    Connection con = DriverManager.getConnection(url, dbUser, dbPwd);
                    PreparedStatement st = con.prepareStatement(query);
                    st.setString(1,uname);
                    st.setString(2,pwd);
                    ResultSet rs = st.executeQuery();
                    if(rs.next()){
                        System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3)+""+rs.getString(4));
                    }
                    else {
                        System.out.println("Invalid details");
                    }
                    con.close();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

