package com.succez;


/*
 * 对用先序遍历建立的二叉树[A,B,G,#,#,H,#,#,D,C,#,#,F,#,#]。。。字符#表示空节点
 * 获取树tree的第level层的所有节点值，并且输出顺序为从左到右
 * 
 *<p>succez<p>
 *@author zhanagchengy
 *@createdate 2018-4-25
 */

import java.util.Iterator;

public class TreeBinary {
<<<<<<< HEAD
	StringBuffer buffer=new StringBuffer();
    
	//先序遍历初始化二叉树
    public TNode createTreeBinary(TNode treeNode,Iterator<String> it){
		if(it.hasNext()){
            treeNode.value = it.next();
            if(!treeNode.value.equals("#")){
            	treeNode.left = createTreeBinary(new TNode("#"),it);
            	treeNode.right = createTreeBinary(new TNode("#"),it);
            	return treeNode;
            }
            else{
            	return null;
            }  
        }
		else{
			return null;
		}
    }
    
    public void treeLevel(TNode treeNode,int level){
        if(treeNode!=null){
        	if(level==1){
        		buffer.append(treeNode.value);
        	}
        	else{
        		treeLevel(treeNode.left,level-1);
        		treeLevel(treeNode.right,level-1);
        	}	
        }
        else{
        	return;
        }
    }
=======
	
	StringBuffer buffer=new StringBuffer();
    
	//先序遍历初始化二叉树
    public TNode createTreeBinary(TNode treeNode,Iterator<String> it){
		if(it.hasNext()){
            treeNode.value = it.next();
            if(!treeNode.value.equals("#")){
            	treeNode.left = createTreeBinary(new TNode("#"),it);
            	treeNode.right = createTreeBinary(new TNode("#"),it);
            	return treeNode;
            }
            else{
            	return null;
            }  
        }
		else{
			return null;
		}
    }
    
    public void treeLevel(TNode treeNode,int level){
        if(treeNode!=null){
        	if(level==1){
        		System.out.print(treeNode.value);
        		buffer.append(treeNode.value);
        	}
        	else{
        		treeLevel(treeNode.left,level-1);
        		treeLevel(treeNode.right,level-1);
        	}	
        }
        else{
        	return;
        }
		
    }
  
>>>>>>> branch 'master' of https://github.com/zhangchengy/hello-world
}
