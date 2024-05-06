package adminpage;

import java.time.LocalDate;

public class schedules {
    private int id;
    private String last_name;
    private String first_name;
    private String midlle_name;
    private String time;
    LocalDate date;

    public schedules() {
        // Default constructor

        this.last_name = "";
        this.first_name = "";
        midlle_name = "";
        this.time = "";
    }

    public schedules(int id, String last_name, String first_name, String midlle_name, String time, LocalDate date) {
     this.id = id;
     this.last_name = last_name;
     this.first_name = first_name;
     this.midlle_name = midlle_name;
     this.time = time;
     this.date = date;

    }

    public int getid() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getlast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getMidlle_name() {
        return midlle_name;
    }

    public void setMidlle_name(String midlle_name) {
        this.midlle_name = midlle_name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public LocalDate getDate(){
        return date;

    }
    public void setDate(LocalDate date){
        this.date = date;
    }

}
