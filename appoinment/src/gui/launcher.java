package gui;


import db.MyJDBC;

import db.userDb;

import javax.swing.*;

public class launcher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

               //new register().setVisible(true);
                //new Appoinment().setVisible(true);
//new Features().setVisible(true);
            new home().setVisible(true);



<<<<<<< HEAD
//new loginpage().setVisible(true);
=======
                new loginpage().setVisible(true);
>>>>>>> 18b233b53ec4f6f0a0b4329a327c6d10cc3a0b61
//new menu().setVisible(true);
               //new register().setVisible(true);
                //new Appoinment().setVisible(true);
//new Features().setVisible(true);
<<<<<<< HEAD
   new home().setVisible(true);

              // new register().setVisible(true);
=======
           new home().setVisible(true);

               new register().setVisible(true);
>>>>>>> 18b233b53ec4f6f0a0b4329a327c6d10cc3a0b61
                //new Appoinment().setVisible(true);
//new Features().setVisible(true);
            //new home().setVisible(true);


              // System.out.println(MyJDBC.checkuser("username1234"));
               //System.out.println(MyJDBC.register("username1234", "password"));
               // System.out.println(MyJDBC.validatelogin("username1234", "password"));
               //System.out.println(userDb.checkuser(Integer.parseInt("1234")));

               // System.out.println(userDb.validateuser(Integer.parseInt("123"), "admin", "admin","admin", "4:20:30"));

              // System.out.println(userDb.validateuser(Integer.parseInt("123"), "admin", "admin","admin", "4:20:30"));

                //System.out.println(userDb.menu(Integer.parseInt("123"), "admin", "admin","admin", "4:20:30"));

            }
        });
    }
}