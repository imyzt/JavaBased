package top.imyzt.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.xmlbeans.XmlOptions;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody;

public class TestPoi {
	public static void main (String[] args) throws Exception {
		
		
		File file = new File("D:\\word");
		
		if (file.exists()) {
			String[] list = file.list();
			if (Arrays.asList(list).contains("all.docx")) {
				
			}
			for (String s : list) {
				
				if (s.endsWith("docx")) {					
					System.out.println(file.getPath() + File.separator + s);
					
				}
			}
		}
		
		
		test();

	}

	private static void test() throws FileNotFoundException, IOException, Exception {
		InputStream in1 = null;
		InputStream in2 = null;
		OPCPackage src1Package = null;
		OPCPackage src2Package = null;

		OutputStream dest = new FileOutputStream("D:\\word\\all.docx");
		try {
			in1 = new FileInputStream("D:\\word\\all.docx");
			in2 = new FileInputStream("D:\\word\\案件处理意见书.docx");
			src1Package = OPCPackage.open(in1);
			src2Package = OPCPackage.open(in2);
		} catch (Exception e) {
			e.printStackTrace();	
		}

		XWPFDocument src1Document = new XWPFDocument(src1Package); 
		CTBody src1Body = src1Document.getDocument().getBody();
		XWPFDocument src2Document = new XWPFDocument(src2Package);
		CTBody src2Body = src2Document.getDocument().getBody(); 
		appendBody(src1Body, src2Body);
		src1Document.write(dest);
	}

	private static void appendBody(CTBody src, CTBody append) throws Exception {
		XmlOptions optionsOuter = new XmlOptions();
		optionsOuter.setSaveOuter();
		String appendString = append.xmlText(optionsOuter);
		String srcString = src.xmlText();
		String prefix = srcString.substring(0,srcString.indexOf(">")+1);
		String mainPart = srcString.substring(srcString.indexOf(">")+1,srcString.lastIndexOf("<"));
		String sufix = srcString.substring( srcString.lastIndexOf("<") );
		String addPart = appendString.substring(appendString.indexOf(">") + 1, appendString.lastIndexOf("<"));
		CTBody makeBody = CTBody.Factory.parse(prefix+mainPart+addPart+sufix);
		src.set(makeBody);
	}

}