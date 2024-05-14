package adminpage;

import constant.commonconstant;
import gui.loginpage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdminHome extends adminform {
    public AdminHome() {
        super("Admin Homepage");
        addGuiComponenets();
    }


    private void addGuiComponenets() {


        //arrow
        ImageIcon imageA = new ImageIcon("appoinment/src/image/arrowtr.png");
        JLabel arrow = new JLabel(imageA);
        arrow.setBounds ( 250, 25, 90, 50); // Adjust the position and size as needed
        add(arrow);

        //Admin home label
        JLabel AdminHomeLabel = new JLabel("Admin Home");
        AdminHomeLabel .setBounds(345, 0, 520, 100);
        AdminHomeLabel.setForeground(commonconstant.DARK_BLUE);
        AdminHomeLabel.setFont(new Font("Georgia", Font.BOLD, 25));
        add(AdminHomeLabel);


        //Greetings
        JLabel description1label = new JLabel("Welcome to MedCare Admin Home!");
        description1label.setBounds(240, 100, 800, 35);
        description1label.setForeground(commonconstant.DARKERBLUE_REG);
        description1label.setFont(new Font("Georgia",Font.BOLD, 30));
        add(description1label);

        JLabel description1Alabel = new JLabel("Exclusive for doctors and secretaries");
        description1Alabel.setBounds(430, 140, 800, 35);
        description1Alabel.setForeground(commonconstant.DARKERBLUE_REG);
        description1Alabel.setFont(new Font("Georgia",Font.BOLD, 20 ));
        add(description1Alabel);

        //tagline
        JLabel tag = new JLabel("Where medical synergy and collective care flourish");
        tag.setBounds(300, 570, 800, 35);
        tag.setForeground(commonconstant.DARKERBLUE_REG);
        tag.setFont(new Font("Georgia",Font.ITALIC, 20 ));
        add(tag);

        //3d
        ImageIcon image3d = new ImageIcon("appoinment/src/image/3d500.png");
        JLabel imaged3 = new JLabel(image3d);
        imaged3.setBounds(290, 150, 450, 450); // Adjust the position and size as needed
        add(imaged3);



        //pannel for  backg picture
        JPanel panel2 = new JPanel();

        panel2.setLayout(new BorderLayout());

        JLabel panelLabel2 = new JLabel();
        panel2.add(panelLabel2, BorderLayout.CENTER);
        panel2.setBackground(new Color(255, 255, 255, 110));
        // Set the size and location of the panel
        panel2.setBounds(220, 0, 640, 700);
        add(panel2);


        //right image
        ImageIcon imageR = new ImageIcon("appoinment/src/image/hexag.png");
        JLabel imagehex = new JLabel(imageR);
        imagehex.setBounds(220, 0, 640, 700); // Adjust the position and size as needed
        add(imagehex);


        //Schedule Table BUTTON
        JButton ScheduleTable = new JButton("Schedule Table");
        ScheduleTable.setFont(new Font("Dialog", Font.BOLD, 15));
        ScheduleTable.setBounds(25, 180, 170, 40);
        ScheduleTable.setBackground(commonconstant.HOME_BG1_BLUE);
        ScheduleTable.setForeground(commonconstant.SECONDARY_COLOR);

        ScheduleTable.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        //set mouse listener
        ScheduleTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                new ScheduleTable().setVisible(true);

            }
        });

        add(ScheduleTable);


        //appointment table button
        JButton Appointment= new JButton("Appointment Table");
        Appointment.setBounds(25, 250, 170, 40);
        Appointment.setForeground(commonconstant.SECONDARY_COLOR);
        Appointment.setBackground(commonconstant.HOME_BG1_BLUE);;
        Appointment.setFont(new Font("Dialog", Font.BOLD, 15));

        Appointment.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Appointment.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                AdminHome.this.dispose();
                new AppoitmentTable().setVisible(true);
            }
        });
        add(Appointment);



        //Log out BUTTON

        JButton Logout= new JButton("Log out");
        Logout.setBounds(25, 380, 170, 40);
        Logout.setForeground(commonconstant.SECONDARY_COLOR);
        Logout.setBackground(commonconstant.TEAL_REGISTER);;
        Logout.setFont(new Font("Dialog", Font.BOLD, 15));

        Logout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Logout.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                AdminHome.this.dispose();
                new loginpage().setVisible(true);
            }
        });
        add(Logout);



        //logo
        ImageIcon image = new ImageIcon("appoinment/src/image/logotransparent.png");
        JLabel image6 = new JLabel(image);
        image6.setBounds(-25, -70, 250, 250); // Adjust the position and size as needed
        add(image6);


        //Panel Transparent upper
        JPanel panel3 = new JPanel();

        panel3.setLayout(new BorderLayout());

        JLabel panelLabel3 = new JLabel();
        panel3.add(panelLabel3, BorderLayout.CENTER);
        panel3.setBackground(new Color(255, 255, 255, 110));
        // Set the size and location of the panel
        panel3.setBounds(0, 0, 220, 120);
        add(panel3);

        //Panel Transparent
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());

        JLabel panelLabel1 = new JLabel();
        panel1.add(panelLabel1, BorderLayout.CENTER);
        panel1.setBackground(new Color(130, 130, 130, 110));
        // Set the size and location of the panel
        panel1.setBounds(0, 0, 220, 700);
        // Add the panel to the main container
        add(panel1);


        //left image
        ImageIcon imageL = new ImageIcon("appoinment/src/image/AdminBack.png");
        JLabel image5 = new JLabel(imageL);
        image5.setBounds(0, 0, 220, 660); // Adjust the position and size as needed
        add(image5);



    }
}