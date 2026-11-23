class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        int n=arr.length;
        int prefix[]= new int [n+1];
        int sum=0;

        for(int i =0;i<n;i++) {
            prefix[i+1]= prefix[i]+arr[i];
        }


        for (int i =0;i<n;i++){
            for(int j=i;j<n;j++){
                int length = j-i+1;
                if(length % 2!=0){
                    sum += prefix[j+1] - prefix[i];
                }
            }
        }
        return sum;
    }
}

