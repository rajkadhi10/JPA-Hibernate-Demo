/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argus.demoonetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author raj
 */
@Entity
@Table(name="education",schema="public")
public class Education {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String degreetype;
    private String degree;
    private String gyear;
    private String school;

    public Education() {
    }

    
    public Education(String degreetype, String degree, String gyear, String school) {
        this.degreetype = degreetype;
        this.degree = degree;
        this.gyear = gyear;
        this.school = school;
       
    }

    @OneToOne(mappedBy = "education")
    private Student student;

    public String getDegreetype() {
        return degreetype;
    }

    public void setDegreetype(String degreetype) {
        this.degreetype = degreetype;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getGyear() {
        return gyear;
    }

    public void setGyear(String gyear) {
        this.gyear = gyear;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    
}
