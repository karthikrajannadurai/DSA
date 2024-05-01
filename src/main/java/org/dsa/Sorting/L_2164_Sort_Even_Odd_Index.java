package org.dsa.Sorting;

import java.util.ArrayList;

public class L_2164_Sort_Even_Odd_Index {

    // if the input is in particular range then you can use the hashing technique.
    public int[] sortEvenOdd(int[] nums) {

        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if ((index & 1) == 1) {
                odd.add(nums[index]);
            } else {
                even.add(nums[index]);
            }
        }
        odd.sort((Integer a, Integer b) -> {
            if (a < b) {
                return 1;
            } else {
                return -1;
            }
        });
        even.sort((Integer a, Integer b) -> {
            if (a < b) {
                return -1;
            } else {
                return 1;
            }
        });
        int Ieven = 0, Iodd = 1, evenA = 0, oddA = 0;
        while (evenA < even.size() && oddA < odd.size()) {
            nums[Iodd] = odd.get(oddA);
            nums[Ieven] = even.get(evenA);
            Ieven += 2;
            Iodd += 2;
            evenA++;
            oddA++;
        }

        while (evenA > even.size() && oddA < odd.size()) {
            nums[Iodd] = odd.get(oddA);
            Iodd += 2;
            oddA++;
        }
        while (evenA < even.size()) {
            nums[Ieven] = even.get(evenA);
            Ieven += 2;
            evenA++;
        }
        return nums;
    }
}
