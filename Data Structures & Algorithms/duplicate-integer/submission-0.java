class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueNum = new HashSet<>();
        for(int i: nums){
            uniqueNum.add(i);
        }
        if(uniqueNum.size() == nums.length) return false;
        return true;
    }
}