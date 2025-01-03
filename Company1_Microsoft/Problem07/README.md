# Wiggle Sort II

## Problem Description

Given an integer array `nums`, reorder it such that:

- `nums[0] < nums[1] > nums[2] < nums[3] ...`

You may assume that the input array always has a valid answer.

### Examples

#### Example 1

Input: `nums = [1,5,1,1,6,4]`

Output: `[1,6,1,5,1,4]`

Explanation: `[1,4,1,5,1,6]` is also accepted.

#### Example 2

Input: `nums = [1,3,2,2,3,1]`

Output: `[2,3,1,3,1,2]`

### Constraints

- `1 <= nums.length <= 5 * 10^4`
- `0 <= nums[i] <= 5000`
- It is guaranteed that there will be an answer for the given input `nums`.

---

## Solution

The solution uses the following approach:

1. **Clone and Sort the Array**: First, create a copy of the input array and sort it.
2. **Split the Array**: Divide the sorted array into two parts:
   - The smaller half (for even indices).
   - The larger half (for odd indices).
3. **Merge Alternately**: Populate the original array by alternately taking elements from the smaller and larger halves.

This approach ensures the wiggle pattern: `nums[0] < nums[1] > nums[2] < nums[3] ...`

---

## Implementation

Here is the Java implementation of the solution:

```java
import java.util.Arrays;

class Solution {
    public void wiggleSort(int[] nums) {
        int length = nums.length;
        int mid = (length + 1) / 2;
        int j = mid - 1;
        int k = length - 1;

        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        if (length < 2) {
            return;
        } else {
            for (int i = 0; i < length; i++) {
                if (i % 2 == 0) {
                    nums[i] = sorted[j--];
                } else {
                    nums[i] = sorted[k--];
                }
            }
        }
    }
}
```

---

## Explanation

1. **Sorting**: Sorting ensures that we can split the array into smaller and larger halves.
2. **Indexing**:
   - Even indices (`i % 2 == 0`) take elements from the smaller half.
   - Odd indices (`i % 2 != 0`) take elements from the larger half.
3. **Reordering**: By filling from the ends of the sorted array, we avoid overlapping values.

---

## Edge Cases

1. **Single Element**: If `nums.length < 2`, the function returns immediately as no reordering is needed.
2. **Duplicate Values**: The algorithm handles duplicates as they are distributed between the smaller and larger halves.

---

## Complexity Analysis

- **Time Complexity**:

  - Sorting the array takes `O(n log n)`.
  - The reordering step takes `O(n)`.
  - Overall: **`O(n log n)`**.

- **Space Complexity**:
  - Cloning the array takes `O(n)`.
  - Overall: **`O(n)`**.

---

## Usage

To use this implementation:

1. Instantiate the `Solution` class.
2. Call the `wiggleSort` method with the input array.

Example:

```java
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 5, 1, 1, 6, 4};
        solution.wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
```
