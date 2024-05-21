package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Alex", "Pushkin", (byte) 28);
        userService.saveUser("Leo", "Tolstoy", (byte) 43);
        userService.saveUser("Fyodor", "Dostoevsky", (byte) 35);
        userService.saveUser("Nickolas", "Gogol", (byte) 47);
        userService.removeUserById(3);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.getAllUsers();
        userService.dropUsersTable();
    }
}