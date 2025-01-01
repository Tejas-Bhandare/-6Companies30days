# Count Number of Nice Subarrays

Given an array of integers `nums` and an integer `k`, a continuous subarray is called **nice** if there are exactly `k` odd numbers in it.

Return the number of nice subarrays.

---

## Example 1:

**Input:**

```plaintext
nums = [1,1,2,1,1], k = 3
```

**Output:**

```plaintext
2
```

**Explanation:** The only subarrays with 3 odd numbers are `[1,1,2,1]` and `[1,2,1,1]`.

---

## Example 2:

**Input:**

```plaintext
nums = [2,4,6], k = 1
```

**Output:**

```plaintext
0
```

**Explanation:** There are no odd numbers in the array.

---

## Example 3:

**Input:**

```plaintext
nums = [2,2,2,1,2,2,1,2,2,2], k = 2
```

**Output:**

```plaintext
16
```

---

## Constraints:

- `1 <= nums.length <= 50000`
- `1 <= nums[i] <= 10^5`
- `1 <= k <= nums.length`

---

## Approach:

### Steps to Solve:

1. Use a prefix sum approach to count the number of odd numbers encountered while traversing the array.
2. Use a hashmap to store the frequency of prefix sums.
3. For each prefix sum, check if there exists a prefix sum such that the difference is equal to `k`. If yes, it contributes to a valid subarray.

---

## Complexity Analysis:

1. **Time Complexity:**

   - \(O(n)\), where \(n\) is the length of the array. Each element is processed once.

2. **Space Complexity:**
   - \(O(n)\), due to the hashmap used to store prefix sums.

---

## Edge Cases:

1. Array contains no odd numbers:

   - Input: `nums = [2,4,6], k = 1`
   - Output: `0`

2. Array contains only odd numbers:

   - Input: `nums = [1,1,1,1], k = 2`
   - Output: Subarrays with exactly 2 odd numbers will be counted.

3. `k` is greater than the total number of odd numbers in the array:
   - Input: `nums = [1,2,3,4], k = 5`
   - Output: `0`
