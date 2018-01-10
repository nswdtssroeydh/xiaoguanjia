/**
 * 
 */
package com.xiaoguanjia.model;

/**
 * 课程，即由老师给学生上的课，是本系统最基础的数据
 * @author Huang Kai
 * email:nswdtssroeydh@163.com
 */
public class Course {
	
	private int id;//课程id
	
	private String name;//课程名称
	
	private String description;//课程描述
	
	private String week;//课程属于哪个周，如：'2018-02'表示2018年第2周
	
	private String startTime;//开课时间，如：11:30am
	
	private String endTime;//课程结束时间，如：12:40am
	
	private String weekday;//该课在星期几，如：星期三
	
	private int teacherId;//上这节课的教师的id

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getWeekday() {
		return weekday;
	}

	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", description=" + description + ", week=" + week
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", weekday=" + weekday + ", teacherId="
				+ teacherId + "]";
	}
	
}
