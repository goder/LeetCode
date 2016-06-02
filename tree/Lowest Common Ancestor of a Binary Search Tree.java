
/**
 * Question��
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.    
 * ���ṩһ����������������������ڵ㣬�ҳ��������ڵ����͵Ĺ�ͬ���Ƚڵ㣩
 */

 /**
 *����������(Binary Search Tree��BST)
 *����������(Binary Sort Tree)�ֳƶ������(����)��(Binary Search Tree)���䶨��Ϊ�����������������ǿ����������������������ʵĶ�������
 * ���������������ǿգ��������������н���ֵ��С�ڸ�����ֵ��
 * ���������������ǿգ��������������н���ֵ�����ڸ�����ֵ��
 * ���������������ָ���һ�ö�����������
 * �ⷨ��������������֪�ڵ��ÿһ���ڵ����Ƚϣ���������нڵ�һ��һС���Ϳ���ȷ���ýڵ�
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
        	//���Ϊ�գ��򷵻�null
        	if(root==null){
        	    return null;
        	}
        	//��ȷ����p,q��С
        	if(p.val<q.val){
        	//�ݹ���ڣ��������������ʱ�������ҵ��ĺ���ֵ
    		if(p.val<=root.val&&q.val>=root.val){
    			return root;
    		}else{//���������ݹ�
    			if( lowestCommonAncestor(root.left,p,q)!=null){
    				return lowestCommonAncestor(root.left,p,q);
    			//���������ݹ�
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