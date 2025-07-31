class Solution {
    public int findNumbers(int[] nums) {
      int count =0;
      
      for(int num : nums){
        if(even(num)){
            count++;
        }
      }
      return count;
    }

    public boolean even(int num){
      int noofDigits = digits(num);
    //   if(noofDigits % 2 == 0){
    //     return true;
    //   }
    //   return false;
       return noofDigits %2 == 0;
    }
    static int digits(int num){
        int count =0;

        while(num > 0){
            count++;
            num = num/10;
        }
        return count;
    }    
    }
