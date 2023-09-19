class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 0) {  // Check if the least significant bit is 0 (even number)
                num >>= 1;        // Right shift by 1 (equivalent to division by 2)
            } else {
                num -= 1;
            }
            count++;
        }
        return count;
    }
}
