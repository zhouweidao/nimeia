package com.fendo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ITEMSCORE")
public class ItemScore implements Serializable{

    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name="itemName")
    private String itemName;
    @Column(name="itemID")
    private String itemID;
    @Column(name="itemType")
    private String itemType;
    @Column(name="itemNo")
    private String itemNo;
    @Column(name="itemScore")
    private String itemScore;
    
    
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getItemID() {
		return itemID;
	}


	public void setItemID(String itemID) {
		this.itemID = itemID;
	}


	public String getItemType() {
		return itemType;
	}


	public void setItemType(String itemType) {
		this.itemType = itemType;
	}


	public String getItemNo() {
		return itemNo;
	}


	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}


	public String getItemScore() {
		return itemScore;
	}


	public void setItemScore(String itemScore) {
		this.itemScore = itemScore;
	}


	@Override
    public String toString() {
        return "User:[itemID="+itemID+",itemName="+itemName+",itemType="+itemType+",itemNo="+itemNo+",itemScore="+itemScore+"]";
    }
}

