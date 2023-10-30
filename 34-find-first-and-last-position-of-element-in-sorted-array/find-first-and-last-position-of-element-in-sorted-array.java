class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        
        // Search for the first occurrence of the target.
        result[0] = findFirstOccurrence(nums, target);
        
        // Search for the last occurrence of the target.
        result[1] = findLastOccurrence(nums, target);
        
        return result;
    }
    
    private int findFirstOccurrence(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int firstOccurrence = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            
            if (nums[mid] == target) {
                firstOccurrence = mid;
            }
        }
        
        return firstOccurrence;
    }
    
    private int findLastOccurrence(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int lastOccurrence = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            
            if (nums[mid] == target) {
                lastOccurrence = mid;
            }
        }
        
        return lastOccurrence;
    }
}
