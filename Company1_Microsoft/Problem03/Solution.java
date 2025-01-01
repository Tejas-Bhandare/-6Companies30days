package Company1_Microsoft.Problem03;
import java.util.*;

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0,1);

        int currentSum = 0;
        int niceSubArrayCount = 0;

        for(int iNo : nums)
        {
            currentSum += iNo % 2;

            niceSubArrayCount += prefixSumCount.getOrDefault(currentSum - k, 0);

            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
        }

        return niceSubArrayCount;
        
    }
}