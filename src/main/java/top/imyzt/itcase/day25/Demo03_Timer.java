package top.imyzt.itcase.day25;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 
 * Timer 定时器
 * 
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月10日 下午4:59:11 
 */
public class Demo03_Timer {

	public static void main(String[] args) {

		//需要计划的任务
		TimerTask study = new TimerTask() {

			@Override
			public void run() {
				System.out.println("学习");
			}
		};

		TimerTask sleep = new TimerTask() {

			@Override
			public void run() {
				System.out.println("睡觉");
			}
		};

		//定时器对象
		Timer time = new Timer();
		/*
		 * Timer.schedule(task, firstTime, period);
		 *  方法需要一个任务 TimerTask, 从何时开始, 多久重复一次
		 */
		time.schedule(study, new Date(118, 4, 10, 17, 04, 05), 3000);

		/*
		 * Timer.schedule(task, delay, period);
		 *  方法需要一个任务 TimerTask, 从多久后开始(毫秒), 多久重复一次
		 */
		time.schedule(sleep, 2000, 3000);

		int count = 10;
		while (count -- > 0) {
			try {
				Thread.sleep(1000);
				System.out.println(new Date());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("任务已执行完毕,即将停止");
		
		//停止掉此计时器所有已安排的任务
		time.cancel();
	}

}
