package com.fendo.util;

public class PlayerDto {

	private String id;
	private String name;
	private String sex;
	private String grade;
	private String cls;
	private String marjor;
	private String dept;
	private Integer score;
	private Integer scorenum;
	private Integer clsnum;
	private Integer marjornum;
	private Integer deptnum;
	private Integer schoolnum;

	public PlayerDto() {
		// TODO Auto-generated constructor stub
	}

	public PlayerDto(String id, String name, String sex, String grade, String cls, String marjor, String dept,
			Integer score, Integer scorenum, Integer clsnum, Integer marjornum, Integer deptnum, Integer schoolnum) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.grade = grade;
		this.cls = cls;
		this.marjor = marjor;
		this.dept = dept;
		this.score = score;
		this.scorenum = scorenum;
		this.clsnum = clsnum;
		this.marjornum = marjornum;
		this.deptnum = deptnum;
		this.schoolnum = schoolnum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getCls() {
		return cls;
	}

	public Integer getScorenum() {
		return scorenum;
	}

	public void setScorenum(Integer scorenum) {
		this.scorenum = scorenum;
	}

	public void setCls(String cls) {
		this.cls = cls;
	}

	public String getMarjor() {
		return marjor;
	}

	public void setMarjor(String marjor) {
		this.marjor = marjor;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getClsnum() {
		return clsnum;
	}

	public void setClsnum(Integer clsnum) {
		this.clsnum = clsnum;
	}

	public Integer getMarjornum() {
		return marjornum;
	}

	public void setMarjornum(Integer marjornum) {
		this.marjornum = marjornum;
	}

	public Integer getDeptnum() {
		return deptnum;
	}

	public void setDeptnum(Integer deptnum) {
		this.deptnum = deptnum;
	}

	public Integer getSchoolnum() {
		return schoolnum;
	}

	public void setSchoolnum(Integer schoolnum) {
		this.schoolnum = schoolnum;
	}

}
