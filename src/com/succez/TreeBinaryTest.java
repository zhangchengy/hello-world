package com.succez;

/*
 * 对TreeBinary类的方法treeLevel()测试
 * 先序建立二叉树[A,B,G,#,#,H,#,#,D,C,#,#,F,#,#]的第三层应该是[G,H,C,F]
 * 获取树tree的第level层的所有节点值，并且输出顺序为从左到右
 *<p>succez<p>
 *@author zhanagchengy
 *@createdate 2018-4-25
 */

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

public class TreeBinaryTest {
	TreeBinary treeBinary;
	
	@Test
	public void test() {
		String sBuffer;
		sBuffer= new String("GHCF");
		char ch[]={'A','B','G','#','#','H','#','#','D','C','#','#','F','#','#'};
		ArrayList<String> list=new ArrayList<String>();
		for(char c:ch){
			list.add(String.valueOf(c));
		}
		Iterator<String> it = list.iterator();
		TNode tNode=new  TNode("#");
		treeBinary=new TreeBinary();
		treeBinary.createTreeBinary(tNode,it);
		
		sBuffer= new String("GHCF");
		treeBinary.treeLevel(tNode,3);
		Assert.assertEquals("错误",sBuffer,treeBinary.buffer.toString());
		
		sBuffer=new String("BD");
		treeBinary.buffer=new StringBuffer();
		treeBinary.treeLevel(tNode,2);
		Assert.assertEquals("错误",sBuffer,treeBinary.buffer.toString());
		
		sBuffer=new String("A");
		treeBinary.buffer=new StringBuffer();
		treeBinary.treeLevel(tNode,1);
		Assert.assertEquals("错误",sBuffer,treeBinary.buffer.toString());
	}

}
