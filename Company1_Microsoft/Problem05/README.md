# Minimum Moves to Equal Array Elements II

Given an integer array `nums` of size `n`, return the minimum number of moves required to make all array elements equal.

In one move, you can increment or decrement an element of the array by 1.

---

## Example 1:

**Input:**

```java
nums = [1, 2, 3]
```

**Output:**

```plaintext
2
```

**Explanation:**
Only two moves are needed (remember each move increments or decrements one element):

```
[1, 2, 3]  =>  [2, 2, 3]  =>  [2, 2, 2]

```

---

## Constraints:

- `n==nums.length`
- `1≤nums.length≤10 5`
- `−10 9 ≤nums[i]≤10`

---

## Approach:

Approach

### Steps to Solve:

1. Sorting the Array:
   The key observation is that the minimum number of moves to equalize all elements is achieved when we choose the median of the array. This is because the median minimizes the sum of absolute differences between the elements.

2. Calculating the Moves:
   After sorting the array, we pick the median (the element at the middle index for an odd-length array, and any element in the middle for even-length arrays). We then calculate the total number of moves required by summing the absolute differences between each element in the array and the median.

---

## Complexity Analysis:

1. **Time Complexity:**

   - Sorting the array takes 𝑂(𝑛log⁡𝑛), where 𝑛 is the length of the array.

   - summing the differences takes (𝑛). Thus, the overall time complexity is 𝑂(𝑛log⁡𝑛).

2. **Space Complexity:**
   - The space complexity is 𝑂(1), as we are only using a constant amount of extra space, excluding the input array.

---
