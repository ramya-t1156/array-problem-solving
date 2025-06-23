class Solution {
    public int missingNumber(int[] nums) {
        int xor = nums[0];
        for(int i = 1;i<nums.length;i++){
            xor ^= nums[i];
            xor ^= i;
        }
        xor ^= nums.length;
        return xor;
    }
}
