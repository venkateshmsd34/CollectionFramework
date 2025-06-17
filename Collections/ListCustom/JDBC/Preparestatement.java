import java.sql.*;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



                String url = "jdbc:mysql://localhost:3306/demo";
                String dbUser = "root";           // MySQL username
                String dbPwd = "razz";            // MySQL password

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




import java.sql.*;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



                String url = "jdbc:mysql://localhost:3306/demo";
                String dbUser = "root";           // MySQL username
                String dbPwd = "raju";            // MySQL password

                Scanner sc = new Scanner(System.in);
                int id = sc.nextInt();
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Enter username: ");
                String uname = sc.nextLine();
                System.out.print("Enter password: ");
                String pwd = sc.nextLine();


                String query = "insert into users values(?,?,?,?)";

                try {
                    Connection con = DriverManager.getConnection(url, dbUser, dbPwd);
                    PreparedStatement st = con.prepareStatement(query);
                    st.setInt(1,id);
                    st.setString(2,name);
                    st.setString(3,uname);
                    st.setString(4,pwd);
                    int rows = st.executeUpdate();
                    if(rows>0){
                        System.out.println("inserted");
                    }
                    else {
                        System.out.println("insertion failed");
                    }

                    con.close();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

//output
333
pallavi
Enter username: pallu@333
Enter password: pallu
inserted
+------+---------+-----------+----------+
| id   | name    | username  | password |
+------+---------+-----------+----------+
|    3 | jyo     | raju123   | raju     |
|   33 | raju    | raju143   | raju     |
|  333 | pallavi | pallu@333 | pallu    |
+------+---------+-----------+----------+


//
import java.sql.*;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



                String url = "jdbc:mysql://localhost:3306/demo";
                String dbUser = "root";           // MySQL username
                String dbPwd = "raju";            // MySQL password

                Scanner sc = new Scanner(System.in);
                int id = sc.nextInt();

                String query = "delete from users where id=?";

                try{
                    Connection con = DriverManager.getConnection(url,dbUser,dbPwd);
                    PreparedStatement st = con.prepareStatement(query);
                    st.setInt(1,id);
                    int rows =st.executeUpdate();
                    if(rows>0){
                        System.out.println("deleted");
                    }
                    else {
                        System.out.println("Not deleted");
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
    }
        }

//output
deleted
 id   | name | username | password |
+------+------+----------+----------+
|    3 | jyo  | raju123  | raju     |
|   33 | raju | raju143  | raju     |


//updating 
import java.sql.*;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



                String url = "jdbc:mysql://localhost:3306/demo";
                String dbUser = "root";           // MySQL username
                String dbPwd = "raju";            // MySQL password

                Scanner sc = new Scanner(System.in);
                int id = sc.nextInt();
                sc.nextLine();
                String name = sc.nextLine();
                String query = "update users set name=? where id=?";

                try{
                    Connection con = DriverManager.getConnection(url,dbUser,dbPwd);
                    PreparedStatement st = con.prepareStatement(query);
                    st.setString(1,name);

                    st.setInt(2,id);

                    int rows =st.executeUpdate();
                    if(rows>0){
                        System.out.println("updated");
                    }
                    else {
                        System.out.println("not updated");
                    }

                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
    }
        }

output
| id   | name | username | password |
+------+------+----------+----------+
|    3 | mmm  | raju123  | raju     |
|   33 | raju | raju143  | raju     |
+------+------+----------+----------+
