package gui;


import adminpage.AdminPageController;
import adminpage.ScheduleTable;
import adminpage.User;
import adminpage.calendar;
import db.MyJDBC;

import javax.swing.*;
import java.util.List;

public class launcher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                    // new register().setVisible(true);


//                List<User> loggedInUsers = MyJDBC.getLoggedInUsers();
//                System.out.println("Logged-in Users:");
//                for (User user : loggedInUsers) {
//                    System.out.println( " Username: " + user.getUsername() + ", Password: " + user.getPassword()+", logged in:"+user.isLoggedIn());
//                }//new home().setVisible(true);
                //  new register().setVisible(true);

              //  new AdminPageController().setVisible(true);

                new ScheduleTable().setVisible(true);
                    //  new home().setVisible(true);

                    //new register().setVisible(true);

                    // new home().setVisible(true);

                    //new typeAppointment().setVisible(true);
                    //new register().setVisible(true);


//               new register().setVisible(true);


                    //new Appoinment().setVisible(true);
//new Features().setVisible(true);
                    //new home().setVisible(true);


                    // System.out.println(MyJDBC.checkuser("username1234"));
                    //System.out.println(MyJDBC.register("username1234", "password"));
                    // System.out.println(MyJDBC.validatelogin("username1234", "password"));
                    //System.out.println(userDb.checkuser(Integer.parseInt("1234")));

                    // System.out.println(userDb.validateuser(Integer.parseInt("123"), "admin", "admin","admin", "4:20:30"));

                    // System.out.println(userDb.validateuser(Integer.parseInt("123"), "admin", "admin","admin", "4:20:30"));

                    // System.out.println(userDb.book(Integer.parseInt("123"), "admin", "admin","admin", "4:20:30"));
                }

        });
    }
}