package com.succez;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*
 * 10进制数转换成16进制数
 * 用栈来存储进制上的每一位数，高位在栈顶，地位在栈底
 * 
 *<p>succez<p>
 *@author zhanagchengy
<<<<<<< HEAD
 *@createdate 2018-04-25
 *@alterdate  2018-05-11
 */

public class IntToHex {
	Logger logger;
	FileHandler fileHandler;
	public IntToHex() throws SecurityException, IOException{
			logger = Logger.getLogger("testlogjava");
			fileHandler = new FileHandler("d:\\testlog.txt",true);
			fileHandler.setFormatter(new SimpleFormatter());
			logger.addHandler(fileHandler);
	}
	 
	public String intToHex(int number) {
		int flag=0;
		StringBuffer buffer=new StringBuffer();
		if(number!=0&&number<=Integer.MAX_VALUE&&number>=Integer.MIN_VALUE){
			if(number<0)	{
				number=0-number;
				flag=1;
			}
			while(number!=0){
				if(number%16<10){
					buffer.append(String.valueOf(number%16));
				}
				else if(number%16==10){
					buffer.append("A");
				}
				else if(number%16==11){
					buffer.append("B");
				}
				else if(number%16==12){
					buffer.append("C");
				}
				else if(number%16==13){
					buffer.append("D");
				}
				else if(number%16==14){
					buffer.append("E");
				}
				else{
					buffer.append("F");
				}
				number=number/16;	
			}
				if(flag==1){
					buffer.append("-");
					return buffer.reverse().toString();//字符串反转
				}else{
					return buffer.reverse().toString();
				}
		}
		else if(number==0){
			return "0";
		}
		else{
			logger.log(Level.SEVERE, "整数超出int数据类型的范围");
			return null;
			}
	}
}
