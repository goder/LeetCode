
/**
*Question��Nim Game
*You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you take turns *to remove 1 to 3 stones. The one who removes the last stone will be the winner. You will take the first turn to remove the stones.
*�����ں���������Ϸ����������һ��ʯͷ��ÿ����������������һ��ʯͷ���ˣ�����1��3��ʯͷ��˭��������ǿ�ʯͷ��˭��ʤ�������������֣���*������ʯͷ��
*Both of you are very clever and have optimal strategies for the game. Write a function to determine whether you can win the game *given the number of stones in the heap.
*���������ܴ��������Ƕ�ı��дһ��������Ԥ��һ�£����������ʯͷ�ĸ������Ƿ���Ӯ����
*/

public class Solution {
    public boolean canWinNim(int n) {
          
         //�����Լ򵥵ľ����Ƶ������Եó��������Ա�������ʱ�����ֻ��� 
         if(n%4==0){
             return false;
         }else{
             return true;
         }
    }
}