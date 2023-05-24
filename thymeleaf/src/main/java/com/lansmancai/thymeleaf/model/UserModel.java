package com.lansmancai.thymeleaf.model;

public class UserModel {
    private String name;
    private Integer age;
    private  String password;
    private String email;
    private  String desc;

    public UserModel(String name, int age, String password) {
        this.name=name;
        this.age=age;
        this.password=password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDesc() {
        return desc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


}
