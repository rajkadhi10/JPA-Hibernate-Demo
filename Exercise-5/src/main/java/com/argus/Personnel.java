/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argus;

import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Pattern;

/**
 *
 * @author raj
 */
@Entity
public class Personnel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(length=60)
    private String name;
    
    
    private QualificationLevel.q_level qualificationLevel;
    
    @Column(length=10)
    @Pattern(regexp="(^$|[0-9]{10})")
    private String contact;

    public Personnel() {
    }
    
    

    public Personnel(String name, QualificationLevel.q_level qualificationLevel, String contact) {
        this.name = name;
        this.qualificationLevel = qualificationLevel;
        this.contact = contact;
       
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QualificationLevel.q_level getQualificationLevel() {
        return qualificationLevel;
    }

    public void setQualificationLevel(QualificationLevel.q_level qualificationLevel) {
        this.qualificationLevel = qualificationLevel;
    }

    

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Personnel{" + "id=" + id + ", name=" + name + ", qualificationLevel=" + qualificationLevel + ", contact=" + contact + '}';
    }
    

   
    
        
}
