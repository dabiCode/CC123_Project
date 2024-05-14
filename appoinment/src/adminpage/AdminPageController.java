package adminpage;

import constant.commonconstant;
import db.MyJDBC;
import gui.form;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class AdminPageController extends adminform {
    private final JTable loggedInUsersTable;


    public AdminPageController() {
        super("MedCare Appointment System");

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(commonconstant.HOME_BG1_GRAY);
    mainPanel.setBounds(100, 100, 500, 500);
        // Create a table model
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Id Number");
        tableModel.addColumn("Username");
        tableModel.addColumn("Email");
        tableModel.addColumn("Password");
        tableModel.addColumn("Logged In");
        // Create the table
        loggedInUsersTable = new JTable(tableModel);

        // Add the table to a scroll pane
        JScrollPane loggedInUsersScrollPane = new JScrollPane(loggedInUsersTable);

        // Add some spacing around the scroll pane
        loggedInUsersScrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Add the scroll pane to the main panel (using BorderLayout.CENTER by default)
        mainPanel.add(loggedInUsersScrollPane);

        // Add the main panel to the form
        add(mainPanel);

        populateLoggedInUsersTable();
    }
    private void populateLoggedInUsersTable() {
        DefaultTableModel tableModel = (DefaultTableModel) loggedInUsersTable.getModel();
        tableModel.setRowCount(0); // Clear the existing data

        List<User> loggedInUsers = MyJDBC.getLoggedInUsers();
        for (User user : loggedInUsers) {
            int id = user.getid();
            String username = user.getUsername();
            String email = user.getEmail();
            // Consider removing password from the table for security reasons.
            String password = user.getPassword();
            boolean isLoggedIn = user.isLoggedIn();

            //debugger
          //  System.out.println("Logged-in Users:");

           // System.out.println( " Username: " + user.getUsername() + ", Password: " + user.getPassword()+", logged in:"+user.isLoggedIn());

            tableModel.addRow(new Object[]{id, username, email, password, isLoggedIn});


        }

        loggedInUsersTable.revalidate();
    }

}
