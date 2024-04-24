package gui;

import constant.commonconstant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class About extends homepage{
    public About(){
        super("HealthAppointment");
        addGuiComponents();

    }

    private void addGuiComponents() {
        ImageIcon logoIcon = new ImageIcon("appoinment/src/image/20240424_162915_0000.png"); // Replace "path_to_your_logo_image_file.jpg" with the actual path to your image file

        // Create a JLabel to display the logo image
        JLabel logoLabel = new JLabel(logoIcon);
        logoLabel.setBounds(490, -30, 1000, 1000); // Adjust the position and size as needed
        add(logoLabel);

        JLabel menulabel = new JLabel("Health Appointment");

        menulabel.setBounds(50, 70, 400, 100);
        menulabel.setForeground(commonconstant.TEXT_COLOR.brighter());

        menulabel.setFont(new Font("Dialog", Font.BOLD, 20));

        menulabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(menulabel);


        //new time menu for the time selection mode

        JButton home = new JButton("Home");
        home.setFont(new Font("Dialog", Font.BOLD, 18));


        home.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        home.setForeground(commonconstant.TEXT_COLOR);


        home.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                About.this.dispose();

                new home().setVisible(true);
            }
        });

        home.setBounds(950, 70, 100, 25);
        //reserved space for database




        add(home);
//
        JLabel text = new JLabel("About us!");
        text.setBounds(100, 180, 400, 100);
        text.setForeground(commonconstant.TEXT_COLOR.brighter());
        text.setFont(new Font("Dialog", Font.BOLD, 50));
        text.setHorizontalAlignment(SwingConstants.CENTER);
        add(text);

        JLabel comment = new JLabel("Welcome to MEDCARE Medical Appointment! We are dedicated to revolutionizing the way you manage");
        comment.setBounds(150, 200, 600, 150);
        comment.setForeground(commonconstant.TEXT_COLOR.brighter());
        comment.setFont(new Font("Dialog", Font.BOLD, 12));
        comment.setHorizontalAlignment(SwingConstants.CENTER);
        add(comment);

        JLabel comment1 = new JLabel("your healthcare appointments. Our platform is designed to provide seamless scheduling, ensuring you");
        comment1.setBounds(153, 220,600 , 150);
        comment1.setForeground(commonconstant.TEXT_COLOR.brighter());
        comment1.setFont(new Font("Dialog", Font.BOLD, 12));
        comment1.setHorizontalAlignment(SwingConstants.CENTER);
        add(comment1);

        JLabel comment2 = new JLabel("can access medical care conveniently and efficiently.");
        comment2.setBounds(115, 240, 400, 150);
        comment2.setForeground(commonconstant.TEXT_COLOR.brighter());
        comment2.setFont(new Font("Dialog", Font.BOLD, 12));
        comment2.setHorizontalAlignment(SwingConstants.CENTER);
        add(comment2);

        JLabel text1 = new JLabel("Our Mission");
        text1.setBounds(100, 310, 400, 100);
        text1.setForeground(commonconstant.TEXT_COLOR.brighter());
        text1.setFont(new Font("Dialog", Font.BOLD, 40));
        text1.setHorizontalAlignment(SwingConstants.CENTER);
        add(text1);

        JLabel comment3 = new JLabel("At [Medical Appointment Booking Service], our mission is to empower individuals to take control");
        comment3.setBounds(130, 320, 600, 150);
        comment3.setForeground(commonconstant.TEXT_COLOR.brighter());
        comment3.setFont(new Font("Dialog", Font.BOLD, 12));
        comment3.setHorizontalAlignment(SwingConstants.CENTER);
        add(comment3);

        JLabel comment4 = new JLabel("of their health by simplifying the appointment booking process. We aim to bridge the gap ");
        comment4.setBounds(130, 340, 600, 150);
        comment4.setForeground(commonconstant.TEXT_COLOR.brighter());
        comment4.setFont(new Font("Dialog", Font.BOLD, 12));
        comment4.setHorizontalAlignment(SwingConstants.CENTER);
        add(comment4);
    }
}
