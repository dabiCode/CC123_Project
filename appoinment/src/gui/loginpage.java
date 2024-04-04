package gui;

import constant.commonconstant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class loginpage extends form {
    public loginpage(){
        super("Login");
        addGuiComponents();

    }
    private void addGuiComponents(){
       JLabel loginlabel = new JLabel("Login");

        loginlabel.setBounds(0, 25, 520, 100);
        loginlabel.setForeground(commonconstant.TEXT_COLOR);

        loginlabel.setFont(new Font("Dialog", Font.BOLD, 40));

        loginlabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(loginlabel);

        JLabel usernamelabel = new JLabel("Username:");
        usernamelabel.setBounds(30, 150, 400, 25);
        usernamelabel.setForeground(commonconstant.TEXT_COLOR);
        usernamelabel.setFont(new Font("Dialog",Font.PLAIN, 18));

        JTextField usernameField = new JTextField();
        usernameField.setBounds(30, 185, 450, 55);
        usernameField.setBackground(commonconstant.SECONDARY_COLOR);
        usernameField.setForeground(commonconstant.TEXT_COLOR);
        usernameField.setFont(new Font("Dialog", Font.PLAIN, 24));

        add(usernamelabel);
        add(usernameField);

        JLabel passwordlabel = new JLabel("Password:");
        passwordlabel.setBounds(30, 335, 400, 25);
        passwordlabel.setFont(new Font("Dialog",Font.PLAIN, 18));
        passwordlabel.setForeground(commonconstant.TEXT_COLOR);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(30, 365, 450, 55);
        passwordField.setBackground(commonconstant.SECONDARY_COLOR);
        passwordField.setForeground(commonconstant.TEXT_COLOR);
        passwordField.setFont(new Font("Dialog", Font.PLAIN, 24));

        add(passwordlabel);
        add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Dialog", Font.BOLD, 18));

        loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        loginButton.setBackground(commonconstant.TEXT_COLOR);
        loginButton.setBounds(125, 520, 250,50);
        add(loginButton);

        JLabel registerLabel = new JLabel("Not a user? Register Here");
        registerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        registerLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        registerLabel.setForeground(commonconstant.TEXT_COLOR);

        //set mouse listener
        registerLabel.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
          loginpage.this.dispose();

          new register().setVisible(true);
         }
        });
        registerLabel.setBounds(125, 600, 250, 30);
        add(registerLabel);
    }
}
