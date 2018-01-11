/**
 * 
 */
package com.xiaoguanjia.login;

/**
 * @author Huang Kai
 * email:nswdtssroeydh@163.com
 */
public class LoginService {

	private LoginDao loginDao;
	private static LoginService instance;
	
	public static LoginService getInstance()
	{
		if(null == instance)
			instance = new LoginService();
		return instance;
	}
	
	
	/**
	 * 检查用户是否存在
	 * @param wechatId
	 * @return
	 */
	public boolean checkIfUserExist(String wechatId)
	{
		loginDao = LoginDao.getInstance();
		return loginDao.checkIfUserExist(wechatId);
	}
}
