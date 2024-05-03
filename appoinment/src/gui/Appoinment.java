package gui;

import constant.commonconstant;
import db.MyJDBC;
import db.userDb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static db.userDb.book;
import static db.userDb.validateuser;

public class Appoinment extends homepage {

    public Appoinment(){
        super("Appointment Booking");
        addGuiComponents();

    }

    private void addGuiComponents() {

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



        JLabel time = new JLabel("Time");
        time.setBounds(10, 260, 300, 25);
        time.setForeground(commonconstant.TEXT_COLOR);
        time.setFont(new Font("Dialog",Font.PLAIN, 18));

        JTextField timefield = new JTextField();
        timefield.setBounds(10, 285, 350, 25);
        timefield.setBackground(commonconstant.SECONDARY_COLOR);
        timefield.setForeground(commonconstant.TEXT_COLOR);
        timefield.setFont(new Font("Dialog", Font.PLAIN, 24));

        add(time);
        add(timefield);

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
                String time = timefield.getText();


                if(validateuserinput(Id, LastName, firstname, MI, time)){
                    if(userDb.book(Id,LastName, firstname, MI, time)){
                        Appoinment.this.dispose();

                        home home = new home();
                        home.setVisible(true);

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
    private boolean validateuserinput( int id, String lastName, String firstname, String middle_name, String time ) {
        //database
        if (id == 0 || lastName.length() == 0 || firstname.length() == 0 || middle_name.length() == 0 || time.length() == 0)
            return false;

        if (id < 6) return false;


        return true;
    }
}