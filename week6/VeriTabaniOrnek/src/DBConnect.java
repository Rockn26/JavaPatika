package week6.VeriTabaniOrnek.src;

import java.sql.*;


public class DBConnect {

    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connect =null;

        try {
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            connect.setAutoCommit(false);

            PreparedStatement pr = connect.prepareStatement("INSERT INTO university (student_name, student_class) VALUES (?,?)");
            pr.setString(1,"John");
            pr.setInt(2,1);
            pr.executeUpdate();


            if (true){
                throw new SQLException();
            }


            pr.setString(1,"Doe");
            pr.setInt(2,4);
            pr.executeUpdate();

            connect.commit();
            pr.close();
            connect.close();

        } catch (SQLException e) {
            if (connect != null){
                try {
                    connect.rollback();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
            System.out.println(e.getMessage());
        }
    }


}