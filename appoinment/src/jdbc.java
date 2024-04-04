import java.sql.*;

public class jdbc {

    public static void main(String[] args) {
        try{
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/appointment",
                    "root", "brylle1234"
            );
            Statement statement = connection.createStatement();
            ResultSet resultset = statement.executeQuery("SELECT * FROM users");

            while(resultset.next()){
                System.out.println(resultset.getString("email"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
