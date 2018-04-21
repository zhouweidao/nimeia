package com.fendo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DEPENTRYFORM") 
public class DepEntryForm implements Serializable{

	    @Id 
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Integer id;

	    @Column(name="depID")
	    private Integer depID;
	    @Column(name="itemID")
	    private String itemID;
	    @Column(name="itemMax")
	    private Integer itemMax;
	    @Column(name="depEntryNum")
	    private Integer depEntryNum;
	    
	    
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


		public String getItemID() {
			return itemID;
		}


		public void setItemID(String itemID) {
			this.itemID = itemID;
		}


		public Integer getItemMax() {
			return itemMax;
		}


		public void setItemMax(Integer itemMax) {
			this.itemMax = itemMax;
		}


		public Integer getDepEntryNum() {
			return depEntryNum;
		}


		public void setDepEntryNum(Integer depEntryNum) {
			this.depEntryNum = depEntryNum;
		}


		@Override
	    public String toString() {
	        return "User:[depID="+depID+",itemID="+itemID+",itemMax="+itemMax+",depEntryNum="+depEntryNum+"]";
	    }
}
