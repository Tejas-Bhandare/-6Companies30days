# Find the Winner of the Circular Game

## Problem Description

There are `n` friends that are playing a game. The friends are sitting in a circle and are numbered from 1 to `n` in clockwise order. More formally, moving clockwise from the ith friend brings you to the (i+1)th friend for 1 <= i < n, and moving clockwise from the nth friend brings you to the 1st friend.

### The rules of the game are as follows:

1. Start at the 1st friend.
2. Count the next `k` friends in the clockwise direction including the friend you started at. The counting wraps around the circle and may count some friends more than once.
3. The last friend you counted leaves the circle and loses the game.
4. If there is still more than one friend in the circle, go back to step 2 starting from the friend immediately clockwise of the friend who just lost and repeat.
5. Else, the last friend in the circle wins the game.

---

## Example 1:

**Input:**

````java
n = 5, k = 2

**Output:**

```plaintext
3
````

**Explanation:**
Here are the steps of the game:

1. Start at friend 1.
2. Count 2 friends clockwise, which are friends 1 and 2.
3. Friend 2 leaves the circle. Next start is friend 3.
4. Count 2 friends clockwise, which are friends 3 and 4.
5. Friend 4 leaves the circle. Next start is friend 5.
6. Count 2 friends clockwise, which are friends 5 and 1.
7. Friend 1 leaves the circle. Next start is friend 3.
8. Count 2 friends clockwise, which are friends 3 and 5.
9. Friend 5 leaves the circle. Only friend 3 is left, so they are the winner.

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

1. Create a circular linked list of n friends, where each node represents a friend in the game.
2. Traverse the list and remove the friend after counting k friends clockwise. The counting wraps around, ensuring we always remain in the circular structure.
3. Continue the process until only one friend remains, who will be the winner.

---

## Complexity Analysis:

1. **Time Complexity:**

   - Adding nodes (friends) to the circular linked list takes 𝑂(𝑛).

   - Finding the winner involves removing n-1 friends from the list. For each removal, we traverse the list which takes 𝑂(𝑛) time. Thus, the time complexity for this step is 𝑂(𝑛^2) in the worst case.

2. **Space Complexity:**
   - We are using a linked list to represent the circle, which takes 𝑂(𝑛) space.

---
```
