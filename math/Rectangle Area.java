/**
 * Question:
 * Find the total area covered by two rectilinear rectangles in a 2D plane.
 * ����������ֱ�Ǿ����ڶ�άֱ������ϵ�и��ǵ������
 * Assume that the total area is never beyond the maximum possible value of int.
 * ��������������ᳬ���������ֵ��
 * ����˼·��
 * 1������˼�������������������������ཻ
 * 2���ཻ�����Ϊ���ӣ�����ѡ����������Ϊ�ж�������������������
 * 3���ཻʱ��ֻҪ�Ѷ�������ͼ�ȥ��ͬ���֣�����
 *
 */

public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1=(C-A)*(D-B);
        int area2=(G-E)*(H-F);
       //�ж��Ƿ�����
    	if(B>H||G<A||D<F||C<E){    	    
    		return area1+area2;      	   
        }else{        	
        	 //Ϊ�غϾ���������(I,J),(K,L)��ֵ
            int I=A>E?A:E;
            int J=B>F?B:F;
            int K=G<C?G:C;
            int L=H<D?H:D;
            int coveredArea=(K-I)*(L-J);      
            return area1+area2-coveredArea;
        }
        
        
        
    }
}