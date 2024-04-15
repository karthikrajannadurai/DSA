package org.dsa.StackUsingList;

import java.util.HashMap;
import java.util.Stack;

public class L_496_NextGreaterElement {

    /**
     * 1. There are two ways to find this using hashmap
     * 2. using input range to hash the output.
     * 3. core logic is same for above both approach
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int index = nums2.length - 1; index >= 0; index--) {

            while (!stack.isEmpty() && stack.peek() <= nums2[index]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                map.put(nums2[index], -1);
            } else {
                map.put(nums2[index], stack.peek());
            }
            stack.push(nums2[index]);
        }

        for (int index = nums1.length - 1; index >= 0; index--) {
            nums1[index] = map.get(nums1[index]);
        }
        return nums1;
    }
}
