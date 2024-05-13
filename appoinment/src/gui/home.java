package gui;
import constant.commonconstant;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class home extends homepage {
    public home(){
        super("HealthAppointment");
        addGuiComponents();

    }

    private void addGuiComponents() {
        ImageIcon logoIcon = new ImageIcon("appoinment/src/image/434024649_1363976920953749_3166889348485858378_n.png"); // Replace "path_to_your_logo_image_file.jpg" with the actual path to your image file

        // Create a JLabel to display the logo image
        JLabel logoLabel = new JLabel(logoIcon);
        logoLabel.setBounds(-10, 45, 180, 100); // Adjust the position and size as needed
        add(logoLabel);

        JLabel menulabel = new JLabel("Health");

        menulabel.setBounds(0, 53, 400, 100);
        menulabel.setForeground(commonconstant.HOME_BG1_BLUE);

        menulabel.setFont(new Font("Dialog", Font.BOLD, 20));

        menulabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(menulabel);

        JLabel menulabel2 = new JLabel("Appointment");

        menulabel2.setBounds(91, 53, 400, 100);
        menulabel2.setForeground(commonconstant.TEXT_COLOR);

        menulabel2.setFont(new Font("Dialog", Font.BOLD, 20));

        menulabel2.setHorizontalAlignment(SwingConstants.CENTER);

        add(menulabel2);


        //new time menu for the time selection mode

        JLabel home = new JLabel("Home");
        home.setFont(new Font("Dialog", Font.BOLD, 18));


        home.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        home.setForeground(commonconstant.TEXT_COLOR);
        home.setBounds(630, 91, 100,25);


        //reserved space for database

        JLabel Bapp= new JLabel("Book an Appointment");
        Bapp.setFont(new Font("Dialog", Font.BOLD, 18));

        Bapp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Bapp.setForeground(commonconstant.TEXT_COLOR);
        //set mouse listener
        Bapp.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                home.this.dispose();

                new Appoinment().setVisible(true);
            }
        });

        Bapp.setBounds(695, 91, 200,25);

        JLabel about= new JLabel("About Us");
        about.setFont(new Font("Dialog", Font.BOLD, 18));

        about.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        about.setForeground(commonconstant.TEXT_COLOR);
        //set mouse listener
        about.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                home.this.dispose();

                new About().setVisible(true);
            }
        });

        about.setBounds(900, 91, 160,25);

        JButton signin= new JButton("Logout");
        signin.setFont(new Font("Dialog", Font.BOLD, 18));

        signin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        signin.setForeground(commonconstant.SECONDARY_COLOR);
        signin.setBackground(commonconstant.HOME_BG1_BLUE);
        signin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                home.this.dispose();
                new loginpage().setVisible(true);
            }
        });

        signin.setBounds(1000, 81, 150,42);


        add(signin);
        add(about);
        add(Bapp);
        add(home);


        JLabel text = new JLabel("Consult your health");
        text.setBounds(16, 80, 600, 400);
        text.setForeground(commonconstant.TEXT_COLOR.brighter());


        text.setFont(new Font("Dialog", Font.BOLD, 60));
        text.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel label = new JLabel("with our doctor       ");
        label.setBounds(16, 100, 600, 500);
        label.setForeground(commonconstant.TEXT_COLOR.brighter());

        label.setFont(new Font("Dialog", Font.BOLD, 60));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel newlabel = new JLabel("anytime, anywhere.");
        newlabel.setBounds(16, 110, 600, 600);
        newlabel.setForeground(commonconstant.TEXT_COLOR.brighter());

        newlabel.setFont(new Font("Dialog", Font.BOLD, 60));
        newlabel.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel newlabel2 = new JLabel("Talking to your doctor regularly is really important for staying healthy. Being able to");
        newlabel2.setBounds(16, 200, 600, 600);
        newlabel2.setForeground(commonconstant.TEXT_COLOR.brighter());

        newlabel2.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 15));
        newlabel2.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel newlabel3 = new JLabel("chat with them whenever and wherever makes it easier to catch and handle health ");
        newlabel3.setBounds(16, 220, 600, 600);
        newlabel3.setForeground(commonconstant.TEXT_COLOR.brighter());

        newlabel3.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 15));
        newlabel3.setHorizontalAlignment(SwingConstants.CENTER);



        JLabel newlabel5 = new JLabel("Book your appointment now. With Medcare, your health is our priority. Accessible ");
        newlabel5.setBounds(16, 240, 600, 600);
        newlabel5.setForeground(commonconstant.TEXT_COLOR.brighter());

        newlabel5.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 15));
        newlabel5.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel newlabel6 = new JLabel("consultations mean we're here whenever you need us, wherever you are. It's         ");
        newlabel6.setBounds(16, 260, 600, 600);
        newlabel6.setForeground(commonconstant.TEXT_COLOR.brighter());

        newlabel6.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 15));
        newlabel6.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel newlabel7 = new JLabel("about proactive care, catching issues early, and keeping you feeling your best.      ");
        newlabel7.setBounds(16, 280, 600, 600);
        newlabel7.setForeground(commonconstant.TEXT_COLOR.brighter());

        newlabel7.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 15));
        newlabel7.setHorizontalAlignment(SwingConstants.CENTER);



        add(newlabel7);
        add(newlabel6);
        add(newlabel5);
        add(newlabel3);
        add(newlabel2);
        add(newlabel);
        add(label);
        add(text);

        JPanel appointmentPanel = new JPanel();
        appointmentPanel.setLayout(null); // Set the layout to null to allow positioning components manually
        appointmentPanel.setBounds(670, 165, 520, 170); // Set the bounds of the panel
        appointmentPanel.setBackground(new Color(1, 122, 194, 100));

        JLabel Appoinment = new JLabel("APPOINTMENT");
        Appoinment.setBounds(10, 10, 500, 50); // Adjust the bounds and position of the label
        Appoinment.setFont(new Font("Dialog", Font.BOLD, 38));
        Appoinment.setForeground(commonconstant.SECONDARY_COLOR);

        JLabel AppoinmentBook = new JLabel("Want an appointment?");
        AppoinmentBook.setBounds(15, 50, 500, 50); // Adjust the bounds and position of the label
        AppoinmentBook.setForeground(commonconstant.SECONDARY_COLOR);
        AppoinmentBook.setFont(new Font("Dialog", Font.BOLD, 20));

        ImageIcon appointmentPic= new ImageIcon("appoinment/src/image/FINALAPPOINTMENTBGREMOVED.png");
        JLabel HomeImgAppointmentlabel = new JLabel (appointmentPic);
        HomeImgAppointmentlabel.setBounds(285, -85, 300, 350); // Adjust the position and size as needed


        JButton book = new JButton("Book Now");
        book.setFont(new Font("Dialog", Font.BOLD, 15));

        book.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        book.setBounds(710, 280, 150, 30);
        book.setForeground(commonconstant.TEXT_COLOR);
        //set mouse listener
        book.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                home.this.dispose();

                new Appoinment().setVisible(true);
            }
        });


        JPanel hoursPanel = new JPanel();
        hoursPanel.setLayout(null); // Set the layout to null to allow positioning components manually
        hoursPanel.setBounds(670, 370, 520, 170); // Set the bounds of the panel
        hoursPanel.setBackground(new Color(1, 122, 194, 100));

        JLabel hours = new JLabel("OPENING HOURS");
        hours.setLayout(null);
        hours.setFont(new Font("Dialog", Font.BOLD, 38));
        hours.setForeground(commonconstant.SECONDARY_COLOR);
        hours.setBounds(10, 10, 500, 50); // Adjust the bounds and position of the label



        JButton time = new JButton("8:00 AM-11:00 AM");
        time.setFont(new Font("Dialog", Font.BOLD, 14));

        time.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        time.setForeground(commonconstant.TEXT_COLOR);
        time.setBounds(675, 438, 159,30);

        time.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                home.this.dispose();

                new Appoinment().setVisible(true);
            }
        });


        JLabel to = new JLabel("TO");
        to.setFont(new Font("Dialog", Font.BOLD, 18));
        to.setBounds(842, 428, 30, 50);
        to.setForeground(commonconstant.TEXT_COLOR);

        JButton time2 = new JButton("1:00 PM-5:00 PM ");
        time2.setFont(new Font("Dialog", Font.BOLD, 14));

        time2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        time2.setBounds(877, 438, 159,30);
        time2.setForeground(commonconstant.TEXT_COLOR);
        time2.setBounds(877, 438, 159,30);

        time2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                home.this.dispose();

                new Appoinment().setVisible(true);
            }
        });

        ImageIcon hoursHomeImg= new ImageIcon("appoinment/src/image/FINALHOURSBGREMOVED.png");
        JLabel HomeClockImg = new JLabel(hoursHomeImg);
        HomeClockImg.setBounds(955, 285, 300, 350);



        JLabel openingDays = new JLabel("<html><u>Monday to Saturday</u></html>");
        openingDays.setFont(new Font("Dialog", Font.BOLD, 30));
        openingDays.setForeground(commonconstant.SECONDARY_COLOR);
        openingDays.setBounds(25, 110, 500,40);
        openingDays.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


        appointmentPanel.add(Appoinment); // Add the label to the panel
        appointmentPanel.add(AppoinmentBook);
        appointmentPanel.add( HomeImgAppointmentlabel);
        add(book);
        add(appointmentPanel); // Add the panel to the main container

        hoursPanel.add(openingDays);
        hoursPanel.add(hours);
        add(time2);
        add(HomeClockImg);
        add(to);
        add(time);
        add(hoursPanel);


        JPanel contact = new JPanel(null);
        contact.setBounds(670, 575, 520, 170);
        contact.setBackground(new Color(1, 122, 194, 100));

        JLabel emergencyServices = new JLabel("EMERGENCY SERVICE");
        emergencyServices.setFont (new Font ("Dialog", Font.BOLD, 38));
        emergencyServices.setBounds(10,15, 500, 40);
        emergencyServices.setForeground(commonconstant.SECONDARY_COLOR);

        ImageIcon contactPic = new ImageIcon("appoinment/src/image/CONTACTFINALBGREMOVED.png");
        JLabel homeContactImg = new JLabel(contactPic);
        homeContactImg.setBounds(285, -85, 300, 350);

         JLabel EmergencyText = new JLabel("Emergency Service");
        EmergencyText.setBounds(700, 300, 400, 400);
        EmergencyText.setBackground(commonconstant.BLUE_COLOR);
        EmergencyText.setForeground(commonconstant.TEXT_COLOR);

        ImageIcon telephonePic = new ImageIcon("appoinment/src/image/telephoneImgSmall.png");
        JLabel telImgSmall = new JLabel(telephonePic);
        telImgSmall.setBounds(5,55, 30, 25);


        JLabel txttelNum = new JLabel("TEL. NO.");
        txttelNum.setForeground(commonconstant.SECONDARY_COLOR);
        txttelNum.setFont(new Font("Dialog", Font.BOLD, 23));
        txttelNum.setBounds(40,45, 200, 50);

        JLabel telNum = new JLabel("<html><u> 0234-567-890</u></html>");
        telNum.setForeground(commonconstant.TEXT_COLOR);
        telNum.setFont(new Font("Dialog", Font.BOLD, 17));
        telNum.setBounds(15,75, 300, 50);


        ImageIcon gmailPicSmall  = new ImageIcon("appoinment/src/image/gmaiLogoSmall.png");
        JLabel gmailImg = new JLabel(gmailPicSmall);
        gmailImg.setBounds(170,55, 30, 25);

        JLabel txtEmail = new JLabel("E-MAIL:");
        txtEmail.setForeground(commonconstant.SECONDARY_COLOR);
        txtEmail.setFont(new Font("Dialog", Font.BOLD, 23));
        txtEmail.setBounds(205,45, 300, 50);

        JLabel email = new JLabel("<html><u> MedCare.cebu.ph@gmail.com</u></html>");
        email.setFont(new Font("Dialog", Font.BOLD, 17));
        email.setForeground(commonconstant.TEXT_COLOR);
        email.setBounds(180,75, 300, 50);


        contact.add(emergencyServices);
        contact.add(telImgSmall);
        contact.add(txttelNum);
        contact.add(telNum);
        contact.add(gmailImg);
        contact.add(txtEmail);
        contact.add(email);
        contact.add(homeContactImg);
        add(contact);


