/**
 * Question:
 * Find the total area covered by two rectilinear rectangles in a 2D plane.
 * （计算两个直角矩形在二维直角坐标系中覆盖的面积）
 * Assume that the total area is never beyond the maximum possible value of int.
 * （假设总面积不会超过整数最大值）
 * 解题思路：
 * 1、逆向思考，存在两种情况，相离或者相交
 * 2、相交情况较为复杂，所以选择以相离作为判断条件，计算二者面积和
 * 3、相交时，只要把二者面积和减去共同部分，即可
 *
 */

public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1=(C-A)*(D-B);
        int area2=(G-E)*(H-F);
       //判断是否相离
    	if(B>H||G<A||D<F||C<E){    	    
    		return area1+area2;      	   
        }else{        	
        	 //为重合矩形两个点(I,J),(K,L)赋值
            int I=A>E?A:E;
            int J=B>F?B:F;
            int K=G<C?G:C;
            int L=H<D?H:D;
            int coveredArea=(K-I)*(L-J);      
            return area1+area2-coveredArea;
        }
        
        
        
    }
}