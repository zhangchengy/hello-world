package com.succez;


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
