package top.imyzt.itcase.day14;

import java.util.Calendar;
import java.util.Date;

/** 
* @author 杨镇涛
* @date 2018年4月17日 上午10:29:13 
* @version 1.0 
* @Description	日历类 
*/
public class Demo07_Calendar {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		c.add(Calendar.YEAR, -1);
		System.out.println(c.getWeekYear());
		
		System.out.println(isLeapYear(2018));
	}

	//判断是否是闰年
	private static boolean isLeapYear(int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, 2, 1);		//将3月1日传入
		c.set(Calendar.DAY_OF_MONTH, -1);		//3.1 - 1天得到当前年二月最后一天
		return c.get(Calendar.DAY_OF_MONTH) == 29;		//判断是否等于29，如果等于29就是闰年
	}
}
