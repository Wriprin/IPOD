package com.example.mymusic.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    public List<User> getAll(String where) {
        // 操作数据库，需要一个连接Connection
        Connection connection = JDBCUtil.getMySQLConnection();
        PreparedStatement prepareStatement = null;
        ResultSet resultSet = null;
        List<User> userList = new ArrayList();

        String sql = "select * from t_user "+where;

        try {
            prepareStatement = connection.prepareStatement(sql);
            resultSet = prepareStatement.executeQuery();
            while (resultSet.next()) {
                User user = new User();
                user.setID(resultSet.getInt(1));
                user.setUsername(resultSet.getString(2));
                user.setPassword(resultSet.getString(3));
                user.setName(resultSet.getString(4));
                user.setSex(resultSet.getInt(5));
                userList.add(user);
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }finally {
            JDBCUtil.close(resultSet,prepareStatement,connection);
        }

        return userList;
    }

    public boolean add(User user) {
        // 操作数据库，需要一个连接Connection
        Connection connection = JDBCUtil.getMySQLConnection();
        PreparedStatement prepareStatement = null;
        try {
            prepareStatement = connection
                    .prepareStatement("insert into t_user(username,password,name,sex) values (?,?,?,?)");
            prepareStatement.setString(1, user.getUsername());
            prepareStatement.setString(2, user.getPassword());
            prepareStatement.setString(3, user.getName());
            prepareStatement.setInt(4, user.getSex());
            prepareStatement.executeUpdate();
            JDBCUtil.close(prepareStatement, connection);
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    public boolean delete(int id) {
        Connection connection = JDBCUtil.getMySQLConnection();
        PreparedStatement prepareStatement = null;
        try {
            prepareStatement = connection
                    .prepareStatement("delete from t_user where id=?");
            prepareStatement.setInt(1, id);
            prepareStatement.executeUpdate();

            JDBCUtil.close(prepareStatement, connection);
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
