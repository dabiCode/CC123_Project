package db;


import adminpage.schedules;
import constant.commonconstant;
import gui.Appoinment;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class userDb {
    public static boolean book(int id,String last_name, String first_name, String midlle_name, LocalTime time, String Gender, String Address, int number, String appointment){
        try{
            if (!checkuser(id)) {
                Connection connection = DriverManager.getConnection(commonconstant.DB_USER, commonconstant.DB_USERNAME,commonconstant.DB_PASSWORD);
                PreparedStatement insertUser = connection.prepareStatement("INSERT INTO "+ commonconstant.DB_USER_INFO+"(user_id, last_name,first_name, m_i, time, gender, adress, number, Appointment )"+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");
                insertUser.setInt(1, id);
                insertUser.setString(2, last_name);
                insertUser.setString(3, first_name);
                insertUser.setString(4, midlle_name);
                insertUser.setTime(5, Time.valueOf(time));
                insertUser.setString(6, Gender);
                insertUser.setString(7, Address);
                insertUser.setInt(8, number);
                insertUser.setString(9, appointment);


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


    public static boolean validateuser(int id, String last_name, String first_name, String midlle_name, LocalTime time, String Gender, String address, int number, String Appoinment) {
        try {
            Connection connection = DriverManager.getConnection(commonconstant.DB_USER, commonconstant.DB_USERNAME, commonconstant.DB_PASSWORD);
            connection.prepareStatement("INSERT INTO " + commonconstant.DB_USER_INFO + "(user_id, last_name,first_name, m_i, time, gander, adress, number, Appointment)" + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");

            PreparedStatement validate = connection.prepareStatement(
                    "SELECT * FROM " + commonconstant.DB_USER_INFO + " WHERE user_id = ? AND last_name = ? AND first_name = ? AND m_i = ? AND time = ? AND gender = ? AND adress = ? And  number = ? AND Appointment = ?"
            );
            validate.setInt(1, id);
            validate.setString(2, last_name);
            validate.setString(3, first_name);
            validate.setString(4, midlle_name);
            validate.setTime(5, Time.valueOf(time));
            validate.setString(6, Gender);
            validate.setString(7, address);
            validate.setInt(8, number);
            validate.setString(9, Appoinment);
            ResultSet result = validate.executeQuery();

            if (!result.isBeforeFirst()) {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;

    }

    public static List<schedules> getAppointment() {
        List<schedules> Appointment = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(commonconstant.DB_USER, commonconstant.DB_USERNAME, commonconstant.DB_PASSWORD);

            PreparedStatement statement = connection.prepareStatement(
                    "SELECT user_id, last_name, first_name, m_i, time, date, gender, adress, number, Appointment FROM " + commonconstant.DB_USER_INFO
            );
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int user_id = resultSet.getInt("user_id");
                String last_name = resultSet.getString("last_name");
                String first_name = resultSet.getString("first_name");
                String middle_name = resultSet.getString("m_i");
                LocalTime time = resultSet.getTime("time").toLocalTime();
                LocalDate date = resultSet.getDate("date").toLocalDate();
                String gender = resultSet.getString("Gender");
                String adress = resultSet.getString("adress");
                int number = resultSet.getInt("number");
                String Appointments = resultSet.getString("Appointment");

                schedules appointment = new schedules(user_id, last_name, first_name, middle_name, time, date, gender, adress, number, Appointments);
                Appointment.add(appointment);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Appointment;
    }

}
