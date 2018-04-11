package top.imyzt.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/** 
* @author 杨镇涛
* @date 2018年4月11日 下午5:44:54 
* @version 1.0 
* @Description 
*/
public class TestPoi2 {
	public static void main(String params[]) throws Exception {
	    String[] iF = new String[] {"D:\\word\\封面.docx", "D:\\word\\案件处理意见书.docx", "D:\\word\\结案报告_1.docx", "D:\\word\\举报记录_1.docx" };
	    String oF = "D:\\word\\out.docx";
	    
	    FileOutputStream output = new FileOutputStream(new File(oF));
	    WritableByteChannel targetChannel = output.getChannel();
	    
	    for(int i =0; i<iF.length; i++){
	      FileInputStream input = new FileInputStream(iF[i]);
	      FileChannel inputChannel = input.getChannel();
	      
	      inputChannel.transferTo(0, inputChannel.size(), targetChannel);
	      
	      inputChannel.close();
	      input.close();
	    }
	    targetChannel.close();
	    output.close();
	    System.out.println("All jobs done...");
	    
	  }
}
