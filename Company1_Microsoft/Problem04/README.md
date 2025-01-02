# Random Point in Non-overlapping Rectangles

You are given an array of non-overlapping axis-aligned rectangles rects where:

rects[i] = [ai, bi, xi, yi]

(ai, bi) is the bottom-left corner point of the i-th rectangle.

(xi, yi) is the top-right corner point of the i-th rectangle.

Design an algorithm to pick a random integer point inside the space covered by one of the given rectangles. A point on the perimeter of a rectangle is included in the space covered by the rectangle. Any integer point inside the space covered by one of the given rectangles should be equally likely to be returned.

---

## Example 1:

**Input:**

```plaintext
["Solution", "pick", "pick", "pick", "pick", "pick"]
[[[[-2, -2, 1, 1], [2, 2, 4, 6]]], [], [], [], [], []]
```

**Output:**

```plaintext
[null, [1, -2], [1, -1], [-1, -2], [-2, -2], [0, 0]]
```

**Explanation:**
Solution solution = new Solution([[-2, -2, 1, 1], [2, 2, 4, 6]]);
solution.pick(); // return [1, -2]
solution.pick(); // return [1, -1]
solution.pick(); // return [-1, -2]
solution.pick(); // return [-2, -2]
solution.pick(); // return [0, 0]

---

## Constraints:

- `1 <= rects.length <= 100`
- `rects[i].length == 4`
- `10^9 <= ai < xi <= 10^9`
- `10^9 <= bi < yi <= 10^9`
- `xi - ai <= 2000`
- `yi - bi <= 2000`
- `All the rectangles do not overlap.`
- `At most 10^4 calls will be made to pick`

---

## Approach:

### Steps to Solve:

1. Precompute Total Points:
   Compute the total number of points for all rectangles. This helps in determining the probabilities of picking points from each rectangle.
2. Random Rectangle Selection:
   Use a cumulative probability approach to randomly select a rectangle based on its size.
3. Random Point Selection:
   Once a rectangle is chosen, randomly select a point within its boundaries.
4. Uniform Distribution:
   Ensure that all points across all rectangles are selected uniformly.

---

## Complexity Analysis:

1. **Time Complexity:**

   - Constructor (Solution(int[][] rects)): 𝑂(𝑛), where 𝑛 is the number of rectangles. Each rectangle is processed once to calculate the total area.
   - Pick (pick()): 𝑂(𝑛), where n is the number of rectangles. The method scans all rectangles once to find the selected rectangle based on the cumulative area.

2. **Space Complexity:**
   - Constructor(Solution(int[][] rects)): O(n), as the rectangles are stored in the array rects, which takes 𝑂(𝑛) space.
   - Pick (pick()): 𝑂(1), as no additional space is used other than variables for calculations.

---
