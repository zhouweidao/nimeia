package com.fendo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PLAYER")
public class Player implements Serializable{
	    @Column(name="player")
	    private String player;
	    @Id 
	    @Column(name="playerID")
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private String playerID;
	    @Column(name="password")
	    private String password;
	    @Column(name="playerName")
	    private String playerName;
	    @Column(name="sex")
	    private String sex;
	    @Column(name="Class")
	    private String classes;
	    @Column(name="grade")
	    private String grade;
	    @Column(name="major")
	    private String major;
	    @Column(name="depID")
	    private String depID;
	    @Column(name="depName")
	    private String depName;
	    @Column(name="Score")
	    private Integer Score;
	    @Column(name="Tel")
	    private String Tel;
	    @Column(name="priority")
	    private String priority;
	    @Column(name="playerEntryNum")
	    private Integer playerEntryNum;
	    
	    
	
	    public String getClasses() {
			return classes;
		}
	    
	    public void setClasses(String classes) {
			this.classes = classes;
		}

		public String getPlayer() {
			return player;
		}


		public void setPlayer(String player) {
			this.player = player;
		}


		public String getPlayerID() {
			return playerID;
		}


		public void setPlayerID(String playerID) {
			this.playerID = playerID;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getPlayerName() {
			return playerName;
		}


		public void setPlayerName(String playerName) {
			this.playerName = playerName;
		}


		public String getSex() {
			return sex;
		}


		public void setSex(String sex) {
			this.sex = sex;
		}

		public String getGrade() {
			return grade;
		}


		public void setGrade(String grade) {
			this.grade = grade;
		}


		public String getMajor() {
			return major;
		}


		public void setMajor(String major) {
			this.major = major;
		}


		public String getDepID() {
			return depID;
		}


		public void setDepID(String depID) {
			this.depID = depID;
		}


		public String getDepName() {
			return depName;
		}


		public void setDepName(String depName) {
			this.depName = depName;
		}


		public Integer getScore() {
			return Score;
		}


		public void setScore(Integer score) {
			Score = score;
		}


		public String getTel() {
			return Tel;
		}


		public void setTel(String tel) {
			Tel = tel;
		}


		public String getPriority() {
			return priority;
		}


		public void setPriority(String priority) {
			this.priority = priority;
		}


		public Integer getPlayerEntryNum() {
			return playerEntryNum;
		}


		public void setPlayerEntryNum(Integer playerEntryNum) {
			this.playerEntryNum = playerEntryNum;
		}

		@Override
		public String toString() {
			return "Player [player=" + player + ", playerID=" + playerID + ", password=" + password + ", playerName="
					+ playerName + ", sex=" + sex + ", classes=" + classes + ", grade=" + grade + ", major=" + major
					+ ", depID=" + depID + ", depName=" + depName + ", Score=" + Score + ", Tel=" + Tel + ", priority="
					+ priority + ", playerEntryNum=" + playerEntryNum + "]";
		}


	
}
