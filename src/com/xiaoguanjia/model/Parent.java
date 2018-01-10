package com.xiaoguanjia.model;
/**
 * 家长
 * @author Huang Kai
 * email:nswdtssroeydh@163.com
 */
import java.util.Date;

public class Parent {

	private int id;// id
	
	private String name;// 家长姓名

	private String wechatId;// 微信id

	private String wechatName;// 微信昵称

	private Date joinTime;// 注册时间

	private String remark;// 备注
	
	private int studentId;

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

	public String getWechatId() {
		return wechatId;
	}

	public void setWechatId(String wechatId) {
		this.wechatId = wechatId;
	}

	public String getWechatName() {
		return wechatName;
	}

	public void setWechatName(String wechatName) {
		this.wechatName = wechatName;
	}

	public Date getJoinTime() {
		return joinTime;
	}

	public void setJoinTime(Date joinTime) {
		this.joinTime = joinTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Parent [id=" + id + ", name=" + name + ", wechatId=" + wechatId + ", wechatName=" + wechatName
				+ ", joinTime=" + joinTime + ", remark=" + remark + ", studentId=" + studentId + "]";
	}
	
}
