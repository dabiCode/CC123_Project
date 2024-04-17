package gui;

import constant.commonconstant;

import javax.swing.*;
import java.awt.*;

public class About extends homepage{
    public About(){
        super("HealthAppointment");
        addGuiComponents();

    }

    private void addGuiComponents() {
        JLabel menulabel = new JLabel("HealthAppointment");

        menulabel.setBounds(0, 20, 400, 100);
        menulabel.setForeground(commonconstant.PRIMARY_COLOR.brighter());

        menulabel.setFont(new Font("Dialog", Font.BOLD, 20));

        menulabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(menulabel);


        //new time menu for the time selection mode

        JButton home = new JButton("Home");
        home.setFont(new Font("Dialog", Font.BOLD, 18));


        home.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        home.setForeground(commonconstant.TEXT_COLOR);
        home.setBounds(320, 150, 100, 25);
        //reserved space for database

        JButton features = new JButton("Features");
        features.setFont(new Font("Dialog", Font.BOLD, 18));

        features.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        features.setForeground(commonconstant.TEXT_COLOR);
        features.setBounds(400, 150, 150, 25);

        JButton about = new JButton("About Us");
        about.setFont(new Font("Dialog", Font.BOLD, 18));

        about.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        about.setForeground(commonconstant.TEXT_COLOR);
        about.setBounds(550, 150, 160, 25);

        JButton signin = new JButton("Logout");
        signin.setFont(new Font("Dialog", Font.BOLD, 18));

        signin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        signin.setForeground(commonconstant.TEXT_COLOR);
        signin.setBackground(commonconstant.BUTTON_COLOR);
        signin.setBounds(680, 150, 150, 25);


        add(signin);
        add(about);
        add(features);
        add(home);
    }
}
