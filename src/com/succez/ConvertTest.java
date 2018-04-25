package com.succez;


import java.io.File;

import org.junit.Assert;
import org.junit.Test;

public class ConvertTest {

	@Test
	public void testFile2buf() {
		Convert convert=new Convert();
		File file=new File("D:/test.txt");
		byte[] buf=convert.file2buf(file);
		String s=new String(buf);
		byte[] bye=new byte[]{48,49,50,51,52,53,54,55,56,57};
		String b=new String(bye);
		Assert.assertEquals("错误",b,s);
	}

}
