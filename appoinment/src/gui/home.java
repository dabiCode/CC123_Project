package gui;
import constant.commonconstant;

import javax.swing.*;
import java.awt.*;

public class home extends homepage {
    public home(){
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
        home.setBounds(320, 150, 100,25);
        //reserved space for database

        JButton features= new JButton("Features");
        features.setFont(new Font("Dialog", Font.BOLD, 18));

        features.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        features.setForeground(commonconstant.TEXT_COLOR);
        features.setBounds(400, 150, 150,25);

        JButton about= new JButton("About Us");
        about.setFont(new Font("Dialog", Font.BOLD, 18));

        about.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        about.setForeground(commonconstant.TEXT_COLOR);
        about.setBounds(550, 150, 160,25);

        JButton signin= new JButton("Logout");
        signin.setFont(new Font("Dialog", Font.BOLD, 18));

        signin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        signin.setForeground(commonconstant.TEXT_COLOR);
        signin.setBackground(commonconstant.BUTTON_COLOR);
        signin.setBounds(680, 150, 150,25);


        add(signin);
        add(about);
        add(features);
        add(home);


        JLabel text = new JLabel("Consult your health");
        text.setBounds(-50, 20, 400, 400);
        text.setForeground(commonconstant.TEXT_COLOR.brighter());


        text.setFont(new Font("Dialog", Font.BOLD, 30));
        text.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel label = new JLabel("with our doctor");
        label.setBounds(-50, 20, 400, 500);
        label.setForeground(commonconstant.TEXT_COLOR.brighter());

        label.setFont(new Font("Dialog", Font.BOLD, 30));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel newlabel = new JLabel("anytime, anywhere.");
        newlabel.setBounds(-50, 20, 400, 600);
        newlabel.setForeground(commonconstant.TEXT_COLOR.brighter());

        newlabel.setFont(new Font("Dialog", Font.BOLD, 30));
        newlabel.setHorizontalAlignment(SwingConstants.CENTER);


        add(newlabel);
        add(label);
        add(text);

        JLabel Appoinment = new JLabel("Appointment");
        Appoinment.setBounds(300, 20, 400, 400);
        Appoinment.setForeground(commonconstant.TEXT_COLOR);

        Appoinment.setFont(new Font("Dialog", Font.BOLD, 30));
        Appoinment.setHorizontalAlignment(SwingConstants.CENTER);

        add(Appoinment);

        JButton book = new JButton("Book Now");
        book.setFont(new Font("Dialog", Font.BOLD, 10));

        book.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        book.setForeground(commonconstant.TEXT_COLOR);
        book.setBounds(450, 300, 100,20);

        add(book);


        JLabel hours = new JLabel("Opening Hours");
        hours.setBounds(300, 150, 400, 400);
        hours.setForeground(commonconstant.TEXT_COLOR);
        hours.setBackground(commonconstant.BLUE_COLOR);

        hours.setFont(new Font("Dialog", Font.BOLD, 30));
        hours.setHorizontalAlignment(SwingConstants.CENTER);

        JButton time = new JButton("8:00am - 11:00am");
        time.setFont(new Font("Dialog", Font.BOLD, 10));

        time.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        time.setForeground(commonconstant.TEXT_COLOR);
        time.setBounds(380, 400, 140,20);

        JButton time2 = new JButton("1:00pm - 5:00pm");
        time2.setFont(new Font("Dialog", Font.BOLD, 10));

        time2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        time2.setForeground(commonconstant.TEXT_COLOR);
        time2.setBounds(500, 400, 140,20);

        add(time2);
        add(time);
        add(hours);

        JLabel contact = new JLabel("Emergency Service");
        contact.setBounds(300, 300, 400, 400);
        contact.setBackground(commonconstant.BLUE_COLOR);
        contact.setForeground(commonconstant.TEXT_COLOR);

        contact.setFont(new Font("Dialog", Font.BOLD, 30));
        contact.setHorizontalAlignment(SwingConstants.CENTER);

        JButton emergency = new JButton("Contact Us");
        emergency.setFont(new Font("Dialog", Font.BOLD, 10));

        emergency.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        emergency.setForeground(commonconstant.TEXT_COLOR);
        emergency.setBounds(650, 600, 140,20);

        add(emergency);
        add(contact);

    }




}






















