package gui;

import db.MyJDBC;

import javax.swing.*;

public class launcher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new loginpage().setVisible(true);

                System.out.println(MyJDBC.checkuser("username"));

            }
        });
    }
}