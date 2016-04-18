package com.test.ondony.model;

public class User {
     
    private String idx;
    private String name;
    private String dept;
     
    public String getId() {
        return idx;
    }
    public void setId(String idx) {
        this.idx = idx;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
}
