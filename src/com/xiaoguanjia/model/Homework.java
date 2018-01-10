/**
 * 
 */
package com.xiaoguanjia.model;

/**
 * 作业类
 * @author Huang Kai
 * email:nswdtssroeydh@163.com
 */
public class Homework {

	private int id; //作业id
	
	private String name;//作业名称，或标题
	
	private String week;//作业属于哪一周，如'2018-13'表示2018年第13周
	
	private String weekday;//作业属于该周的星期几，如星期四
	
	private String content;//作业具体内容
	
	private String pics;//作业的图片的存储路径，最多三张用英文分号隔开
	
	private int studentId;//该作业属于哪个学生，学生id
	
	private String mark;//备注

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public String getWeekday() {
		return weekday;
	}

	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPics() {
		return pics;
	}

	public void setPics(String pics) {
		this.pics = pics;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}
	
}
