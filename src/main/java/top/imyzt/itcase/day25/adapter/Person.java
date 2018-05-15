package top.imyzt.itcase.day25.adapter;
/**
 * 人类的接口
 * 	人类有有很多种职业,有学生,有程序员
 * 		学生需要学习,程序员需要编码,而学生和程序员都需要吃饭和跑步
 * 		故学生和程序员可以继承 PersonAdapter 适配器选择合适自己的进行重写
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月15日 上午9:20:17 
 */
public interface Person {

	/**
	 * 学习
	 * @author:imyzt
	 * @date:2018年5月15日上午9:22:11
	 */
	void study();
	
	/**
	 * 编码
	 * @author:imyzt
	 * @date:2018年5月15日上午9:22:16
	 */
	void coding();
	
	/**
	 * 吃饭
	 * @author:imyzt
	 * @date:2018年5月15日上午9:22:21
	 */
	void eat();
	
	/**
	 * 跑步
	 * @author:imyzt
	 * @date:2018年5月15日上午9:22:25
	 */
	void runing();
	
}
