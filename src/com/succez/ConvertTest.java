package com.succez;
/*
 * 
 *  测试Convert类的方法file2buf()
 *  文件D:/test.txt中内容为：0123456789
 *  转换成byte数组应为:[48,49,50,51,52,53,54,55,56,57]
<<<<<<< HEAD
 *    
 *<p>succez<p>
 *@author zhanagchengy
 *@createdate 2018-4-25
 */

import java.io.File;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

public class ConvertTest {

	@Test
	public void testFile2buf() throws IOException {
		Convert convert=new Convert();
		File file=new File("D:/test.txt");
		byte[] buf=convert.file2buf(file);
		String s=new String(buf);
		byte[] bye=new byte[]{48,49,50,51,52,53,54,55,56,57};
		String b=new String(bye);
		Assert.assertEquals("错误",b,s);
	}

}
