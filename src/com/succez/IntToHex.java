package com.succez;

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

=======
 *@createdate 2018-4-25
 */
import java.util.ArrayList;

public class IntToHex {

	public String intToHex(int number){
		StringBuffer str=new StringBuffer();
		ArrayList<String> list = initSqStack();
		while(number!=0){
			if(number%16<10){
				push(list,String.valueOf(number%16));
			}
			else if(number%16==10){
				push(list,"A");
			}
			else if(number%16==11){
				push(list,"B");
			}
			else if(number%16==12){
				push(list,"C");
			}
			else if(number%16==13){
				push(list,"D");
			}
			else if(number%16==14){
				push(list,"E");
			}
			else{
				push(list,"F");
			}
			number=number/16;
		}
		while(!isEmpty(list)){
			str.append(pop(list));
		}
		return str.toString();
		
	}
	
	//初始化栈
	public static ArrayList<String> initSqStack(){
	ArrayList<String> arraylist=new ArrayList<String>();
	return arraylist;
	}
	
	//入栈
	public static void push(ArrayList<String> arraylist,String e){
		arraylist.add(e);
	}
	
	//退栈并返回栈顶元素
	public static String pop(ArrayList<String> arraylist){
		int index=sqLength(arraylist);
		String element=getElement(arraylist,index-1);
		arraylist.remove(index-1);
		return element;
	}
	
	//返回栈长度
	public static int sqLength(ArrayList<String> arraylist){
		return arraylist.size();
	}
	
	//返回特定位置值
	public static String getElement(ArrayList<String> arraylist,int n){
		return arraylist.get(n);
	}
	
	//判断栈是否为空，为空返回true
	public static  boolean isEmpty(ArrayList<String> arraylist){
		return arraylist.isEmpty();
	}
>>>>>>> branch 'master' of https://github.com/zhangchengy/hello-world
}
