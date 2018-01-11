/**
 * 
 */
package com.xiaoguanjia.login;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Huang Kai
 * email:nswdtssroeydh@163.com
 */
public class LoginController extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	{
		String wechatId = request.getParameter("wechatId");
		String wechatName = request.getParameter("wechatName");
		
		
	}
}
