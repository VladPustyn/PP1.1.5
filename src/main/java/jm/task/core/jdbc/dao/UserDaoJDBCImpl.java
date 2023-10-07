package jm.task.core.jdbc.dao;
import jm.task.core.jdbc.model.User;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {

    public UserDaoJDBCImpl() {

    }


    public void createUsersTable() {

//        String sql = "CREATE TABLE IF NOT EXISTS `dbkata`.`users` (\n" +
//                "`id` INT NOT NULL AUTO_INCREMENT,\n" +
//                "`name` VARCHAR(45) NOT NULL,\n" +
//                "`lastname` VARCHAR(45) NOT NULL,\n" +
//                "`age` INT NOT NULL,\n" +
//                "PRIMARY KEY (`id`))\n" +
//                "ENGINE = InnoDB\n" +
//                "DEFAULT CHARACTER SET = utf8;";
//
//        try (Connection connection = getConnection(); Statement statement = connection.createStatement()) {
//            statement.executeUpdate(sql);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public void dropUsersTable() {
//        String sql = "DROP TABLE IF EXISTS users;";
//        try (Connection connection = getConnection(); Statement statement = connection.createStatement()) {
//            statement.executeUpdate(sql);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }


    public void saveUser(String name, String lastName, byte age) {
//        String sql = "INSERT INTO users (NAME, LASTNAME, AGE) VALUES(?, ? , ?)";
//
//        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//            preparedStatement.setString(1, name);
//            preparedStatement.setString(2, lastName);
//            preparedStatement.setByte(3, age);
//
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public void removeUserById(long id) {
//        String sql = "DELETE FROM users WHERE ID=?";
//
//        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//            preparedStatement.setLong(1, id);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public List<User> getAllUsers() {
//        List<User> userList = new ArrayList<>();
//
//        String sql = "SELECT ID, NAME, LASTNAME, AGE FROM users";
//
//        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sql);
//             ResultSet resultSet = preparedStatement.executeQuery();) {
//            while (resultSet.next()) {
//                User user = new User();
//                user.setId(resultSet.getLong("ID"));
//                user.setName(resultSet.getString("NAME"));
//                user.setLastName(resultSet.getString("LASTNAME"));
//                user.setAge(resultSet.getByte("AGE"));
//
//                userList.add(user);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        return null;
    }

    public void cleanUsersTable() {
//        String sql = "TRUNCATE TABLE users;";
//        try (Connection connection = getConnection(); Statement statement = connection.createStatement()) {
//            statement.executeUpdate(sql);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
      }
}
