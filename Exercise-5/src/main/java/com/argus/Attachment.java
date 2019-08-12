/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argus;


import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/*
 * @author raj
 */
@Entity
public class Attachment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String filename;

    private String filesize;

    private Timestamp Created;

    private byte[] Attachment;

    public Attachment(String filename, String filesize, Timestamp Created, byte[] Attachment) {
        this.filename = filename;
        this.filesize = filesize;
        this.Created = Created;
        this.Attachment = Attachment;
    }

    public Attachment() {
    }

    
   
    

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilesize() {
        return filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize;
    }

    public Timestamp getCreated() {
        return Created;
    }

    public void setCreated(Timestamp Created) {
        this.Created = Created;
    }

    public byte[] getAttachment() {
        return Attachment;
    }

    public void setAttachment(byte[] Attachment) {
        this.Attachment = Attachment;
    }

    @Override
    public String toString() {
        return "Attachment{" + "id=" + id + ", filename=" + filename + ", filesize=" + filesize + ", Created=" + Created + ", Attachment=" + Attachment + '}';
    }
    

   

}
