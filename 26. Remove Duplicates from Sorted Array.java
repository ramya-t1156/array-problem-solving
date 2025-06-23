class Solution {
    public int removeDuplicates(int[] nums) {
        int lastUniqueIdx = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]!=nums[lastUniqueIdx]){
                nums[++lastUniqueIdx] = nums[i]; 
            }
        }
        return lastUniqueIdx+1;
    }
}
