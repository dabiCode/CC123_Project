package db;

import constant.commonconstant;

import java.sql.*;

public class MyJDBC {
    public static boolean register(String username, String password){
    return false;
    }
    public static boolean checkuser(String username){
    try {
        Connection connection = DriverManager.getConnection(commonconstant.DB_URL, commonconstant.DB_USERNAME, commonconstant.DB_PASSWORD);
    PreparedStatement checkuserExist = connection.prepareStatement("SELECT * FROM "+ commonconstant.DB_TABLE_NAME+" WHERE User_name = ?");
    checkuserExist.setString(1, username);
        ResultSet resultSet = checkuserExist.executeQuery();
        if (!resultSet.isBeforeFirst()){
            return false;
        }
    }catch (SQLException e){
        e.printStackTrace();
        }
    return true;
    }

}
