class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int xeroCount=0;
        int maxLength=0;
        for(int i =0; i < nums.length; i++){
            if(nums[i]==0){
                xeroCount++;
            }
            while(xeroCount>k){
                if(nums[left]==0){
                    xeroCount--;
                }
                left++;
            }
            maxLength=Math.max(maxLength , i-left + 1);
        }
        return maxLength;
        
    }
}