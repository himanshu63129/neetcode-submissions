class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[] = new int[nums.length];
        int l=0;
        int r=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            int val;
            if(Math.abs(nums[l])>Math.abs(nums[r])){
                val = nums[l];
                l++;
            }else{
                val = nums[r];
                r--;
            }
            ans[i]=val*val;
            
        }
        return ans;
    }
}