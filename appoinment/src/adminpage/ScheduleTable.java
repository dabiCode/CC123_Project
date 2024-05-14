package adminpage;

import constant.commonconstant;
import db.userDb;
import gui.home;
import gui.loginpage;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class ScheduleTable extends adminform{
    private JTable BookedAppointment;
    public ScheduleTable() {
        super("MedCare Appointment System");



       addGuiComponents();
    }
    private void addGuiComponents() {

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color (120, 187, 217, 255));
        mainPanel.setBounds(260, 90, 500, 500);

        // Create a table model
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Id Number");
        tableModel.addColumn("Last Name");
        tableModel.addColumn("First Name");
        tableModel.addColumn("M.I");
        tableModel.addColumn("Time");
        tableModel.addColumn("date");


        //arrow
        ImageIcon imageA = new ImageIcon("appoinment/src/image/arrowtr.png");
        JLabel arrow = new JLabel(imageA);
        arrow.setBounds ( 250, 25, 90, 50); // Adjust the position and size as needed
        add(arrow);


        //SCHEDULE TABLE LABEL
        JLabel schedlabel = new JLabel("Schedule Table");
        schedlabel .setBounds(345, 0, 520, 100);
        schedlabel.setForeground(commonconstant.DARK_BLUE);
        schedlabel.setFont(new Font("Georgia", Font.BOLD, 30));
        add(schedlabel);


        //HOME BUTTON
        JButton home= new JButton("H o m e");
        home.setBounds(25, 180, 170, 40);
        home.setForeground(commonconstant.SECONDARY_COLOR);
        home.setBackground(commonconstant.HOME_BG1_BLUE);;
        home.setFont(new Font("Dialog", Font.BOLD, 15));

        home.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        //set mouse listener
        home.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ScheduleTable.this.dispose();

                new AdminHome().setVisible(true);

            }
        });
        add(home);


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
                ScheduleTable.this.dispose();
                new AdminPageController().setVisible(true);
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
                ScheduleTable.this.dispose();
                new loginpage().setVisible(true);
            }
        });
        add(Logout);


        // Create the table
        BookedAppointment = new JTable(tableModel);

        // Add the table to a scroll pane
        JScrollPane loggedInUsersScrollPane = new JScrollPane(BookedAppointment);

        // Add some spacing around the scroll pane
        loggedInUsersScrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Add the scroll pane to the main panel (using BorderLayout.CENTER by default)
        mainPanel.add(loggedInUsersScrollPane);

        // Add the main panel to the form
        add(mainPanel);

        populateLoggedInUsersTable();



        //logo
        ImageIcon image = new ImageIcon("appoinment/src/image/logotransparent.png");
        JLabel image6 = new JLabel(image);
        image6.setBounds ( -25, -70, 250, 250); // Adjust the position and size as needed
        add(image6);

        //Panel Transparent upper
        JPanel panel2 = new JPanel();

        panel2.setLayout(new BorderLayout());

        JLabel panelLabel2 = new JLabel();
        panel2.add(panelLabel2, BorderLayout.CENTER);
        panel2.setBackground(new Color (255, 255, 255, 110));
        // Set the size and location of the panel
        panel2.setBounds( 0, 0, 220, 120);
        // Add the panel to the main container
        add(panel2);


        //Panel Transparent left
        JPanel panel1 = new JPanel();

        panel1.setLayout(new BorderLayout());

        JLabel panelLabel1 = new JLabel();
        panel1.add(panelLabel1, BorderLayout.CENTER);
        panel1.setBackground(new Color (130, 130, 130, 110));
        // Set the size and location of the panel
        panel1.setBounds( 0, 0, 220, 700);
        // Add the panel to the main container
        add(panel1);


        //left image
        ImageIcon imagee = new ImageIcon("appoinment/src/image/AdminBack.png");
        JLabel image5 = new JLabel(imagee);
        image5.setBounds ( 0, 0, 220, 660); // Adjust the position and size as needed
        add(image5);


        //image right
        ImageIcon imager = new ImageIcon("appoinment/src/image/side.png");
        JLabel image3 = new JLabel(imager);
        image3.setBounds ( 580, -20, 300, 702); // Adjust the position and size as needed
        add(image3);


    }


    private void populateLoggedInUsersTable() {
        DefaultTableModel tableModel = (DefaultTableModel) BookedAppointment.getModel();
        tableModel.setRowCount(0); // Clear the existing data

        List<schedules> Appointment = userDb.getAppointment();
        for (schedules schedules : Appointment) {
            int id = schedules.getid();
            String last_name = schedules.getlast_name();
            String first_name = schedules.getFirst_name();
            String middle_name = schedules.getMidlle_name();
            LocalTime time = schedules.getTime();
            LocalDate date = schedules.getDate();
            //debugger
            //  System.out.println("Logged-in Users:");

            // System.out.println( " Username: " + user.getUsername() + ", Password: " + user.getPassword()+", logged in:"+user.isLoggedIn());

            tableModel.addRow(new Object[]{id, last_name, first_name, middle_name, time, date});


        }

        BookedAppointment.revalidate();
    }

}
