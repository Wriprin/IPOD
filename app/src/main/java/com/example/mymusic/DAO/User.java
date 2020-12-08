package com.example.mymusic.DAO;

public class User {
    private int ID;
    private String password;
    private String username;
    private String name;
    private int sex;

    public User() {
    }

    public User(int ID, String password, String username, String name, int sex) {
        this.ID = ID;
        this.password = password;
        this.username = username;
        this.name = name;
        this.sex = sex;
    }

    public User(String password, String username, String name, int sex) {
        this.password = password;
        this.username = username;
        this.name = name;
        this.sex = sex;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
