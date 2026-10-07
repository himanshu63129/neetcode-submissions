class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        for(int num:nums1){
            s1.add(num);
        }
        for(int num:nums2){
            s2.add(num);
        }
        int temp[] = new int [Math.min(nums1.length,nums2.length)];
        int k=0;
        for(int num:s1){
            if(s2.contains(num)){
                temp[k]=num;
                k++;
            }
        }
        int ans[]= new int [k];
        for(int i=0;i<k;i++){
            ans[i]=temp[i];
        }
        return ans;
    }
}