// chelsie kuwang - add bg pic sa right side

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());

        JLabel panelLabel = new JLabel();
        panel1.add(panelLabel, BorderLayout.CENTER);
        panel1.setBounds(0, 0, 1300, 150);

        add(panel1); // white panel above



        JPanel panel2 = new JPanel();
        panel2.setBounds(0, 150, 630, 650);
        panel2.add(panelLabel, BorderLayout.CENTER);
        panel2.setBackground(commonconstant.HOME_BG1_GRAY);

        ImageIcon BG_Grayish = new ImageIcon ("appoinment/src/image/doctorsIMG.png");
        JLabel HomeBG_left = new JLabel(BG_Grayish);
        HomeBG_left.setBounds(0, 0, 900, 650);

        panel2.add(HomeBG_left);
   add(panel2); // grayish bg



        ImageIcon bgBlue = new ImageIcon ("appoinment/src/image/flat-lay-medical-desk-with-equipment (1).jpg");
        JLabel bgBlueRight = new JLabel(bgBlue);
        bgBlueRight.setBounds(0, 0, 650, 650);

        JPanel panel3 = new JPanel(new BorderLayout());
        JLabel panelLabel3 = new JLabel();
        panel3.add(panelLabel3, BorderLayout.CENTER);
        panel3.setBackground(commonconstant.HOME_BG1_BLUE);
        panel3.setBounds(600, 150, 650, 650);

        panel3.add(bgBlueRight);
                add(panel3); //blue bg right




        ImageIcon BG_blue = new ImageIcon ("appoinment/src/image/hex3.png");
        JLabel BG_right = new JLabel(BG_blue);
        HomeBG_left.setBounds(0, 0, 900, 650);



    }
}
