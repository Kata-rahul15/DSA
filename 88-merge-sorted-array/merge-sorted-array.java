class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int right=0;
        for(int i=m; i<=nums1.length-1;i++){
            nums1[i]=nums2[right];
            right++;
        }
        Arrays.sort(nums1);
    }
}