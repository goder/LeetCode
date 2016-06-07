/**
 * Question:
 * Reverse digits of an integer.
 * Assume the input is a 32-bit integer.
 * (逆置一个整数，假设输入是一个32位的整数)
 *Example1: x = 123, return 321
 *Example2: x = -123, return -321
 *解题思路：
 *1、对于整数范围的限制，通用的做法，可以通过<<移位来进行操作,((-1)<<31)<=x<=((-1)*((-1)<<31+1))来限制
 *2、对于，数字的逆置可以，可以通过/整除来取高位，通过%取余来获取低位
 *3、设置退出的条件，可以设置一个long类型的变量，来接受最终逆置之后的数字，然后再检验是否有超出范围
 */
public class Solution {
   public int reverse(int x) {
		   //这个很完美
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
		//特殊情况-10到10之间的直接返回
		if(x<10&&x>10){
        	return x;
        }
        long sum=0;//用一个long类型的      
        while(x!=0){//运行终止条件
        	sum=(sum+x%10)*10;//把数字最后一位拆下来，加入新的sum中并且乘以10往高移一位
        	x=x/10;//对原数，对10取整除		
        
        }        	
        sum=sum/10;//对多移的一位，再整除一下，相低位移回来
        //检验移位后逆制的数字，是否超过32位整数的范围限制
        if(!(((-1<<31))<=sum&&sum<=-1*(((-1<<31)+1)))){    			
    		return 0;
         }    	
        return (int)sum;
    }
}