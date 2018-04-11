package top.imyzt.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/** 
* @author ������
* @date 2018��4��11�� ����5:44:54 
* @version 1.0 
* @Description 
*/
public class TestPoi2 {
	public static void main(String params[]) throws Exception {
	    String[] iF = new String[] {"D:\\word\\����.docx", "D:\\word\\�������������.docx", "D:\\word\\�᰸����_1.docx", "D:\\word\\�ٱ���¼_1.docx" };
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
