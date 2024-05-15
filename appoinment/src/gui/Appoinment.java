package gui;

import constant.commonconstant;
import db.userDb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalTime;

import static db.userDb.book;
import static db.userDb.validateuser;

public class Appoinment extends homepage {

    private LocalTime time;
    private ButtonGroup appointmentTypeGroup;

    private LocalTime getCurrentTime() {
        return LocalTime.now();
    }
    public Appoinment(){
        super("Appointment Booking");
        addGuiComponents();

    }

    private void addGuiComponents() {
        time = getCurrentTime();
        JLabel id = new JLabel("ID");
        id .setBounds(10, 50, 300, 25);
        id .setForeground(commonconstant.TEXT_COLOR);
        id .setFont(new Font("Dialog",Font.PLAIN, 18));

        JTextField IdField = new JTextField();
        IdField.setBounds(10, 85, 350, 25);
        IdField.setBackground(commonconstant.SECONDARY_COLOR);
        IdField.setForeground(commonconstant.TEXT_COLOR);
        IdField.setFont(new Font("Dialog", Font.PLAIN, 24));

        add(id);
        add(IdField);


        JLabel lastName = new JLabel("Last Name");
        lastName.setBounds(10, 110, 300, 25);
        lastName .setForeground(commonconstant.TEXT_COLOR);
        lastName .setFont(new Font("Dialog",Font.PLAIN, 18));

        JTextField lastNamefield = new JTextField();
        lastNamefield.setBounds(10, 135, 350, 25);
        lastNamefield.setBackground(commonconstant.SECONDARY_COLOR);
        lastNamefield.setForeground(commonconstant.TEXT_COLOR);
        lastNamefield.setFont(new Font("Dialog", Font.PLAIN, 24));

        add(lastName);
        add(lastNamefield);


        JLabel firstname = new JLabel("First Name");
        firstname.setBounds(10, 160, 300, 25);
        firstname .setForeground(commonconstant.TEXT_COLOR);
        firstname .setFont(new Font("Dialog",Font.PLAIN, 18));

        JTextField firstnamefield = new JTextField();
        firstnamefield.setBounds(10, 185, 350, 25);
        firstnamefield.setBackground(commonconstant.SECONDARY_COLOR);
        firstnamefield.setForeground(commonconstant.TEXT_COLOR);
        firstnamefield.setFont(new Font("Dialog", Font.PLAIN, 24));

        add(firstname);
        add(firstnamefield);




        JLabel MI = new JLabel("Middle Name");
        MI.setBounds(10, 210, 300, 25);
        MI.setForeground(commonconstant.TEXT_COLOR);
        MI.setFont(new Font("Dialog",Font.PLAIN, 18));

        JTextField Mifield = new JTextField();
        Mifield.setBounds(10, 235, 350, 25);
        Mifield.setBackground(commonconstant.SECONDARY_COLOR);
        Mifield.setForeground(commonconstant.TEXT_COLOR);
        Mifield.setFont(new Font("Dialog", Font.PLAIN, 24));

        add(MI);
        add(Mifield);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(10, 265, 200, 25);
        gender.setForeground(commonconstant.TEXT_COLOR);
        gender.setFont(new Font("Dialog",Font.PLAIN, 24));

        JTextField genderflield = new JTextField();
        genderflield.setBounds(10, 295, 200, 25);
        genderflield.setForeground(commonconstant.TEXT_COLOR);
        genderflield.setFont(new Font("Dialog",Font.PLAIN, 24));

        add(gender);
        add(genderflield);

        JLabel Address = new JLabel("Address");
        Address.setBounds(10, 325,300, 25);
        Address.setForeground(commonconstant.TEXT_COLOR);
        Address.setFont(new Font("Dialog",Font.PLAIN, 24));

        JTextField Addressfield = new JTextField();
        Addressfield.setBounds(10, 355, 300, 25);
        Addressfield.setForeground(commonconstant.TEXT_COLOR);
        Addressfield.setFont(new Font("Dialog",Font.PLAIN, 24));


        add(Address);
        add(Addressfield);


        JLabel number = new JLabel("Mobile Number");
        number.setBounds(10, 375,300, 25);
        number.setForeground(commonconstant.TEXT_COLOR);
        number.setFont(new Font("Dialog",Font.PLAIN, 24));

        JTextField numberfield = new JTextField();
        numberfield.setBounds(10, 400, 300, 25);
        numberfield.setForeground(commonconstant.TEXT_COLOR);
        numberfield.setFont(new Font("Dialog",Font.PLAIN, 24));


        add(number);
        add(numberfield);



        JPanel appointmentTypePanel = new JPanel();
        appointmentTypePanel.setBackground(commonconstant.BUTTON_COLOR);
        appointmentTypePanel.setLayout(new GridLayout(0, 1, 10, 10)); // Set layout for vertical arrangement
        appointmentTypePanel.setBounds(500, 200, 300, 200); // Set the position and size of the panel
        appointmentTypePanel.setVisible(false); // Initially make it invisible

        // Create radio buttons for different appointment types
        JRadioButton generalCheckup = new JRadioButton("General Checkup");
        JRadioButton dentalCheckup = new JRadioButton("Dental Checkup");
        JRadioButton eyeCheckup = new JRadioButton("Eye Checkup");
// Add more radio buttons as needed

// Add radio buttons to a ButtonGroup to ensure only one selection
        appointmentTypeGroup = new ButtonGroup();
        appointmentTypeGroup.add(generalCheckup);
        appointmentTypeGroup.add(dentalCheckup);
        appointmentTypeGroup.add(eyeCheckup);

// Add radio buttons to the panel
        appointmentTypePanel.add(generalCheckup);
        appointmentTypePanel.add(dentalCheckup);
        appointmentTypePanel.add(eyeCheckup);

        add(appointmentTypePanel); // Add the panel to the main container
        //reserved space for database

        JButton submitButton = new JButton("Book Appointment");
        submitButton.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {

                        Appoinment.this.dispose();
                        new home().setVisible(true);
            }

        });
