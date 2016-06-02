
/**
 * Question：
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.    
 * （提供一个二叉查找树，给出两个节点，找出这两个节点的最低的共同祖先节点）
 */

 /**
 *二叉排序树(Binary Search Tree：BST)
 *二叉排序树(Binary Sort Tree)又称二叉查找(搜索)树(Binary Search Tree)。其定义为：二叉排序树或者是空树，或者是满足如下性质的二叉树：
 * ①若它的左子树非空，则左子树上所有结点的值均小于根结点的值；
 * ②若它的右子树非空，则右子树上所有结点的值均大于根结点的值；
 * ③左、右子树本身又各是一棵二叉排序树。
 * 解法：就是拿两个已知节点和每一个节点作比较，如果比其中节点一大一小，就可以确定该节点
 * 
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        	//如果为空，则返回null
        	if(root==null){
        	    return null;
        	}
        	//先确定，p,q大小
        	if(p.val<q.val){
        	//递归出口，当符合这个条件时，返回找到的合适值
    		if(p.val<=root.val&&q.val>=root.val){
    			return root;
    		}else{//向左子树递归
    			if( lowestCommonAncestor(root.left,p,q)!=null){
    				return lowestCommonAncestor(root.left,p,q);
    			//向右子树递归
    			}else if(lowestCommonAncestor(root.right,p,q)!=null){
    				 return	lowestCommonAncestor(root.right,p,q);
    			}
    		}
    	}else{
    	    	if(p.val>=root.val&&q.val<=root.val){
    			return root;
    		}else{
    			if( lowestCommonAncestor(root.left,p,q)!=null){
    				return lowestCommonAncestor(root.left,p,q);
    			
    			}else if(lowestCommonAncestor(root.right,p,q)!=null){
    				 return	lowestCommonAncestor(root.right,p,q);
    			}
    		}
    	}

    	
    	
    	return null;
    }
}