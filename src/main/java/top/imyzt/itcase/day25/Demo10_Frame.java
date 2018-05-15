package top.imyzt.itcase.day25;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * GUI
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月15日 上午8:38:27 
 */
public class Demo10_Frame {

	public static void main(String[] args) {
		
		Frame frame = new Frame("QQ");
		
		//设置窗口的大小
		frame.setSize(400, 600);
		//设置窗口的出现位置,以左上角为0点
		frame.setLocation(500, 50);
		//设置icon
		frame.setIconImage(Toolkit.getDefaultToolkit().createImage("src/main/resources/qq.png"));
		//设置布局为流布局
		frame.setLayout(new FlowLayout());
		//设置是否可见
		frame.setVisible(true);

		//创建一个按钮,加入到窗口中
		Button btn01 = new Button("login");
		frame.add(btn01);
		Button btn02 = new Button("logout");
		frame.add(btn02);
		
		//设置关闭按钮的监听事件
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//设置按钮的鼠标监听事件
		btn01.addMouseListener(new MouseAdapter() {
			//设置鼠标释放事件
			@Override
			public void mouseReleased(MouseEvent e) {
				System.exit(0);
			}
			
			//设置点击事件
			/*@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}*/
		});
		
		//设置按钮的键盘监听事件
		btn01.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				//如果按了Esc,退出系统
				if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
					System.exit(0);
				}
			}
		});
		
		//设置按钮的动作监听事件(监听鼠标左键和空格键)
		btn02.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}
}
