package Company1_Microsoft.Problem05;

import java.util.*;
class Solution {
    public int minMoves2(int[] nums) {

        int length = nums.length;
        int moves = 0;

        Arrays.sort(nums);

        int valueToBeEqualize = nums[length / 2];
        

        for (int num : nums) {
            moves += Math.abs(num - valueToBeEqualize);
        }

        return moves;
    }
}