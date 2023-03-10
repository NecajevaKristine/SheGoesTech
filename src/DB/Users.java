package DB;

import com.mysql.cj.jdbc.StatementImpl;

import java.sql.*;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Users {
    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost:3306/java34";
        String username = "root";
        String password = "0315";
        Scanner scanner = new Scanner(System.in);
        char again = 'y';

        try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
            System.out.println("Connected to database!");

            while (again == 'y') {
                System.out.println("Choose one option(r,i,d)");
                System.out.println("r - reading data");
                System.out.println("i - inserting data");
                System.out.println("d - deleting data");

                char action = scanner.nextLine().charAt(0);

                if (action == 'i') {

                    System.out.println("Enter user name");
                    String newUsername = scanner.nextLine();

                    System.out.println("Enter password");
                    String newPassword = scanner.nextLine();

                    System.out.println("Enter full name");
                    String newFullname = scanner.nextLine();

                    System.out.println("Enter email");
                    String newEmail = scanner.nextLine();

                    insertData(conn, newUsername, newPassword, newFullname, newEmail);

                } else if (action == 'r') {
                    readData(conn);
                } else if (action == 'd') {
                    System.out.println("Enter username you want to delete");
                    String deleteUser = scanner.nextLine();
                    deleteData(conn, deleteUser);
                } else {
                    System.out.println("Invalid input!");
                }

                System.out.println("Do you want to do something more? y/n");
                again = scanner.nextLine().charAt(0);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

     }

    public static void readData(Connection conn) throws SQLException {

        String sql = "SELECT * FROM users";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        int count = 0;

        while (resultSet.next()) {

            String username = resultSet.getString(2);
            String password = resultSet.getString(3);
            String fullName = resultSet.getString("fullname");
            String email = resultSet.getString("email");

            String output = "User #%d: %s - %s - %s - %s";
            System.out.println(String.format(output, ++count, username, password, fullName, email));


        }

    }

    public static void insertData(Connection conn, String username, String password, String fullname, String email )throws SQLException{
        String sql = "INSERT INTO users (username, password, fullname, email) VALUES (?,?,?,?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, username);
        statement.setString(2, password);
        statement.setString(3, fullname);
        statement.setString(4, email);

        int rowInserted = statement.executeUpdate();

        if(rowInserted>0){
            System.out.println("A new user was inserted successfully");
        }else{
            System.out.println("Something went wrong");
        }

    }

    public static void deleteData(Connection conn, String username) throws SQLException{

        String sql = "DELETE FROM users WHERE username = ?";

        PreparedStatement statement= conn.prepareStatement(sql);
        statement.setString(1, username);

        if(statement.executeUpdate()>0){
            System.out.println("User was deleted successfully");
        }else{
            System.out.println("Something went wrong");
        }

    }

}
