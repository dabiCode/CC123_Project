package adminpage;

import constant.commonconstant;
import db.userDb;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class ScheduleTable extends adminform{
    private JTable BookedAppointment;
    public ScheduleTable() {
        super("MedCare Appointment System");
       addGuiComponents();
    }
    private void addGuiComponents() {
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(commonconstant.HOME_BG1_GRAY);
        mainPanel.setBounds(100, 100, 500, 500);
        // Create a table model
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Id Number");
        tableModel.addColumn("Last Name");
        tableModel.addColumn("First Name");
        tableModel.addColumn("M.I");
        tableModel.addColumn("Time");
        tableModel.addColumn("date");

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
