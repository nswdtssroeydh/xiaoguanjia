/**
 * 
 */
package com.xiaoguanjia.queryStudent;

import java.util.List;

import com.xiaoguanjia.model.Student;

/**
 * @author Huang Kai email:nswdtssroeydh@163.com
 */
public class QueryStudentService {

	private QueryStudentDao queryStudentDao;
	private static QueryStudentService instance;

	public static QueryStudentService getInstance() {
		if (null == instance)
			instance = new QueryStudentService();
		return instance;
	}
	
	public List<Student> queryStudentAllByName(String studentName)
	{
		queryStudentDao = QueryStudentDao.getInstance();
		List<Student> students = queryStudentDao.queryStudentAllByName(studentName);
		return students;
	}
	
	

}
