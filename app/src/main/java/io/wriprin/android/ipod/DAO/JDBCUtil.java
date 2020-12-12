package io.wriprin.android.ipod.DAO;

import java.sql.*;

/**
 * JDBC数据库操作工具类  简化数据库操作
 * @author wxisme
 *
 */
public class JDBCUtil {


    /**
     * 获取数据库连接
     * @return Connection
     */
    public static Connection getMySQLConnection() {
        Connection conn = null;
        try {
            //加载数据库驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取数据库连接
            conn = DriverManager.getConnection("jdbc:mysql://47.98.176.99:3306/MyMusic?characterEncodeing=UTF-8&useSSL=false","MyMusic","root");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }



    public static void close(ResultSet rs,Statement ps,Connection conn) {
        try {
            if(rs!=null){
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if(ps!=null){
                ps.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if(conn!=null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Statement ps,Connection conn){
        try {
            if(ps!=null){
                ps.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if(conn!=null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection conn){
        try {
            if(conn!=null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
