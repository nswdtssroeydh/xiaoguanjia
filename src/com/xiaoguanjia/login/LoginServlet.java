/**
 * 
 */
package com.xiaoguanjia.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * @author Huang Kai email:nswdtssroeydh@163.com
 */
public class LoginServlet extends HttpServlet {

	private LoginService loginService;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doPost(request, response);
	}

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

	public void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException 
	{
		loginService = LoginService.getInstance();
		String wechatId = request.getParameter("wechatId");
		String wechatName = request.getParameter("wechatName");
		response.setContentType("text/plain;charset=UTF-8");

		boolean isFirstTime = loginService.checkIfUserExist(wechatId);
		Map<String, String> resultMap = new HashMap<String, String>();

		if (isFirstTime) {
			resultMap.put("flag", "yes");
			resultMap.put("isFirstTime", "yes");
			try {
				PrintWriter out = response.getWriter();
				String re = JSON.toJSONString(resultMap, features);
				out.println(re);
				out.flush();
			} catch (IOException e) {
				e.printStackTrace();
				resultMap.put("flag", "no");
			}

		} else {
			resultMap.put("flag", "yes");
			resultMap.put("isFirstTime", "no");
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

	}
}
