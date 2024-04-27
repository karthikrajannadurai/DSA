package org.dsa.Search;

import java.util.HashMap;

public class L_01_Two_Sum {

    public int[] twoSum(int[] nums, int target) {

        int[] ans = new int[2];
        int sub = 0;
        Integer temp;
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            hashmap.put(nums[index], index);
        }

        for (int index = 0; index < nums.length; index++) {
            sub = target - nums[index];
            temp = hashmap.get(sub);
            if (temp != null && temp != index) {
                ans[1] = temp;
                ans[0] = index;
                return ans;
            }
        }
        return ans;
    }

    // efficient because of no search
    public int[] twoSumArray(int[] nums, int target) {
        int last = nums.length-1;
        for (int i=0;i<=last;i++){
            for (int j=i+1;j<=last;j++){
                if(nums[i]+nums[j]==target){ // front check
                    return new int[] {i,j};
                }
                if(nums[last-i]+nums[j]==target){ // back check
                    return new int[] {last-i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
