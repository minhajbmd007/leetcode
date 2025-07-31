class Solution {
    public char findTheDifference(String s, String t) {
        
        int[] arr = new int[26];

        // It will count the frequency of String s 
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i) - 'a']++;
        }

        // remove the characters of String t whichever present in arr
        char remove = '\0';
        for(char ele:t.toCharArray()){
            if(arr[ele-'a']!=0){
                arr[ele-'a']--;
            }else{
                remove = ele;
            }
        }

        return remove;
    }
}