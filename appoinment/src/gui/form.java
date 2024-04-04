package gui;

import constant.commonconstant;

import javax.swing.*;
public class form extends JFrame {
    public  form (String title){
        super(title);
        setSize(520, 686);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(null);

        setResizable(false);

        getContentPane().setBackground(commonconstant.PRIMARY_COLOR);

    }
}
