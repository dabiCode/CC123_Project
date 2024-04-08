package gui;
import constant.commonconstant;

import javax.swing.*;
import java.awt.*;

public class menu extends form {
    public menu(){
        super("Main Menu");
        addGuiComponents();

    }

    private void addGuiComponents() {
        JLabel menulabel = new JLabel("Main menu");

        menulabel.setBounds(0, 25, 520, 100);
        menulabel.setForeground(commonconstant.TEXT_COLOR);

        menulabel.setFont(new Font("Dialog", Font.BOLD, 40));

        menulabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(menulabel);


        //new time menu for the time selection mode

        JButton time = new JButton("Click here to check the available time");
        time.setFont(new Font("Dialog", Font.BOLD, 18));

        time.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        time.setBackground(commonconstant.TEXT_COLOR);
        time.setBounds(30, 150, 400,25);
        //reserved space for database





        add(time);

    }
}






















