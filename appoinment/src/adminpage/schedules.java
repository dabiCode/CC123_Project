package adminpage;

public class schedules {
    private int id;
    private String last_name;
    private String first_name;
    private String midlle_name;
    private String time;

    public schedules() {
        // Default constructor

        last_name = "";
        first_name = "";
        midlle_name = "";
        time = "";
    }

    public schedules(int id,String last_name, String first_name, String midlle_name, String time) {
     this.id = id;
     this.last_name = last_name;
     this.first_name = first_name;
     this.midlle_name = midlle_name;
     this.time = time;

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

}
