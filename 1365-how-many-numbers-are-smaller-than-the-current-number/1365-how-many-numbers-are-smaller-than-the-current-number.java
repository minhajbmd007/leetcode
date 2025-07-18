import java.util.*;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        ArrayList<Integer> resultList = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            int count =0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i] && (j!=i)){
                count++;
                }
            }
            resultList.add(count);
        }
        int[] resultArray = new int[resultList.size()];
        for(int k=0;k<resultList.size();k++){
            resultArray[k]=resultList.get(k);
        }
        return resultArray;
        
    }
}