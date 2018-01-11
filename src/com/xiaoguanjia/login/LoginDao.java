/**
 * 
 */
package com.xiaoguanjia.login;

import com.xiaoguanjia.model.Parent;
import com.xiaoguanjia.model.Student;
import com.xiaoguanjia.model.Teacher;

/**
 * @author Huang Kai
 * email:nswdtssroeydh@163.com
 */
public class LoginDao {

	private static LoginDao instance;
	
	public static LoginDao getInstance()
	{
		if(null == instance)
			instance = new LoginDao();
		return instance;
	}
	
	/**
	 * 检查用户是否已经注册过，如果注册过，返回true，否则返回false
	 * @param wechatId
	 * @return
	 */
	public boolean checkIfUserExist(String wechatId)
	{
		return false;
	}
	
	/**
	 * 学生用户注册，将学生信息存入数据库。如果注册成功，则返回true，否则返回false
	 * @param student
	 * @return
	 */
	public boolean saveStudent(Student student)
	{
		return false;
	}
	
	
	/**
	 * 老师注册，将老师信息存入数据库。如果注册成功，则返回true，否则返回false
	 * @param teacher
	 * @return
	 */
	public boolean saveTeacher(Teacher teacher)
	{
		return false;
	}
	
	/**
	 * 家长注册，将家长信息存入数据库。如果注册成功，则返回true，否则返回false
	 * @param parent
	 * @return
	 */
	public boolean saveParent(Parent parent)
	{
		return false;
	}
	
	/**
	 * 根据学生的微信id查询学生基本信息
	 * @param wechatId
	 * @return
	 */
	public Student getStudent(String wechatId)
	{
		return null;
	}
	
	/**
	 * 根据老师的微信id查询老师基本信息
	 * @param wechatId
	 * @return
	 */
	public Teacher getTeacher(String wechatId)
	{
		return null;
	}
	
	/**
	 * 根据家长的微信id查询家长基本信息
	 * @param wechatId
	 * @return
	 */
	public Parent getParent(String wechatId)
	{
		return null;
	}
	
	/**
	 * 根据用户id查看用户角色，1学生，2家长，3老师，如果不存在则返回-1
	 * @param wechatId
	 * @return
	 */
	public int getUserRole(String wechatId)
	{
		return -1;
	}
}
