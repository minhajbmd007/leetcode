class Solution {
    public int longestPalindrome(String s) {
        int ans = 0;
        Map<Character, Integer> count = new HashMap<>();
        for (char letter : s.toCharArray()) {
            int letterCount = count.getOrDefault(letter, 0);
            count.put(letter, letterCount+1);
        }

        for (Integer letterCount : count.values()) {
            ans += (letterCount / 2) * 2;
        }

        return (ans < s.length() ? ans+1 : ans);
    }
}