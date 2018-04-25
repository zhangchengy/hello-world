package com.succez;
/*
 *对IntToHex类的方法intToHex()进行测试
 *将31转换成16进制的数应该为1F
 * 
 *<p>succez<p>
 *@author zhanagchengy
 *@createdate 2018-4-25
 */

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class IntToHexTest {
	IntToHex intToHex;
	@Test
	public void testIntToHex() {
		intToHex=new IntToHex();
		ArrayList<String> list=intToHex.intToHex(31);
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("F");
		arr.add("1");
		Assert.assertEquals("错误",arr,list);
	}

}
