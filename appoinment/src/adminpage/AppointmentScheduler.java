package adminpage;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class AppointmentScheduler extends JFrame {
    private JPanel calendarPanel;
    private List<String> appointments;
    private Calendar currentCalendar;

    public AppointmentScheduler() {
        setTitle("Appointment Scheduler");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        appointments = new ArrayList<>();
        currentCalendar = Calendar.getInstance();

        JPanel contentPane = new JPanel(new BorderLayout());
        setContentPane(contentPane);

        JPanel headerPanel = new JPanel(new BorderLayout());
        contentPane.add(headerPanel, BorderLayout.NORTH);

        JButton prevMonthButton = new JButton("<");
        prevMonthButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentCalendar.add(Calendar.MONTH, -1);
                displayCalendar();
            }
        });
        headerPanel.add(prevMonthButton, BorderLayout.WEST);

        JButton nextMonthButton = new JButton(">");
        nextMonthButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentCalendar.add(Calendar.MONTH, 1);
                displayCalendar();
            }
        });
        headerPanel.add(nextMonthButton, BorderLayout.EAST);

        JLabel monthYearLabel = new JLabel();
        headerPanel.add(monthYearLabel, BorderLayout.CENTER);

        calendarPanel = new JPanel(new GridLayout(0, 7));
        contentPane.add(calendarPanel, BorderLayout.CENTER);

        displayCalendar();

        calendarPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int day = Integer.parseInt(((JLabel) e.getComponent()).getText().trim());
                String date = String.format("%02d", day);
                String month = String.format("%02d", currentCalendar.get(Calendar.MONTH) + 1);
                String year = String.valueOf(currentCalendar.get(Calendar.YEAR));
                String selectedDate = year + "-" + month + "-" + date;

                String[] times = {"9:00 AM", "10:00 AM", "11:00 AM", "12:00 PM", "1:00 PM", "2:00 PM", "3:00 PM", "4:00 PM"};

                String selectedTime = (String) JOptionPane.showInputDialog(AppointmentScheduler.this,
                        "Select appointment time:", "Appointment Time", JOptionPane.PLAIN_MESSAGE, null, times, times[0]);

                if (selectedTime != null) {
                    String patientName = JOptionPane.showInputDialog(AppointmentScheduler.this, "Enter patient name:");
                    appointments.add(selectedDate + " " + selectedTime + " - " + patientName);
                    displayCalendar();
                }
            }
        });

        setVisible(true);
    }

    private void displayCalendar() {
        calendarPanel.removeAll();

        SimpleDateFormat sdf = new SimpleDateFormat("MMMM yyyy");
        Label monthYearLabel = new Label();
        monthYearLabel.setText(sdf.format(currentCalendar.getTime()));

        // Add labels for days of the week
        String[] daysOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        for (String day : daysOfWeek) {
            JLabel label = new JLabel(day, SwingConstants.CENTER);
            label.setBorder(new EmptyBorder(5, 5, 5, 5));
            calendarPanel.add(label);
        }

        // Set the calendar to the first day of the month
        currentCalendar.set(Calendar.DAY_OF_MONTH, 1);

        // Fill in the calendar with appointments
        int firstDayOfWeek = currentCalendar.get(Calendar.DAY_OF_WEEK);
        for (int i = 1; i < firstDayOfWeek; i++) {
            calendarPanel.add(new JLabel(""));
        }

        int currentMonth = currentCalendar.get(Calendar.MONTH);
        while (currentCalendar.get(Calendar.MONTH) == currentMonth) {
            String dayString = String.valueOf(currentCalendar.get(Calendar.DAY_OF_MONTH));
            JLabel dayLabel = new JLabel(dayString, SwingConstants.CENTER);
            dayLabel.setBorder(new EmptyBorder(5, 5, 5, 5));
            for (String appointment : appointments) {
                if (appointment.startsWith(dayString)) {
                    dayLabel.setText("<html>" + dayString + "<br>" + appointment.substring(appointment.indexOf('-') + 1) + "</html>");
                    break;
                }
            }
            calendarPanel.add(dayLabel);
            currentCalendar.add(Calendar.DAY_OF_MONTH, 1);
        }
    }
}