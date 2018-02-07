/**
 * 
 */
package com.xiaoguanjia.queryStudent;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.xiaoguanjia.login.LoginService;
import com.xiaoguanjia.model.Student;

/**
 * @author Huang Kai email:nswdtssroeydh@163.com
 */
public class QueryStudentServlet extends HttpServlet {

	private QueryStudentService queryStudentService;

	private static SerializerFeature[] features = new SerializerFeature[] {
			// 输出Map中为Null的值
			SerializerFeature.WriteMapNullValue,

			// 假设Boolean对象为Null。则输出为false
			SerializerFeature.WriteNullBooleanAsFalse,

			// 假设List为Null。则输出为[]
			SerializerFeature.WriteNullListAsEmpty,

			// 假设Number为Null。则输出为0
			SerializerFeature.WriteNullNumberAsZero,

			// 输出Null字符串
			SerializerFeature.WriteNullStringAsEmpty,

			// 格式化输出日期
			SerializerFeature.WriteDateUseDateFormat };

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		queryStudentService = QueryStudentService.getInstance();

		String studentName = request.getParameter("studentName");

		List<Student> result = queryStudentService.queryStudentAllByName(studentName);

		for (Student student : result) {
			System.out.println(student);
		}

		Map<String, Object> resultMap = new HashMap<String, Object>();
		if("".equals(studentName) || null == studentName)
		{
			resultMap.put("flag", "false");
			resultMap.put("msg", "查询错误");
		}else
		{
			resultMap.put("flag", "true");
			List<HashMap<String, String>> students = new ArrayList<HashMap<String, String>>();
			for(Student student : result)
			{
				HashMap<String, String> m = new HashMap<String, String>();
				m.put("name", student.getName());
				m.put("wechatId", student.getWechatId());
				students.add(m);
			}
			resultMap.put("students", students);
		}
		
		response.setCharacterEncoding("gb2312");
		
		try {
			PrintWriter out = response.getWriter();
			String re = JSON.toJSONString(resultMap, features);
			out.println(re);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
			resultMap.put("flag", "no");
		}
		
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
}
