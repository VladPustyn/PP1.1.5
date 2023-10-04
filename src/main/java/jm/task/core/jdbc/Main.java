package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {

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

    }
}
