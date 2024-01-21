package com.school.sample;

public class Login {
    private String Username;
    private String password;

    public Login(String Usermane, String password){
        this.Username = Usermane;
        this.password = password;
    }
    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
