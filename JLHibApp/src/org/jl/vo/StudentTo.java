/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jl.vo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Rishitha
 */
@Entity
@Table(name="jlstudents")
public class StudentTo {
    @Id
    private int sid;
    @Column(name="jlsfname")
    private String sfname;
    @Column(name="jlslname")
    private String slname;
    @Temporal(TemporalType.DATE)

    private Date   sbdate;
    public StudentTo(){
        
    }

    public Date getSbdate() {
        return sbdate;
    }

    public void setSbdate(Date sbdate) {
        this.sbdate = sbdate;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSfname() {
        return sfname;
    }

    public void setSfname(String sfname) {
        this.sfname = sfname;
    }

    public String getSlname() {
        return slname;
    }

    public void setSlname(String slname) {
        this.slname = slname;
    }
    
    
   
    
}
