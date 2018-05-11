package com.succez;

/*
 * 10进制数转换成16进制数
 * 用栈来存储进制上的每一位数，高位在栈顶，地位在栈底
 * 
 *<p>succez<p>
 *@author zhanagchengy
 *@createdate 2018-04-25
 *@alterdate  2018-05-11
 */

public class IntToHex {

	public String intToHex(int number) {
		StringBuffer buffer=new StringBuffer();
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
		return buffer.reverse().toString();//字符串反转
	}

}
