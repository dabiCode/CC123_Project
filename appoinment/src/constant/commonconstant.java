package constant;

import javax.swing.*;
import java.awt.*;


public class commonconstant {
    //color usage for the gui window
    //pastel light blue
    public static final Color PRIMARY_COLOR = Color.decode("#AEC6CF");
    //white
    public static final Color SECONDARY_COLOR = Color.decode("#FFFFFF");

    //black
    public static final Color TEXT_COLOR = Color.decode("#000000");

    //white
    public static final Color BLUE_COLOR = Color.decode("#FFFFFF");
    //pastel blue
    public static final Color BUTTON_COLOR = Color.decode("#ADD8E6");

    //gray-ish home page
    public static final Color HOME_BG1_GRAY = Color.decode("#e5f5ee");
    //blue dark home page
    public static final Color HOME_BG1_BLUE = Color.decode("#017ac2");

    public static final Color HOME_BG1_GRAYISH = Color.decode("#aec6cf");
    //DARKBLUE
        public static final Color DARK_BLUE = Color.decode("#044cbf");


    //teal
    public static final Color TEAL_REGISTER = Color.decode("#2aa2a2");
    //DARK TEAL
    public static final Color DARKTEAL_REGISTER = Color.decode("#004d4d");
    //DARKERBLUE
    public static final Color DARKERBLUE_REG = Color.decode("#00004d");



    // mySQL server connector
    public static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/user_schema";
    public static final String DB_USER = "jdbc:mysql://127.0.0.1:3306/user_registration";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "brylle1234";
    public static final String DB_TABLE_NAME = "user_info";

    public static final String DB_USER_INFO = "user_data";


    public static void displayImage(JPanel panel, String imagePath) {
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH);

        Graphics g = panel.getGraphics();
        g.drawImage(scaledImage, 0, 0, null);
        g.dispose();
    }

}
