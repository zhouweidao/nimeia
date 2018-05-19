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
@Table(name="admin")
public class Admin implements Serializable{

	    @Id 
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Integer id;

	    @Column(name="adminName")
	    private String adminName;
	    @Column(name="adminID")
	    private String adminID;
	    @Column(name="password")
	    private String password;
	    @Column(name="priority")
	    private Integer priority;
	    
	    
	    public Integer getId() {
			return id;
		}



		public void setId(Integer id) {
			this.id = id;
		}



		public String getAdminName() {
			return adminName;
		}



		public void setAdminName(String adminName) {
			this.adminName = adminName;
		}



		public String getAdminID() {
			return adminID;
		}



		public void setAdminID(String adminID) {
			this.adminID = adminID;
		}



		public String getPassword() {
			return password;
		}



		public void setPassword(String password) {
			this.password = password;
		}



		public Integer getPriority() {
			return priority;
		}



		public void setPriority(Integer priority) {
			this.priority = priority;
		}



		@Override
	    public String toString() {
	        return "User:[id="+adminID+",name="+adminName+",priority="+priority+"]";
	    }
}
