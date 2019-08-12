/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argus.demoonetoone;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author raj
 */
@Entity
@Table(name="student",schema="public")
public class Student {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fname;
    private String lname;
    private String prefix;
    private String suffix;
    private String email;
    private String phone;
    
    @Embedded
    private Address address;

    public Student() {
    }
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ed_id", referencedColumnName = "id")
    private Education education;

    public Student(String fname, String lname, String prefix, String suffix, String email, String phone, Address address, Education education) {
        this.fname = fname;
        this.lname = lname;
        this.prefix = prefix;
        this.suffix = suffix;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.education = education;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int eid) {
        this.id = eid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }
    
    
    
}
