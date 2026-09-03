class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int windowSum=0;
        int count=0;
        for(int i =0; i< k ; i++){
            windowSum += arr[i];
        }
        if((windowSum / k )>=threshold){
            count++;
        }
        int maxsum = windowSum;
        for(int j= k;j<arr.length;j++){
            windowSum += arr[j];
            windowSum -=arr[j-k];
            
            if((windowSum / k )>=threshold){
               count++;
               }
        }
        return count;
    }
}