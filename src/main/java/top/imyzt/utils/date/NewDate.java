package top.imyzt.utils.date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * java 8 新时间操作类
 * @author 01
 *
 */
public class NewDate {

	public static void main(String[] args) {

		/*
		 * LocalDate.now();
		 * 返回当天的日期
		 */
		LocalDate ld = LocalDate.now();
		System.out.println("今天是: " + ld);
		System.out.printf("今天是 %d 年 %d 月 %d 日, %d 年的第  %d 天,星期 %s \n \n",ld.getYear(),ld.getMonthValue(), ld.getDayOfMonth()
				,ld.getYear(), ld.getDayOfYear(), ld.getDayOfWeek());
		
		/*
		 * LocalDate.of(year, month, dayOfMonth);
		 * 接收一个年月日,返回该日期格式化后的 LocalDate对象
		 */
		LocalDate now = LocalDate.of(2012, 4, 4);
		System.out.printf("2012-4-4是  %d 年的第  %d 天,星期 %s \n \n",now.getYear(), now.getDayOfYear(), now.getDayOfWeek());
		
		/*
		 * LocalDate重写了equals(),可以直接对时间进行比较
		 */
		LocalDate start = LocalDate.of(2018, 2, 2);
		LocalDate end = LocalDate.of(2018, 2, 2);
		System.out.printf("两个日期是否相等: %s \n \n", start.equals(end));
		
		/*
		 * MonthDay重写了equals(),可以直接比较月份日期是否相同,不比较年份.
		 * 应用场景:生日,纪念日每一年一次的日期
		 * 
		 * YearMonth
		 */
		LocalDate d1 = LocalDate.of(2017, 5, 14);
		LocalDate d2 = LocalDate.of(2011, 5, 14);
		MonthDay md1 = MonthDay.of(d1.getMonth(), d1.getDayOfMonth());
		MonthDay md2 = MonthDay.of(d2.getMonth(), d2.getDayOfMonth());
		System.out.printf("是不是生日: %s \n \n", md1.equals(md2));
		
		/*
		 * LocalTime.now();
		 * 返回当前时间
		 */
		LocalTime lt = LocalTime.now();
		System.out.printf("现在是: %d:%d:%d.%d \n \n",lt.getHour(),lt.getMinute(),lt.getSecond(), lt.getNano());
		/*
		 * lt.plus(1,ChronoUnit.HOURS);一小时后
		 * 
		 * plusHours(num)增加两小时
		 * lt.minus(1,ChronoUnit.HOURS);减少一小时
		 */
		LocalTime twoHours = lt.plusHours(2);
		LocalTime oneYearBegin = lt.minus(1,ChronoUnit.HOURS);
//		lt.plus(1,ChronoUnit.WEEKS);
		System.out.printf("两小时后是: %s \n \n", twoHours);
		System.out.printf("一小时前是: %s \n \n", oneYearBegin);
		
		LocalDate ld2 = LocalDate.now();
		LocalDate OneWeekAfter = ld2.plus(1, ChronoUnit.WEEKS);
		LocalDate OneYearAfter = ld2.plus(1, ChronoUnit.YEARS);
		System.out.printf("一周后: %s, 一年后: %s  \n \n", OneWeekAfter, OneYearAfter);
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
	}

}
