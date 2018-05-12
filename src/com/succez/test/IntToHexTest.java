package com.succez.test;
import com.succez.java.IntToHex;
/*
 *对IntToHex类的方法intToHex()进行测试
 *将31转换成16进制的数应该为1F
 * 
 *<p>succez<p>
 *@author zhanagchengy
 *@createdate 2018-4-25
 */


import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class IntToHexTest {
	IntToHex intToHex;
	String str,expected;
	@Test
	public void testIntToHex() throws SecurityException, IOException {
		intToHex=new IntToHex();
		
		str=intToHex.intToHex(-Integer.MAX_VALUE);
		expected="-7FFFFFFF";
		Assert.assertEquals("错误",expected,str);
		
		str=intToHex.intToHex(-64);
		expected="-40";
		Assert.assertEquals("错误",expected,str);
		
		str=intToHex.intToHex(0);
		expected="0";
		Assert.assertEquals("错误",expected,str);
		
		str=intToHex.intToHex(100);
		expected="64";
		Assert.assertEquals("错误",expected,str);
		
		str=intToHex.intToHex(Integer.MAX_VALUE);
		expected="7FFFFFFF";
		Assert.assertEquals("错误",expected,str);
	}

}
