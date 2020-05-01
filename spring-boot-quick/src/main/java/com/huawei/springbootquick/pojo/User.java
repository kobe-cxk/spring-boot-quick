package com.huawei.springbootquick.pojo;

public class User {
    private String name;
    private int age;
    private String address;
    private String username;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public User(String name, int age, String address, String username) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.username = username;
    }

    public User() {
    }
}
