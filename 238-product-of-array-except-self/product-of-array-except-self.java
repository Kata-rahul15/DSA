class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];

        prefix[0]= nums[0];
        for (int i=1;i<n;i++){
            prefix[i]= nums[i] * prefix[i-1];
        }
        suffix[n-1] = nums[n-1];
        for(int j = n-2; j >= 0 ;j--){
            suffix[j] = nums[j] * suffix[j +1];
        }

        for(int k=0;k<n;k++){
        int left =  (k==0)? 1: prefix[k-1];
        int right = (k==n-1)? 1: suffix[k+1];

        nums[k] = left* right;
        }
        return nums;
    }
}