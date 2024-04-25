package org.dsa.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class L_1016_GenerateBinaryNumberFrom1ToN {

    /**
     * 1. Generate All binary numbers from 1 to n, and check for substring
     * 2. Generate All binary numbers from n to n/2, and check for substring
     *  the above n/2 method works, because of the pattern in the binary number
     *  '1'     - 1
     *  '10'    - 2
     *  '11'    - 3
     *  '100'   - 4
     *  '101'   - 5
     *  '110'   - 6
     *  '111'   - 7
     *  '1000'  - 8
     *  '1001'  - 9
     *  '1010'  - 10
     *
     *  '1011'  - 11
     *  '1100'  - 12
     *  '1101'  - 13
     *  '1110'  - 14
     *  '1111'  - 15
     *  '10000' - 16
     *  '10001' - 17
     *  '10010' - 18
     *  '10011' - 19
     *  '10100' - 20
     *
     *  So, in the above example, if you see 20 and 10, if we are able to find substring of 20 in s, then 10 is automatically present in s.
     *  but we need to generate binary numbers from n or need to use Integer.toBinaryString();
     */
    public boolean queryString(String s, int n) {

        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        String temp;
        for (int index = 0; index < n; index++) {
            temp = queue.poll();
            if (!s.contains(temp)) {
                return false;
            }
            queue.add(temp + '0');
            queue.add(temp + '1');
        }
        return true;
    }
}
