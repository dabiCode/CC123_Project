package db;

import constant.commonconstant;

import java.sql.*;

public class MyJDBC {
    public static boolean register(String username, String password){
        try{
            if (!checkuser(username)) {
                Connection connection = DriverManager.getConnection(commonconstant.DB_URL, commonconstant.DB_USERNAME,commonconstant.DB_PASSWORD);
                PreparedStatement insertUser = connection.prepareStatement("INSERT INTO "+ commonconstant.DB_TABLE_NAME+"(User_name, user_password)"+ "VALUES(?, ?)");
                insertUser.setString(1, username);
                insertUser.setString(2, password);

                insertUser.executeUpdate();
                return true;
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
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

    public static boolean validatelogin(String username, String password){
        try{
            Connection connection = DriverManager.getConnection(commonconstant.DB_URL, commonconstant.DB_USERNAME,commonconstant.DB_PASSWORD);
            PreparedStatement insertUser = connection.prepareStatement("INSERT INTO "+ commonconstant.DB_TABLE_NAME+"(User_name, user_password)"+ "VALUES(?, ?)");

            PreparedStatement validate = connection.prepareStatement(
                    "SELECT * FROM "+ commonconstant.DB_TABLE_NAME +" WHERE User_name = ? AND user_password = ?"
            );
            validate.setString(1, username);
            validate.setString(2, password);
            ResultSet result = validate.executeQuery();

            if (!result.isBeforeFirst()){
                return false;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return true;
    }
}
