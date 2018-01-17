/**
 * 
 */
package com.xiaoguanjia.log;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import db.DBConnection;

/**
 * @author Huang Kai
 * email:nswdtssroeydh@163.com
 */
public class LogDao {

	/**
	 * 保存日志
	 * @param operator
	 * @param context
	 * @param time
	 * @param mark
	 */
	public static void saveLog(String operator, String context, Timestamp time, String mark)
	{
		PreparedStatement ptst = null;
		Connection conn = null;
		String sql = "insert into log(operator, context, time, mark) values (?, ?, ?, ?)";
		
		try {
			conn = DBConnection.getConnection();
			ptst = conn.prepareStatement(sql);
			ptst.setString(1, operator);
			ptst.setString(2, context);
			ptst.setTimestamp(3, time);
			ptst.setString(4, mark);
			
			ptst.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally {
			DBConnection.closeConnection(null, ptst, conn);
		}
		
	}
	
	public static void main(String[] args)
	{
		saveLog("嘟嘟", "测试5", new Timestamp(System.currentTimeMillis()), "测试保存");
	}
}
