class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false; // Negative numbers cannot be palindromes

        int reversed = 0;
        int original = x;

        while (x != 0) {
            int remainder = x % 10;
            reversed = reversed * 10 + remainder;
            x /= 10;
        }

        return original == reversed;
    }
}
