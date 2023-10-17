package week6.JDBC_Veri_Uygulama.src;

import java.sql.*;

public class DBConn {
    public static final String DB_URL = "jdbc:mysql://localhost/employees";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connection = null;

        // ilk elemanı buradan yükledim.
        // String prSql = "INSERT INTO employees (employees_name,employees_position,employees_salary) VALUES (?,?,?)";


        String sql = "SELECT* FROM employees";

        try {
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);

            /*
            PreparedStatement prSt = connection.prepareStatement(prSql);
            prSt.setString(1,"Ali Vehmi");
            prSt.setString(2,"Müdür");
            prSt.setInt(3,5000);

             */


            Statement st = connection.createStatement();
            ResultSet data = st.executeQuery(sql);

            while (data.next()){
                System.out.println("ID : " + data.getInt("employees_id"));
                System.out.println("Name : " + data.getString("employees_name"));
                System.out.println("Position : " + data.getString("employees_position"));
                System.out.println("Salaray : " + data.getInt("employees_salary"));
                System.out.println("###############################################");

            }


            //prSt.executeUpdate();
            //prSt.close();

            st.close();
            data.close();



        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}