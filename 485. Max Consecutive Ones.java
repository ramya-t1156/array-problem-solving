class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ones = 0 , maxOnes = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==1){
                ones++;
            }
            else{
                maxOnes = Math.max(maxOnes,ones);
                ones = 0;
            }
        }
        maxOnes = Math.max(maxOnes,ones);
        return maxOnes;
    }
}
