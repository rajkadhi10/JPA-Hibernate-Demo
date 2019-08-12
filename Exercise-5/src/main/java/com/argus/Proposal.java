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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author raj
 */
@Entity
public class Proposal {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(length=100)
    private String title;
    
    @Column(length=1000)
    private String comment;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Proposal_id")
    private Set<Personnel> personnel;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Personnel_id")
    
    
    private Set<Attachment> attachments;

    public Proposal() {
    }

    public Proposal(String title, String comment, Set<Personnel> personnel, Set<Attachment> attachments) {
        this.title = title;
        this.comment = comment;
        this.personnel = personnel;
        this.attachments = attachments;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Set<Personnel> getPersonnel() {
        return personnel;
    }

    public void setPersonnel(Set<Personnel> personnel) {
        this.personnel = personnel;
    }

    public Set<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(Set<Attachment> attachments) {
        this.attachments = attachments;
    }

    @Override
    public String toString() {
        return "Proposal{" + "id=" + id + ", title=" + title + ", comment=" + comment + ", personnel=" + personnel + ", attachments=" + attachments + '}';
    }
    
    
    
    
}
