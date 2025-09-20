class Solution {
    
    private int reverseHelper(int n, int digits) {
        if (n == 0) return 0;
        int lastDigit = n % 10;
        return lastDigit * (int)Math.pow(10, digits - 1) + reverseHelper(n / 10, digits - 1);
    }

    public int reverseNumber(int n) {
        int digits = (int)(Math.log10(n)) + 1;  // count digits
        return reverseHelper(n, digits);
    }

    // Test
    
}
public class reverseDIgit {
public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.reverseNumber(1234)); // Output: 4321
    }
}
