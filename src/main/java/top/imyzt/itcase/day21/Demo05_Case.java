package top.imyzt.itcase.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * 
 * 统计文件中字符出现个数并排序输出到另一文本文件中
 * 
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年5月5日 上午10:42:41 
*/
public class Demo05_Case {
	
	public static void main(String[] args) throws IOException {
		
		//1.创建一个文件输入缓冲区,使用UTF-8读取
		BufferedReader br = 
				new BufferedReader(
						new InputStreamReader(
								new FileInputStream("chinese.txt"), "UTF-8"));
		
		//2.创建一个可排序双列集合,key存放字符,value存放出现的次数
		TreeMap<Character, Integer> tm = new TreeMap<>();
		
		//3.遍历读取字符
		int c;
		while ((c = br.read()) != -1) {
			char ch = (char) c;
			//如果当前字符存在于集合中,将value取出后+1,如果不存在,直接将value设置为1
			tm.put(ch, tm.containsKey(ch) ? tm.get(ch) + 1 : 1);
		}
		
		br.close();
		
		//4.创建一个文件输出缓冲区,使用UTF-8输出
		BufferedWriter bw = 
				new BufferedWriter(
						new OutputStreamWriter(
								new FileOutputStream("chineseWriter.txt", false), "UTF-8"));
		
		//5.使用entrySet()遍历双列集合
		for (Entry<Character, Integer> en : tm.entrySet()) {
			tm.remove(en.getKey());
			String result = String.valueOf(en.getKey());
			switch (result) {
			case "\t":
				result = "\\t";
				break;
			case "\r":
				result = "\\r";
				break;
			case "\n":
				result = "\\n";
				break;
			default:
				break;
			}
			bw.write(result + " = " + en.getValue());
			bw.newLine();
		}
		
		bw.close();
		
	}

}
