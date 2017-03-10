/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.bean;

/**
 *
 * @author shraddha
 */
public class SignUpBean {

    private String firstName;
    private String emailId;
    private String password;
    private String address;
    private String city;
    private String state;
    private String country;
    private int zipCode;
    private String phoneNo;
    private int confirm;
    private int pending;
    private int rejected;
    private int studentId;

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getState() {
        return state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public void setConfirm(int confirm) {
        this.confirm = confirm;
    }

    public void setPending(int pending) {
        this.pending = pending;
    }

    public void setRejected(int rejected) {
        this.rejected = rejected;
    }
    

    public int getConfirm() {
        return confirm;
    }

    public int getPending() {
        return pending;
    }

    public int getRejected() {
        return rejected;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
    
}


