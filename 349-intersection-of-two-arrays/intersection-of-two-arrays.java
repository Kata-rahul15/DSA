class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs= new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(int num:nums1){
            hs.add(num);
        }
        for(int num:nums2){
            if(hs.contains(num)){
                result.add(num);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
   }
}