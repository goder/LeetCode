/**
 * Question:
 * Reverse digits of an integer.
 * Assume the input is a 32-bit integer.
 * (����һ������������������һ��32λ������)
 *Example1: x = 123, return 321
 *Example2: x = -123, return -321
 *����˼·��
 *1������������Χ�����ƣ�ͨ�õ�����������ͨ��<<��λ�����в���,((-1)<<31)<=x<=((-1)*((-1)<<31+1))������
 *2�����ڣ����ֵ����ÿ��ԣ�����ͨ��/������ȡ��λ��ͨ��%ȡ������ȡ��λ
 *3�������˳�����������������һ��long���͵ı�������������������֮������֣�Ȼ���ټ����Ƿ��г�����Χ
 */
public class Solution {
   public int reverse(int x) {
		   //���������
		long r = 0;
	        while(x != 0){
	            r = r*10 + x%10;
	            x /= 10;
	        }
	        if(r >= Integer.MIN_VALUE && r <= Integer.MAX_VALUE)
	            return (int)r;
	        else
	            return 0;
      }
	public int reverse2(int x) {
		//�������-10��10֮���ֱ�ӷ���
		if(x<10&&x>10){
        	return x;
        }
        long sum=0;//��һ��long���͵�      
        while(x!=0){//������ֹ����
        	sum=(sum+x%10)*10;//���������һλ�������������µ�sum�в��ҳ���10������һλ
        	x=x/10;//��ԭ������10ȡ����		
        
        }        	
        sum=sum/10;//�Զ��Ƶ�һλ��������һ�£����λ�ƻ���
        //������λ�����Ƶ����֣��Ƿ񳬹�32λ�����ķ�Χ����
        if(!(((-1<<31))<=sum&&sum<=-1*(((-1<<31)+1)))){    			
    		return 0;
         }    	
        return (int)sum;
    }
}