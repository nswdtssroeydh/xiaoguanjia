/**
 * 
 */
package com.xiaoguanjia.model;

import java.util.Date;

/**
 * 课堂反馈，老师对某堂课的反馈，以文字+图片的形式呈现，可以被所有参加这堂课的学生查阅
 * @author Huang Kai
 * email:nswdtssroeydh@163.com
 */
public class CourseFeedback {

	private int id;//该课堂反馈的id
	
	private String name;//反馈名称，或标题
	
	private String content;//该反馈的内容
	
	private String pics;//图片存储位置，最多三张以英文分号分开
	
	private int courseId;//该反馈对应的课堂id
	
	private Date uploadTime;//上传时间

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

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public Date getUploadTime() {
		return uploadTime;
	}

	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}

	@Override
	public String toString() {
		return "CourseFeedback [id=" + id + ", name=" + name + ", content=" + content + ", pics=" + pics + ", courseId="
				+ courseId + ", uploadTime=" + uploadTime + "]";
	}
	
}
