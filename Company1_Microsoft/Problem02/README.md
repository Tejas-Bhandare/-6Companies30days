# Count the Number of Incremovable Subarrays I

You are given a 0-indexed array of positive integers `nums`.

A subarray of `nums` is called **incremovable** if `nums` becomes strictly increasing on removing the subarray.

**Note:** An empty array is considered strictly increasing.

A subarray is a contiguous non-empty sequence of elements within an array.

---

## Example 1:

**Input:**

```plaintext
nums = [1,2,3,4]
```

**Output:**

```plaintext
10
```

**Explanation:**
The 10 incremovable subarrays are: `[1]`, `[2]`, `[3]`, `[4]`, `[1,2]`, `[2,3]`, `[3,4]`, `[1,2,3]`, `[2,3,4]`, and `[1,2,3,4]`, because on removing any one of these subarrays, `nums` becomes strictly increasing.

---

## Example 2:

**Input:**

```plaintext
nums = [6,5,7,8]
```

**Output:**

```plaintext
7
```

**Explanation:**
The 7 incremovable subarrays are: `[5]`, `[6]`, `[5,7]`, `[6,5]`, `[5,7,8]`, `[6,5,7]`, and `[6,5,7,8]`.

---

## Example 3:

**Input:**

```plaintext
nums = [8,7,6,6]
```

**Output:**

```plaintext
3
```

**Explanation:**
The 3 incremovable subarrays are: `[8,7,6]`, `[7,6,6]`, and `[8,7,6,6]`.

---

## Constraints:

- `1 <= nums.length <= 50`
- `1 <= nums[i] <= 50`

---

## Complexity Analysis:

1. **Time Complexity:**

   - \(O(n^3)\), where \(n\) is the size of the array `nums`.
   - The algorithm involves nested loops for window size, start indices, and element traversal.

2. **Space Complexity:**
   - \(O(1)\), as no additional space proportional to input size is used.

---
