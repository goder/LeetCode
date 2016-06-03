/**
*Question:
*Bulls and Cows
*You are playing the following Bulls and Cows game with your friend: You write down a number and ask your friend to guess what the *number is. Each time your friend makes a guess, you provide a hint that indicates how many digits in said guess match your secret *number exactly in both digit and position (called "bulls") and how many digits match the secret number but locate in the wrong *position (called "cows"). Your friend will use successive guesses and hints to eventually derive the secret number.
*解题思路：
 * 1、把问题求解bulls和cows问题，分成两部分，分别求值，避免相互干扰。
 * 2、设置俩个数组listA\listB，分别记录两种状态，listA记录求解bulls时，数组的下标；listA记录求解bulls时，数组的下标；
 * 3、计算bulls,计算cows 
 * 
 */
public class Solution {
    public String getHint(String secret, String guess) {
          int length=secret.length();
          int [] listA=new int[length];//指代guess每一个数的状态，0为未访问，非零为访问，描述bulls
          int [] listB=new int[length];//指代guess每一个数的状态，0为未访问，非零为访问，描述cows
		  int bulls=0;
		  int cows=0;
		  for(int i=0;i<length;i++){
		       if(secret.charAt(i)==guess.charAt(i)){
		           listA[i]++;//标记A
			       bulls++;//计算bull数量
			  }
		  }
		  for(int i=0;i<length;i++){
		      //当listA在此下标不为零，证明此位置是bulls，跳过本次循环
		       if(listA[i]!=0){
			        continue;   
			               
			    }
			  for(int j=0;j<length;j++){
			      //当listA在此下标不为零，证明此位置是bulls，跳过本次循环
			           if(listA[j]!=0){
			               continue;
			           }
			           if(listB[j]==0&&secret.charAt(i)==guess.charAt(j)){
			               listB[j]++;
			               cows++;
			               break;//找到cows位置，即跳出循环
			               
			           }
				  }
			  }
			  return bulls+"A"+cows+"B";
		  }
}