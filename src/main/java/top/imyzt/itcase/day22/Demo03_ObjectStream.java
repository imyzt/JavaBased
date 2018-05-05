package top.imyzt.itcase.day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * ObjectInputStream ObjectOutputStream
 * 对象输入流和对象输出流
 * 用于将 序列化 后的对象存入文档 和 从文档中读取对象
 * 
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年5月5日 下午4:24:21 
*/
public class Demo03_ObjectStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		aaa();
		
		insert(new GameInfo(1, "a", 2, new Date()));
		
//		selectById(1);
		
	}


	public static GameInfo selectById(Integer id) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("gameinfo.txt"));
		ArrayList<GameInfo> gameInfo = (ArrayList<GameInfo>) ois.readObject();
		
		List<GameInfo> collect = gameInfo.stream().filter(info -> info.getId().equals(id)).collect(Collectors.toList());
		
		gameInfo.forEach(info -> {
			System.out.println(info.toString());
		});
		
		return null;
	}
	
	/**
	 * 插入一条记录
	 * @author:imyzt
	 * @date:2018年5月5日下午4:39:03
	 * @param info
	 * @throws IOException
	 * @throws ClassNotFoundException 
	 */
	public static void insert(GameInfo info) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("gameinfo.txt"));
		ArrayList<GameInfo> gameInfo = (ArrayList<GameInfo>) ois.readObject();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("gameinfo.txt", true));
		oos.writeObject(gameInfo.add(info));
		oos.close();
	}
	
	
	
	private static void aaa() throws IOException, FileNotFoundException, ClassNotFoundException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("gameinfo.txt", true));
		
		ArrayList<GameInfo> list = new ArrayList<>();
		list.add(new GameInfo(1, "yzt", 3, new Date()));
		list.add(new GameInfo(2, "aa", 1, new Date()));
		list.add(new GameInfo(3, "xxx", 33, new Date()));
		list.add(new GameInfo(4, "zzz", 23, new Date()));
		list.add(new GameInfo(5, "yyy", 13, new Date()));
		
		oos.writeObject(list);
		
		oos.close();
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("gameinfo.txt"));
		ArrayList<GameInfo> gameInfo = (ArrayList<GameInfo>) ois.readObject();
		
		gameInfo.forEach(info -> System.out.println(info));
		
		ois.close();
	}
}
class GameInfo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String name;
	
	private Integer grade;
	
	private Date date;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public GameInfo(Integer id, String name, Integer grade, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.date = date;
	}
	@Override
	public String toString() {
		return "GameInfo [id=" + id + ", name=" + name + ", grade=" + grade + ", date=" + date + "]";
	}
}