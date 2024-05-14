package adminpage;


public class User {
    private String username;
    private String email;
    private String password;
    private boolean isLoggedIn;
    private int id;

    public User() {
        // Default constructor
        username ="";
        password = "";
        isLoggedIn = false;

    }

    public User(int id, String username,String email, String password, boolean isLoggedIn) {
       this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.isLoggedIn = isLoggedIn;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }
    public int getid(){
        return id;
    }
    public void setid(int id){
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}