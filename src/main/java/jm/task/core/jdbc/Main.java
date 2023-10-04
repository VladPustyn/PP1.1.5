package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/dbkata";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private static Connection connection;

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return Main.connection = connection;
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        UserServiceImpl userServiceImpl = new UserServiceImpl();                //1.
        userServiceImpl.createUsersTable();

        userServiceImpl.saveUser("Andry", "Ivanov", (byte) 25);   //2.
        System.out.println("User с именем – Andry добавлен в базу данных");

        userServiceImpl.saveUser("Maria", "Smith", (byte) 37);
        System.out.println("User с именем – Maria добавлен в базу данных");

        userServiceImpl.saveUser("Nikolay", "Petrov", (byte) 15);
        System.out.println("User с именем – Nikolay добавлен в базу данных");

        userServiceImpl.saveUser("Grigory", "Savin", (byte) 67);
        System.out.println("User с именем – Grigory добавлен в базу данных");

        System.out.println(userServiceImpl.getAllUsers());                       //3.

        userServiceImpl.cleanUsersTable();                                       //4.

        userServiceImpl.dropUsersTable();                                        //5.

        closeConnection(connection);
    }
}
