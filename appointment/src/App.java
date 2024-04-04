import java.sql.*;

public class App {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/appointment", "root", "brylle1234");
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM app")) {

            while (rs.next()) {
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("email"));
                System.out.println(rs.getString("phone"));
                System.out.println(rs.getString("date"));
                System.out.println(rs.getString("time"));
                System.out.println(rs.getString("message"));
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        }
    }
}