import java.sql.*;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



                String url = "jdbc:mysql://localhost:3306/demo";
                String dbUser = "root";           // MySQL username
                String dbPwd = "rhv";            // MySQL password

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter username: ");
                String uname = sc.nextLine();
                System.out.print("Enter password: ");
                String pwd = sc.nextLine();

                // Vulnerable query (SQL injection possible)
                String query = "SELECT * FROM users WHERE username = '" + uname + "' AND password = '" + pwd + "'";

                try {
                    Connection con = DriverManager.getConnection(url, dbUser, dbPwd);
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query);
                    {
                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + " " + rs.getString(2));
                        }
                    }
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

//output
Enter username: rajuuxh
Enter password: ' or 1=1 --'
3 jyo
33 raju


//By using statement user can face sql injections to avoid this sql injections we use preparestatement