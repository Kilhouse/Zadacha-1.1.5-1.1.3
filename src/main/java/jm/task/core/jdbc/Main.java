package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Katya", "Lalkina", (byte) 25);
        userService.saveUser("Egor", "Krutoy", (byte) 30);
        userService.saveUser("Viktor", "Barinov", (byte) 55);
        userService.saveUser("Emma", "Yotson", (byte) 14);

        System.out.println(userService.getAllUsers().toString());

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}