//        submitButton.addActionListener(e -> submitAppointment());
        appointmentTypePanel.add(submitButton);// Add the button to the appointment type panel

        JButton Booknow = new JButton("Register");
        Booknow.setForeground(commonconstant.SECONDARY_COLOR);

        Booknow.setFont(new Font("Dialog", Font.BOLD, 18));

        Booknow.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Booknow.setBackground(commonconstant.BUTTON_COLOR);
        Booknow.setBounds(300, 520, 250,50);
        Booknow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //database validation for users
                int Id = Integer.parseInt(IdField.getText());
                String LastName = lastNamefield.getText();
                String firstname = firstnamefield.getText();
                String MI = Mifield.getText();
                String gender = genderflield.getText();
                String Address = Addressfield.getText();
                int number = Integer.parseInt(numberfield.getText());
                String appointment = generalCheckup.getText();
                      appointment = dentalCheckup.getText();
                      appointment = eyeCheckup.getText();



                if(validateuserinput(Id, LastName, firstname, MI, gender, Address, number, appointment)){
                    if(book(Id,LastName, firstname, MI, time,gender, Address, number, appointment)){


                        home home = new home();
                        appointmentTypePanel.setVisible(true);

                        JOptionPane.showMessageDialog(home, "Booked account successfully");

                    }else {
                        JOptionPane.showMessageDialog(Appoinment.this, "Error: Name already taken");
                    }
                }else{
                    JOptionPane.showMessageDialog(Appoinment.this, "Error. Name and id must contain words and/or value\n");
                }
            }
        });

        add(Booknow);











    }
    private boolean validateuserinput( int id, String lastName, String firstname, String middle_name, String Gender, String Address, int number, String appointment ) {
        //database
        if (id == 0 || lastName.length() == 0 || firstname.length() == 0 || middle_name.length() == 0 || Gender.length() == 0 || Address.length() == 0 || number == 0 || appointment.length() == 0)
            return false;

        if (id < 6) return false;
        if(Gender.length() > 2) return false;


        return true;
    }
}