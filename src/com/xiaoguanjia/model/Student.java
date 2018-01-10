package com.xiaoguanjia.model;
/**
 * 
 * 学生
 * @author Huang Kai
 * email:nswdtssroeydh@163.com
 */
import java.util.Date;

public class Student {

	private int id;//id
	
	private String name;//学生姓名
	
	private String wechatId;//微信id
	
	private String wechatName;//微信昵称
	
	private double remaining;//余额
	
	private Date joinTime;//注册时间
	
	private String remark;//备注

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

	public double getRemaining() {
		return remaining;
	}

	public void setRemaining(double remaining) {
		this.remaining = remaining;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", wechatId=" + wechatId + ", wechatName=" + wechatName
				+ ", remaining=" + remaining + ", joinTime=" + joinTime + ", remark=" + remark + "]";
	}
	
}
