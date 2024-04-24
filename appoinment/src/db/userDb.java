package db;

import constant.commonconstant;

import java.sql.*;

public class userDb {
    public static boolean book(int id,String last_name, String first_name, String midlle_name, String time){
        try{
            if (!checkuser(id)) {
                Connection connection = DriverManager.getConnection(commonconstant.DB_USER, commonconstant.DB_USERNAME,commonconstant.DB_PASSWORD);
                PreparedStatement insertUser = connection.prepareStatement("INSERT INTO "+ commonconstant.DB_USER_INFO+"(user_id, last_name,first_name, m_i, time)"+ "VALUES(?, ?, ?, ?, ?)");
                insertUser.setInt(1, id);
                insertUser.setString(2, last_name);
                insertUser.setString(3, first_name);
                insertUser.setString(4, midlle_name);
                insertUser.setString(5, time);

                insertUser.executeUpdate();
                return true;
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    //check existing user
    public static boolean checkuser(int id){
        try {
            Connection connection = DriverManager.getConnection(commonconstant.DB_USER, commonconstant.DB_USERNAME, commonconstant.DB_PASSWORD);
            PreparedStatement checkuserExist = connection.prepareStatement("SELECT * FROM "+ commonconstant.DB_USER_INFO+" WHERE user_id = ?");
            checkuserExist.setInt(1, id);
            ResultSet resultSet = checkuserExist.executeQuery();
            if (!resultSet.isBeforeFirst()){
                return false;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return true;
    }
    public static boolean validateuser(int id, String last_name, String first_name, String midlle_name, String time) {
        try {
            Connection connection = DriverManager.getConnection(commonconstant.DB_USER, commonconstant.DB_USERNAME, commonconstant.DB_PASSWORD);
            connection.prepareStatement("INSERT INTO " + commonconstant.DB_USER_INFO + "(user_id, last_name,first_name, m_i, time)" + "VALUES(?, ?, ?, ?, ?)");

            PreparedStatement validate = connection.prepareStatement(
                    "SELECT * FROM " + commonconstant.DB_USER_INFO + " WHERE user_id = ? AND last_name = ? AND first_name = ? AND m_i = ? AND time = ? "
            );
            validate.setInt(1, id);
            validate.setString(2, last_name);
            validate.setString(3, first_name);
            validate.setString(4, midlle_name);
            validate.setString(5, time);
            ResultSet result = validate.executeQuery();

            if (!result.isBeforeFirst()) {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;

    }
}
