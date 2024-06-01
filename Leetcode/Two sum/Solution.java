import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            hs.put(nums[i],i);
        }
        for(int i = 0; i<nums.length; i++){
            int num = nums[i];
            int value = target - num;
            if(hs.containsKey(value)){
                int index = hs.get(value);
                if(index == i) continue;

                return new int[]{i,index};
            }
        }
        return new int[]{};
    }
}