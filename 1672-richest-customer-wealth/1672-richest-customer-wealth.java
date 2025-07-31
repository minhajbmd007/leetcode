
class Solution {
    
    public int maximumWealth(int[][] accounts) {
    int ans = Integer.MIN_VALUE;
       for (int[] account2 : accounts) {
            //when you start a new col , take a new sum for that row
            int sum = 0;
            for (int element : account2) {
                sum += element;
            }
            if(sum > ans){
                ans = sum;
            }

       }
       return ans;
       
    }
}