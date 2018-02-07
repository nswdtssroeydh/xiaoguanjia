/**
 * 
 */
package com.xiaoguanjia.queryStudent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.xiaoguanjia.model.Student;

import db.DBConnection;

/**
 * @author Huang Kai
 * email:nswdtssroeydh@163.com
 */
public class QueryStudentDao {
	
	private static QueryStudentDao instance;
	
	public static QueryStudentDao getInstance()
	{
		if(null == instance)
			instance = new QueryStudentDao();
		return instance;
	}

	public List<Student> queryStudentAllByName(String studentName)
	{
		Connection conn = DBConnection.getConnection();
		PreparedStatement ptst = null;
		ResultSet rs = null;
		String sql = "select * from student where name like ?";
		List<Student> students = new ArrayList<Student>();
		try {
			ptst = conn.prepareStatement(sql);
			ptst.setString(1, "%" + studentName + "%");
			rs = ptst.executeQuery();
			while(rs.next())
			{
				Student student = new Student();
				int id = rs.getInt(1);
				student.setId(id);
				String name = rs.getString(2);
				student.setName(name);
				String wechatId = rs.getString(3);
				student.setWechatId(wechatId);
				String wechatName = rs.getString(4);
				student.setWechatName(wechatName);
				double remaining = rs.getDouble(5);
				student.setRemaining(remaining);
				Timestamp timestamp = rs.getTimestamp(6);
				student.setJoinTime(timestamp);
				String mark = rs.getString(7);
				student.setRemark(mark);
				
				students.add(student);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally {
			DBConnection.closeConnection(rs, ptst, conn);
		}
		
		return students;
	}
	
	public static void main(String[] args)
	{
		QueryStudentDao dao = QueryStudentDao.getInstance();
		List<Student> students = dao.queryStudentAllByName("黄");
		
		for(Student student :students)
		{
			System.out.println(student);
		}
	}
}
