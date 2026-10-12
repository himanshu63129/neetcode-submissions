class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<=numbers.length-1;i++){
            int need = target-numbers[i];
            if(hm.containsKey(need)){
                return new int[]{hm.get(need)+1,i+1};
            }
            hm.put(numbers[i],i);
        }
        return new int[]{-1,-1};
    }
}
