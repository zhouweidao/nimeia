package com.fendo.util;

import java.util.List;

import com.fendo.entity.PlayerEntryForm;

public class PlayerInfoDto {
	private List<PlayerEntryForm> entryForms;
	private String sumItemScore;
	private String deptNum;
	private String schoolNum;
	
	public PlayerInfoDto(){}
	
	public PlayerInfoDto(List<PlayerEntryForm> entryForm,String sumItemScore, String deptNum, String schoolNum) {
		super();
		this.entryForms = entryForm;
		this.sumItemScore = sumItemScore;
		this.deptNum = deptNum;
		this.schoolNum = schoolNum;
	}
	public List<PlayerEntryForm> getEntryForm() {
		return entryForms;
	}
	public void setEntryForm(List<PlayerEntryForm> entryForm) {
		this.entryForms = entryForm;
	}
	public String getSumItemScore() {
		return sumItemScore;
	}
	public void setSumItemScore(String sumItemScore) {
		this.sumItemScore = sumItemScore;
	}
	public String getDeptNum() {
		return deptNum;
	}
	public void setDeptNum(String deptNum) {
		this.deptNum = deptNum;
	}
	public String getSchoolNum() {
		return schoolNum;
	}
	public void setSchoolNum(String schoolNum) {
		this.schoolNum = schoolNum;
	}
	
	
}
