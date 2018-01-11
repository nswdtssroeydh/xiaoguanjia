/**
 * 
 */
package Util;

import java.sql.Timestamp;

/**
 * @author Huang Kai
 * email:nswdtssroeydh@163.com
 */
public class DateUtil {

	
	public static Timestamp getTimestampNow()
	{
		return new Timestamp(System.currentTimeMillis());
	}
	
}
