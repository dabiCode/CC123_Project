package gui;

import constant.commonconstant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HowToAppointment extends homepage {
    public HowToAppointment() {
        super("AppointmentTutorial");
        addTutorialGUI();
    }

    private void addTutorialGUI() {
        JPanel tutorialPanel = new JPanel();
        tutorialPanel.setLayout(null);
        tutorialPanel.setBounds(0,0, 1300, 900);

        ImageIcon logoIcon = new ImageIcon("appoinment/src/image/434024649_1363976920953749_3166889348485858378_n.png"); // Replace "path_to_your_logo_image_file.jpg" with the actual path to your image file

        // Create a JLabel to display the logo image
        JLabel logoLabel = new JLabel(logoIcon);
        logoLabel.setBounds(-10, 45, 180, 100); // Adjust the position and size as needed
        add(logoLabel);

        JLabel menulabel = new JLabel("Health");

        menulabel.setBounds(0, 53, 400, 100);
        menulabel.setForeground(commonconstant.HOME_BG1_BLUE);

        menulabel.setFont(new Font("Dialog", Font.BOLD, 20));

        menulabel.setHorizontalAlignment(SwingConstants.CENTER);


        JLabel menulabel2 = new JLabel("Appointment");

        menulabel2.setBounds(91, 53, 400, 100);
        menulabel2.setForeground(commonconstant.TEXT_COLOR);

        menulabel2.setFont(new Font("Dialog", Font.BOLD, 20));

        menulabel2.setHorizontalAlignment(SwingConstants.CENTER);



        //new time menu for the time selection mode

        JLabel home = new JLabel("Home");
        home.setFont(new Font("Dialog", Font.BOLD, 18));


        home.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        home.setForeground(commonconstant.TEXT_COLOR);
        home.setBounds(630, 91, 100,25);


        //reserved space for database

        JLabel Bapp= new JLabel("Book an Appointment");
        Bapp.setFont(new Font("Dialog", Font.BOLD, 18));

        Bapp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Bapp.setForeground(commonconstant.TEXT_COLOR);
        //set mouse listener
        Bapp.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                HowToAppointment.this.dispose();

                new Appoinment().setVisible(true);
            }
        });

        Bapp.setBounds(695, 91, 200,25);

        JLabel about= new JLabel("About Us");
        about.setFont(new Font("Dialog", Font.BOLD, 18));

        about.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        about.setForeground(commonconstant.TEXT_COLOR);
        //set mouse listener
        about.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                HowToAppointment.this.dispose();

                new About().setVisible(true);
            }
        });

        about.setBounds(900, 91, 160,25);

        JButton signin= new JButton("Logout");
        signin.setFont(new Font("Dialog", Font.BOLD, 18));

        signin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        signin.setForeground(commonconstant.SECONDARY_COLOR);
        signin.setBackground(commonconstant.HOME_BG1_BLUE);
        signin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                HowToAppointment.this.dispose();
                new loginpage().setVisible(true);
            }
        });

        signin.setBounds(1000, 81, 150,42);


        add(menulabel);
        add(menulabel2);
        add(signin);
        add(about);
        add(Bapp);
        add(home);


        JLabel txtHow = new JLabel("HOW TO SCHEDULE AN APPOINTMENT");
        txtHow.setFont(new Font("Dialogs", Font.BOLD, 30));
        txtHow.setBounds(300, 230, 700, 50);
        txtHow.setForeground(commonconstant.TEXT_COLOR);

        JPanel BGlightblue = new JPanel(null);
        BGlightblue.setBounds(100,190,1000,550);
        BGlightblue.setBackground(commonconstant.HOME_BG1_GRAY);


        ImageIcon bgBlue = new ImageIcon ("appoinment/src/gui/BGlikodIMG.jpg");
        JLabel bgBlueRight = new JLabel(bgBlue);
        bgBlueRight.setBounds(0, 165, 1300, 650);

        tutorialPanel.add(txtHow);
        tutorialPanel.add(BGlightblue);
        add(tutorialPanel);
        tutorialPanel.add(bgBlueRight);




    }


    }
