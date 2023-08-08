class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0, large = 0;
        for(int i=0;i<gain.length;i++) {
            sum +=gain[i];
            large = Math.max(sum,large);
        }
        return large;
    }
}