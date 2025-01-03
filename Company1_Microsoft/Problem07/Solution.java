package Company1_Microsoft.Problem07;

import java.util.*;

class Solution {
    public void wiggleSort(int[] nums) {

        int length = 0;
        int temp = 0;
        length = nums.length;
        int mid = (length + 1) / 2;
        int j = mid - 1;
        int k = length -1;

        int [] sorted = nums.clone();
        Arrays.sort(sorted);


        if(length < 2)
        {
            return;
        }
        else
        {
            for(int i = 0; i < length; i++)
            {
                if(i % 2 == 0)
                {
                    nums[i] = sorted[j--];
                }
                else
                {
                    nums[i] = sorted[k--];
                }
            }
        }
    }
}