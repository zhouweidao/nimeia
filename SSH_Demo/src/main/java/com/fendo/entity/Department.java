package com.fendo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DEPARTMENT")
public class Department implements Serializable{

    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name="depID")
    private Integer depID;
    @Column(name="depName")
    private String depName;
    @Column(name="depScore")
    private Integer depScore;
    
    

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getDepID() {
		return depID;
	}



	public void setDepID(Integer depID) {
		this.depID = depID;
	}



	public String getDepName() {
		return depName;
	}



	public void setDepName(String depName) {
		this.depName = depName;
	}



	public Integer getDepScore() {
		return depScore;
	}



	public void setDepScore(Integer depScore) {
		this.depScore = depScore;
	}



	@Override
    public String toString() {
        return "User:[depID="+depID+",depName="+depName+",depScore="+depScore+"]";
    }
}