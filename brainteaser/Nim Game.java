
/**
*Question：Nim Game
*You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you take turns *to remove 1 to 3 stones. The one who removes the last stone will be the winner. You will take the first turn to remove the stones.
*（你在和朋友玩游戏，桌子上有一摞石头，每次你们俩轮流从这一摞石头顶端，拿走1到3个石头。谁拿走最后那块石头，谁获胜。假如你是先手，可*以先拿石头）
*Both of you are very clever and have optimal strategies for the game. Write a function to determine whether you can win the game *given the number of stones in the heap.
*（你俩都很聪明，足智多谋。写一个函数，预测一下，如果给定你石头的个数，是否能赢。）
*/

public class Solution {
    public boolean canWinNim(int n) {
          
         //经过对简单的举例推倒，可以得出，当可以被四整除时，先手会输 
         if(n%4==0){
             return false;
         }else{
             return true;
         }
    }
}