package top.imyzt.itcase.day25;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * 使用第三种方式创建线程
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月14日 下午3:19:47 
 */
public class Demo09_Callable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		//创建Callable的子类对象
		MyCallable callable = new Demo09_Callable().new MyCallable(100);
		
		//创建一个线程池
		ExecutorService pool = Executors.newSingleThreadExecutor();		
		
		//将线程加入到线程池中
		Future<Integer> futrue = pool.submit(callable);
		
		//通过 Future.get() 方法返回 Callable.call()的返回值
		System.out.println(futrue.get());
		
		//将当前线程池关闭
		pool.shutdown();
	}
	
	class MyCallable implements Callable<Integer>{

		private Integer num;
		
		public MyCallable(Integer id) {
			super();
			this.num = id;
		}

		@Override
		public Integer call() throws Exception {
			Integer sum = 0;
			//求传入数字的和
			while (num > 0) {
				sum += num--;
			}
			return sum;
		}
	}

}
