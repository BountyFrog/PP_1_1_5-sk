//package jm.task.core.jdbc.dao;
//
//import jm.task.core.jdbc.model.User;
//import jm.task.core.jdbc.util.Util;
//
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//
//public class UserDaoJDBCImpl implements UserDao {
//    public UserDaoJDBCImpl() {
//
//    }
//
//    public void createUsersTable() {
//        String query = "CREATE TABLE IF NOT EXISTS `users` (" +
//                "`id` BIGINT NOT NULL AUTO_INCREMENT," +
//                " `name` VARCHAR(45) NULL," +
//                " `lastname` VARCHAR(45) NULL," +
//                " `age` INT NULL," +
//                " PRIMARY KEY (`id`));";
//        try (Statement statement = Util.getConnection().createStatement()) {
//            statement.execute(query);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public void dropUsersTable() {
//        String query = "DROP TABLE IF EXISTS users;";
//        try (Statement statement = Util.getConnection().createStatement()) {
//            statement.executeUpdate(query);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public void saveUser(String name, String lastName, byte age) {
//        String query = "INSERT INTO users (name, lastname, age) VALUES (?, ?, ?);";
//        try (PreparedStatement preparedstatement = Util.getConnection().prepareStatement(query)) {
//            preparedstatement.setString(1, name);
//            preparedstatement.setString(2, lastName);
//            preparedstatement.setInt(3, age);
//            preparedstatement.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public void removeUserById(long id) {
//        String query = "DELETE FROM users WHERE id=?";
//        try (PreparedStatement preparedstatement = Util.getConnection().prepareStatement(query)) {
//            preparedstatement.setLong(1, id);
//            preparedstatement.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public List<User> getAllUsers() {
//        List<User> users = new ArrayList<>();
//        String query = "SELECT * FROM users;";
//        try (Statement statement = Util.getConnection().createStatement()) {
//            ResultSet resultSet = statement.executeQuery(query);
//            while (resultSet.next()) {
//                User user = new User();
//                user.setId(resultSet.getLong("id"));
//                user.setName(resultSet.getString("name"));
//                user.setLastName(resultSet.getString("lastname"));
//                user.setAge(resultSet.getByte("age"));
//                users.add(user);
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        return users;
//    }
//
//    public void cleanUsersTable() {
//        String query = "TRUNCATE users;";
//        try (Statement statement = Util.getConnection().createStatement()) {
//            statement.executeUpdate(query);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}