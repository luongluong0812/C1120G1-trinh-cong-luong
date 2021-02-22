package dao;

import model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAOIplm implements IUserDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/demo?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "Luong123..";
    private static final String INSERT_USERS_SQL = "INSERT INTO users" + "  (name, email, country) VALUES " +
            " (?, ?, ?);";

    private static final String SELECT_USER_BY_ID = "select id,name,email,country from users where id =?";
    private static final String SELECT_ALL_USERS = "select * from users";
    private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
    private static final String UPDATE_USERS_SQL = "update users set name = ?,email= ?, country =? where id = ?;";


    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public void insertUser(User user) throws SQLException {
Connection connection=getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(INSERT_USERS_SQL);
        preparedStatement.setString(1,user.getName());
        preparedStatement.setString(2,user.getEmail());
        preparedStatement.setString(3, user.getCountry());
        preparedStatement.executeUpdate();
    }

    @Override
    public User selectUser(int id) {
        return null;
    }

    @Override
    public static List<User> selectAllUsers() throws SQLException {
List<User> list=new ArrayList<>();
//Connection connection=getConnection();
        PreparedStatement preparedStatement= null;
        try {
            preparedStatement = getConnection().prepareStatement(SELECT_ALL_USERS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ResultSet rs=preparedStatement.executeQuery();
        while (rs.next()){
            int id=rs.getInt("id");
            String name=rs.getString("name");
            String email=rs.getString("email");
            String country=rs.getString("country");
            list.add(new User(id,name,email,country));
        }
        return list;
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return false;
    }
}
