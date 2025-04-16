class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> HashMap = new HashMap<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int more = target - nums[i];
                if(HashMap.containsKey(more)){
                    return new int[]{HashMap.get(more), i};
                }
            HashMap.put(nums[i],i);
        }
        return new int[]{};
        
    }
}