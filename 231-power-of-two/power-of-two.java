class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        
        // Use bitwise AND to check if there is only one bit set
        return (n & (n - 1)) == 0;
    }
}
