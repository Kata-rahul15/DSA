class Solution {
    public int missingNumber(int[] nums) {
        
        int n=nums.length;
        int sum = (n*(n+1))/2;
        int sum2=0;
        for(int j=0;j<n;j++){
            sum2= sum2 + nums[j];
        }
        return sum-sum2;
    }
}