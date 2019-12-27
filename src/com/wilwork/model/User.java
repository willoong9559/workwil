package com.wilwork.model;

public class User {

    private int id;
    private String userName;
    private String password;

    public User() {
        super();
    }
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public void setUserName(String username) {
        this.userName = username;
    }
    public String getUserName() {
        return this.userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return this.password;
    }

}
