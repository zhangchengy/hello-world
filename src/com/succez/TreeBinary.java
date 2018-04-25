package com.succez;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TreeBinary {
	@SuppressWarnings("resource")
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		char ch[]=sc.nextLine().toCharArray();
		ArrayList<String> list=new ArrayList<String>();
		for(char c:ch){
			list.add(String.valueOf(c));
		}
		Iterator<String> it = list.iterator();
		TNode tNode=new  TNode("#");
		createTreeBinary(tNode,it);
		printTreeBinary(tNode);
		treeLevel(tNode,2);
	}
    
	public  static void printTreeBinary(TNode tree){
		if(tree!=null){
				System.out.print(tree.value);
				printTreeBinary(tree.left);
				printTreeBinary(tree.right);
		}
	}
	
	//先序遍历初始化二叉树
    public static TNode createTreeBinary(TNode treeNode,Iterator<String> it){
   
		if(it.hasNext()){
            treeNode.value = it.next();
         
			treeNode.left = createTreeBinary(new TNode("#"),it);
            treeNode.right = createTreeBinary(new TNode("#"),it);
            return treeNode;
        }
		else{
			return null;
		}
    }
    
    public static void treeLevel(TNode treeNode,int level){
        if(treeNode!=null){
        	if(level==1){
        		System.out.print(treeNode.value);
        	}
        	else{
        		treeLevel(treeNode.left,level-1);
        		treeLevel(treeNode.right,level-1);
        	}
        }
    }
    
}
