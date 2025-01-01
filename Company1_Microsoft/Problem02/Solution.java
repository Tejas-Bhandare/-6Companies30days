package Company1_Microsoft.Problem02;

class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        

        int left = 0;
        int right = 0;
        int winSize = 0;
        int size = nums.length;
        int prevNum = 0;
        int current = 0;
        int count = 0;
        boolean isIncremovable = true;

        for(winSize = 1; winSize <= size; winSize++){
            left = 0;
            right = winSize;


            while(right <= size)
            {
                prevNum = -1;
                current = 0;
                isIncremovable = true;
                while((current < size))
                {
                    if(current == left)
                    {
                        current += winSize;
                        if(current == size)
                        {
                            break;
                        }
                    }
                    if(prevNum >= nums[current])
                    {
                        isIncremovable = false;
                        break;
                    }
                    prevNum = nums[current];
                    current++;
                }
                if(isIncremovable)
                {
                    count++;
                }
                left++;
                right++;
            }

        }
        return count;
    }
}