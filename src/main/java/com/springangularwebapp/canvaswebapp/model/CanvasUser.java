package com.springangularwebapp.canvaswebapp.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class CanvasUser implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String userName;
    private String email;
    private String phoneNumber;
    private String company;
    private String jobTitle;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String employeeId;

    public CanvasUser() {
    }

    public CanvasUser(String userName, String email, String phoneNumber, String company, String jobTitle, String imageUrl, String employeeId) {
        this.userName = userName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.company = company;
        this.jobTitle = jobTitle;
        this.imageUrl = imageUrl;
        this.employeeId = employeeId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "CanvasUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", company='" + company + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", employeeId=" + employeeId +
                '}';
    }
}