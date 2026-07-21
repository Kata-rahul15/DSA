class Solution {
    public boolean isPalindrome(int x) {
        char [] nums = Integer.toString(x).toCharArray();
        int right=nums.length-1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[right]){
                return false;
            }
            right--;
        }
        return true;
}}