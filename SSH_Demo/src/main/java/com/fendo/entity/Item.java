package com.fendo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ITEM")
public class Item implements Serializable{

    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name="itemName")
    private String itemName;
    @Column(name="itemID")
    private String itemID;
    @Column(name="itemSex")
    private String itemSex;
    @Column(name="itemType")
    private String itemType;
    @Column(name="record")
    private String record;
    @Column(name="recordHolder")
    private String recordHolder;
    @Column(name="itemMax")
    private Integer itemMax;
    
    
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


	public String getItemSex() {
		return itemSex;
	}


	public void setItemSex(String itemSex) {
		this.itemSex = itemSex;
	}


	public String getItemType() {
		return itemType;
	}


	public void setItemType(String itemType) {
		this.itemType = itemType;
	}


	public String getRecord() {
		return record;
	}


	public void setRecord(String record) {
		this.record = record;
	}


	public String getRecordHolder() {
		return recordHolder;
	}


	public void setRecordHolder(String recordHolder) {
		this.recordHolder = recordHolder;
	}


	public Integer getItemMax() {
		return itemMax;
	}


	public void setItemMax(Integer itemMax) {
		this.itemMax = itemMax;
	}

	@Override
    public String toString() {
        return "User:[itemID="+itemID+",itemName="+itemName+",itemSex="+itemSex+",itemType="+itemType+",record="+record+",recordHolder="+recordHolder+",itemMax="+itemMax+"]";
    }
}
