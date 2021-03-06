package com.liu.entitys;

/**
 * @COMPANY:
 * @CLASS:User
 * @DESCRIPTION:
 * @AUTHOR:LYZH
 * @VERSION:v1.0
 * @DATE:2017/3/29
 */
public class User {
    private Integer id;
    private String username;
    private String password;
    private int age;
    private int balance;

    public User() {
    }

    public User(Integer id, String username, String password, int age, int balance) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                '}';
    }
}
