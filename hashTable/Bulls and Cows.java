/**
*Question:
*Bulls and Cows
*You are playing the following Bulls and Cows game with your friend: You write down a number and ask your friend to guess what the *number is. Each time your friend makes a guess, you provide a hint that indicates how many digits in said guess match your secret *number exactly in both digit and position (called "bulls") and how many digits match the secret number but locate in the wrong *position (called "cows"). Your friend will use successive guesses and hints to eventually derive the secret number.
*����˼·��
 * 1�����������bulls��cows���⣬�ֳ������֣��ֱ���ֵ�������໥���š�
 * 2��������������listA\listB���ֱ��¼����״̬��listA��¼���bullsʱ��������±ꣻlistA��¼���bullsʱ��������±ꣻ
 * 3������bulls,����cows 
 * 
 */
public class Solution {
    public String getHint(String secret, String guess) {
          int length=secret.length();
          int [] listA=new int[length];//ָ��guessÿһ������״̬��0Ϊδ���ʣ�����Ϊ���ʣ�����bulls
          int [] listB=new int[length];//ָ��guessÿһ������״̬��0Ϊδ���ʣ�����Ϊ���ʣ�����cows
		  int bulls=0;
		  int cows=0;
		  for(int i=0;i<length;i++){
		       if(secret.charAt(i)==guess.charAt(i)){
		           listA[i]++;//���A
			       bulls++;//����bull����
			  }
		  }
		  for(int i=0;i<length;i++){
		      //��listA�ڴ��±겻Ϊ�㣬֤����λ����bulls����������ѭ��
		       if(listA[i]!=0){
			        continue;   
			               
			    }
			  for(int j=0;j<length;j++){
			      //��listA�ڴ��±겻Ϊ�㣬֤����λ����bulls����������ѭ��
			           if(listA[j]!=0){
			               continue;
			           }
			           if(listB[j]==0&&secret.charAt(i)==guess.charAt(j)){
			               listB[j]++;
			               cows++;
			               break;//�ҵ�cowsλ�ã�������ѭ��
			               
			           }
				  }
			  }
			  return bulls+"A"+cows+"B";
		  }
}