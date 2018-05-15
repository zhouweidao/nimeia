package com.fendo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "controller")
public class SystemController implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Boolean isrunning;
	
	public SystemController(){}
	
	public SystemController(Integer id,Boolean isrunning){
		this.id = id;
		this.isrunning = isrunning;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getIsrunning() {
		return isrunning;
	}
	public void setIsrunning(Boolean isrunning) {
		this.isrunning = isrunning;
	}
	
}
