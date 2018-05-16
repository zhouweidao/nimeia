package com.fendo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PALYERENTRYFORM")
public class PlayerEntryForm implements Serializable{

    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name="playerID")
    private Integer playerID;
    @Column(name="depID")
    private String depID;
    @Column(name="itemID")
    private String itemID;
    @Column(name="playerName")
    private String playerName;
    @Column(name="itemType")
    private String itemType;
    @Column(name="itemName")
    private String itemName;
    @Column(name="itemNo")
    private String itemNo;
    @Column(name="itemScore")
    private Integer itemScore;
    @Column(name="record")
    private String record;
    
    
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getPlayerID() {
		return playerID;
	}


	public void setPlayerID(Integer playerID) {
		this.playerID = playerID;
	}


	public String getDepID() {
		return depID;
	}


	public void setDepID(String depID) {
		this.depID = depID;
	}


	public String getItemID() {
		return itemID;
	}


	public void setItemID(String itemID) {
		this.itemID = itemID;
	}


	public String getPlayerName() {
		return playerName;
	}


	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}


	public String getItemType() {
		return itemType;
	}


	public void setItemType(String itemType) {
		this.itemType = itemType;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getItemNo() {
		return itemNo;
	}


	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}


	public Integer getItemScore() {
		return itemScore;
	}


	public void setItemScore(Integer itemScore) {
		this.itemScore = itemScore;
	}


	public String getRecord() {
		return record;
	}


	public void setRecord(String record) {
		this.record = record;
	}


	@Override
    public String toString() {
        return "User:[playerID="+playerID+",depID="+depID+",itemID="+itemID+",playerName="+playerName+",itemType="+itemType+",itemName="+itemName+",itemNo="+itemNo+",itemScore="+itemScore+",record="+record+"]";
    }
}

