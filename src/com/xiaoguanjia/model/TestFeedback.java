/**
 * 
 */
package com.xiaoguanjia.model;

import java.util.Date;

/**
 * 测试反馈
 * 
 * @author Huang Kai 
 * email:nswdtssroeydh@163.com
 */
public class TestFeedback {

	private int id;

	private String name;

	private String content;

	private String pics;

	private int studentId;

	private Date uploadTime;

	private String week;

	private String weekday;

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

	public Date getUploadTime() {
		return uploadTime;
	}

	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
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

	@Override
	public String toString() {
		return "TestFeedback [id=" + id + ", name=" + name + ", content=" + content + ", pics=" + pics + ", studentId="
				+ studentId + ", uploadTime=" + uploadTime + ", week=" + week + ", weekday=" + weekday + "]";
	}
	
}
