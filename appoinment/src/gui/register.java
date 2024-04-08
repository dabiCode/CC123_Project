package gui;

import constant.commonconstant;
import db.MyJDBC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class register extends form{
    public register(){
        super("Register");
        addGuiComponents();

    }
    private void addGuiComponents(){
        //register panel for registration and for new users
        JLabel registerlabel = new JLabel("Register");

        registerlabel .setBounds(0, 25, 520, 100);
        registerlabel.setForeground(commonconstant.TEXT_COLOR);

        registerlabel.setFont(new Font("Dialog", Font.BOLD, 40));

        registerlabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(registerlabel);

        // add new username label
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

        //password label
        JLabel passwordlabel = new JLabel("Password:");
        passwordlabel.setBounds(30, 255, 400, 25);
        passwordlabel.setFont(new Font("Dialog",Font.PLAIN, 18));
        passwordlabel.setForeground(commonconstant.TEXT_COLOR);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(30, 285, 450, 55);
        passwordField.setBackground(commonconstant.SECONDARY_COLOR);
        passwordField.setForeground(commonconstant.TEXT_COLOR);
        passwordField.setFont(new Font("Dialog", Font.PLAIN, 24));

        add(passwordlabel);
        add(passwordField);


            //re-enter password
        JLabel rePassword = new JLabel("Re-Enter Password:");
        rePassword.setBounds(30, 365, 400, 25);
        rePassword.setFont(new Font("Dialog",Font.PLAIN, 18));
        rePassword.setForeground(commonconstant.TEXT_COLOR);

        JPasswordField repasswordField = new JPasswordField();
        repasswordField.setBounds(30, 395, 450, 55);
        repasswordField.setBackground(commonconstant.SECONDARY_COLOR);
        repasswordField.setForeground(commonconstant.TEXT_COLOR);
        repasswordField.setFont(new Font("Dialog", Font.PLAIN, 24));

        add(rePassword);
        add(repasswordField);

        //registration button

        JButton regiserButton = new JButton("Register");
        regiserButton.setFont(new Font("Dialog", Font.BOLD, 18));

        regiserButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        regiserButton.setBackground(commonconstant.TEXT_COLOR);
        regiserButton.setBounds(125, 520, 250,50);
        regiserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //database validation for users
                String username = usernameField.getText();
                String passsword = new String(passwordField.getPassword());
                String rePassword = new String(repasswordField.getPassword());

                if(validateuserinput(username, passsword, rePassword)){
                  if(MyJDBC.register(username, passsword)){
                     register.this.dispose();

                     loginpage login = new loginpage();
                     login.setVisible(true);

                     JOptionPane.showMessageDialog(login, "Registered Account Successfully");

                  }else {
                  JOptionPane.showMessageDialog(register.this, "Error: Username already taken");
                  }
                }else{
                    JOptionPane.showMessageDialog(register.this, "Error. Username must contain 6 characters\n"+"and/or password must match in re-password");
                }
            }
        });
        add(regiserButton);

        // if the user have already an account or have an existing account
        JLabel loginLabel = new JLabel("Have an account? Login Here");
        loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
        loginLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        loginLabel.setForeground(commonconstant.TEXT_COLOR);
        loginLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                register.this.dispose();

                new loginpage().setVisible(true);
            }
        });
        loginLabel.setBounds(125, 600, 250, 30);
        add(loginLabel);
    }
    private boolean validateuserinput(@org.jetbrains.annotations.NotNull String username, String password, String rePassword){
        //database
        if (username.length()==0 || password.length()==0||rePassword.length()==0) return false;

        if (username.length()<6)return  false;

        if (!password.equals(rePassword)) return false;

        return true;
    }
}
