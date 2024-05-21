package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    public void createUsersTable() {
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
        userDaoHibernate.createUsersTable();
    }

    public void dropUsersTable() {
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
        userDaoHibernate.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
        userDaoHibernate.saveUser(name, lastName, age);
        System.out.println("User с именем - " + name + " добавлен в базу данных.");
    }

    public void removeUserById(long id) {
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
        userDaoHibernate.removeUserById(id);
    }

    public List<User> getAllUsers() {
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
        System.out.println(userDaoHibernate.getAllUsers());
        return userDaoHibernate.getAllUsers();
    }

    public void cleanUsersTable() {
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
        userDaoHibernate.cleanUsersTable();
    }
}

//package jm.task.core.jdbc.service;
//
//import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
//import jm.task.core.jdbc.model.User;
//
//import java.util.List;
//
//public class UserServiceImpl implements UserService {
//
//    public void createUsersTable() {
//        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
//        userDaoJDBC.createUsersTable();
//    }
//
//    public void dropUsersTable() {
//        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
//        userDaoJDBC.dropUsersTable();
//    }
//
//    public void saveUser(String name, String lastName, byte age) {
//        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
//        userDaoJDBC.saveUser(name, lastName, age);
//        System.out.println("User с именем - " + name + " добавлен в базу данных.");
//    }
//
//    public void removeUserById(long id) {
//        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
//        userDaoJDBC.removeUserById(id);
//    }
//
//    public List<User> getAllUsers() {
//        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
//        System.out.println(userDaoJDBC.getAllUsers());
//        return userDaoJDBC.getAllUsers();
//    }
//
//    public void cleanUsersTable() {
//        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
//        userDaoJDBC.cleanUsersTable();
//    }
//}