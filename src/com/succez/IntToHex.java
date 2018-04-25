package com.succez;


import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

public class IntToHex {

	//public static void main(String[] args) {
	//	// TODO Auto-generated method stub
	//	Scanner input=new Scanner(System.in);
	//	int number=input.nextInt();
	//	intToHex(number);
	//}
	
	
	public  ArrayList<String> intToHex(int number){
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
		//while(!isEmpty(list)){
		//	System.out.print(pop(list));
		//}
		return list;
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
}
