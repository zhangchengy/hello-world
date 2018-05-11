package com.succez;
/*
 *对IntToHex类的方法intToHex()进行测试
 *将31转换成16进制的数应该为1F
 * 
 *<p>succez<p>
 *@author zhanagchengy
 *@createdate 2018-4-25
 */


import org.junit.Assert;
import org.junit.Test;

public class IntToHexTest {
	IntToHex intToHex;
	String str,expected;
	@Test
	public void testIntToHex() {
		intToHex=new IntToHex();
		str=intToHex.intToHex(31);

		
		expected="1F";
		Assert.assertEquals("错误",expected,str);
		
		str=intToHex.intToHex(64);
		expected="40";
		Assert.assertEquals("错误",expected,str);
		
		str=intToHex.intToHex(52);
		expected="34";
		Assert.assertEquals("错误",expected,str);
		
		str=intToHex.intToHex(100);
		expected="64";
		Assert.assertEquals("错误",expected,str);

		expected=new String("1F");
		Assert.assertEquals("错误",expected,str);
		
		str=intToHex.intToHex(64);
		expected=new String("40");
		Assert.assertEquals("错误",expected,str);
		
		str=intToHex.intToHex(52);
		expected=new String("34");
		Assert.assertEquals("错误",expected,str);
		
		str=intToHex.intToHex(100);
		expected=new String("64");
		Assert.assertEquals("错误",expected,str);
		
	}

}
