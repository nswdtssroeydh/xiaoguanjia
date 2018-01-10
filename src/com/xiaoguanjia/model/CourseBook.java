/**
 * 
 */
package com.xiaoguanjia.model;

import java.util.Date;

/**
 * 学生的课时消耗记录，类似银行的存折，即存折的一条记录
 * @author Huang Kai
 * email:nswdtssroeydh@163.com
 */
public class CourseBook {
	
	private int id;//id
	
	private String name;//标题
	
	private Date time;//消耗/充值时间
	
	private double consume;//本次消费量
	
	private double remain;//本次消费之后的剩余量
	
	private String description;//本次消费的描述
	
	private double charge;//本次充值量
	
	private int studentId;//本次消费或者充值的学生id
	
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

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public double getConsume() {
		return consume;
	}

	public void setConsume(double consume) {
		this.consume = consume;
	}

	public double getRemain() {
		return remain;
	}

	public void setRemain(double remain) {
		this.remain = remain;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
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

	@Override
	public String toString() {
		return "CourseBook [id=" + id + ", name=" + name + ", time=" + time + ", consume=" + consume + ", remain="
				+ remain + ", description=" + description + ", charge=" + charge + ", studentId=" + studentId
				+ ", mark=" + mark + "]";
	}
	
}
