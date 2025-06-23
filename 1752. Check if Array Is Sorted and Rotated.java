class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        // This will count the number of places where the order is violated 
        int count = 0;

        // to check the number of times the array violates the non-decreasing order
        for(int i = 1;i<n;i++){
            if(nums[i]<nums[i-1]){
                count++; // Increment the count when the number is less that previous
            }
        }

        // Check the circular condition ; last element should not be greater that the first
        // if rotation happened, nums[n-1] > nums[0] indicates one more violaton
        if(nums[n-1]>nums[0]){
            count++;
        }

        // here if the array is sorted not rotated => count = 1 (true) - from a[n-1]>a[0]
        // rotated not sorted count>1

        // for a rotaed sorted array, there can be at most one such violation
        return count>1?false:true;
    }
}
