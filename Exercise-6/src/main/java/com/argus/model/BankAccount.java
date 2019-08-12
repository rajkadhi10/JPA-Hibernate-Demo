package com.argus.model;

import javax.persistence.*;
import javax.validation.constraints.*;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 *
 * @author raj
 */
@Entity
@Table(name = "bankaccount")
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "number", length = 16)
    @NotNull
    private String number;
    
    @Column(name = "bankname", length = 25)
    @NotNull
    private String bankname;
    
    @Column(name = "swift", length = 10)
    @NotNull
    private String swift;

    public BankAccount() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getSwift() {
        return swift;
    }

    public void setSwift(String swift) {
        this.swift = swift;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this,ToStringStyle.MULTI_LINE_STYLE);
    }
}
