package gui;

import constant.commonconstant;
import db.MyJDBC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class loginpage extends form {
    public loginpage(){
        super("MedCare Login");
        addGuiComponents();

    }

//
    private void addGuiComponents(){
     ImageIcon logoIcon = new ImageIcon("appoinment/src/image/434024649_1363976920953749_3166889348485858378_n.png"); // Replace "path_to_your_logo_image_file.jpg" with the actual path to your image file

     // Create a JLabel to display the logo image
     JLabel logoLabel = new JLabel(logoIcon);
     logoLabel.setBounds(-10, 10, 180, 100); // Adjust the position and size as needed
     add(logoLabel);

     JLabel loginlabel = new JLabel("MedCare Login");

        loginlabel.setBounds(160, 25, 520, 100);
        loginlabel.setForeground(commonconstant.SECONDARY_COLOR );

        loginlabel.setFont(new Font("Dialog", Font.BOLD, 40));

        loginlabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(loginlabel);

         //username label for the the users that have registered account
        JLabel usernamelabel = new JLabel("Username:");
        usernamelabel.setBounds(200, 150, 400, 25);
        usernamelabel.setForeground(commonconstant.BLUE_COLOR);
        usernamelabel.setFont(new Font("Dialog",Font.PLAIN, 18));

        JTextField usernameField = new JTextField();
        usernameField.setBounds(200, 185, 450, 55);
        usernameField.setBackground(commonconstant.SECONDARY_COLOR);
        usernameField.setForeground(commonconstant.TEXT_COLOR);
        usernameField.setFont(new Font("Dialog", Font.PLAIN, 24));

        add(usernamelabel);
        add(usernameField);

        //password label
        JLabel passwordlabel = new JLabel("Password:");
        passwordlabel.setBounds(200, 280, 400, 25);
        passwordlabel.setFont(new Font("Dialog",Font.PLAIN, 18));
        passwordlabel.setForeground(commonconstant.BLUE_COLOR);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(200, 310, 450, 55);
        passwordField.setBackground(commonconstant.SECONDARY_COLOR);
        passwordField.setForeground(commonconstant.TEXT_COLOR);
        passwordField.setFont(new Font("Dialog", Font.PLAIN, 24));

        add(passwordlabel);
        add(passwordField);

        //for the login button
        JButton loginButton = new JButton("Login");
     loginButton.setForeground(commonconstant.BLUE_COLOR);

        loginButton.setFont(new Font("Dialog", Font.BOLD, 18));

        loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        loginButton.setBackground(commonconstant.BUTTON_COLOR);
        loginButton.setBounds(300, 430, 250,50);
        loginButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
          //users database validation
          String username = usernameField.getText();

          String password = new String(passwordField.getPassword());

          if(MyJDBC.validatelogin(username, password)){
              loginpage.this.dispose();

              new home().setVisible(true);

              JOptionPane.showMessageDialog(loginpage.this, "Login Successful!");

          }else {

           JOptionPane.showMessageDialog(loginpage.this, "Login Failed...");
          }
         }
        });
        add(loginButton);

        //for account registration
        JLabel registerLabel = new JLabel("Not a user? Register Here");
        registerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        registerLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        registerLabel.setForeground(commonconstant.BLUE_COLOR);

        //set mouse listener
        registerLabel.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
          loginpage.this.dispose();

          new register().setVisible(true);
         }
        });
        registerLabel.setBounds(300, 520, 250, 30);
        add(registerLabel);
    }
}
