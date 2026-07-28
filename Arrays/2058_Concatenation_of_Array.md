# 1929. Concatenation of Array

**Difficulty:** Easy  
**Topic:** Arrays

---

## Problem

Given an integer array `nums` of length `n`, return an array `ans` of length `2n` such that:

- `ans[i] = nums[i]`
- `ans[i + n] = nums[i]`

In other words, the output array contains the original array repeated twice.

---

## Intuition

The new array should contain two copies of the original array.

- The first half stores the original elements.
- The second half stores the same elements again.

---

## Approach

1. Create a new array of size `2 * nums.length`.
2. Traverse the original array once.
3. Store each element in:
   - `ans[i]`
   - `ans[i + nums.length]`
4. Return the new array.

---

## Dry Run

### Input

```text
nums = [1,2,1]
```

Create a new array:

```text
ans = [_, _, _, _, _, _]
```

### Iteration 1

```text
i = 0

ans[0] = 1
ans[3] = 1

ans = [1, _, _, 1, _, _]
```

### Iteration 2

```text
i = 1

ans[1] = 2
ans[4] = 2

ans = [1, 2, _, 1, 2, _]
```

### Iteration 3

```text
i = 2

ans[2] = 1
ans[5] = 1

ans = [1, 2, 1, 1, 2, 1]
```

### Output

```text
[1,2,1,1,2,1]
```

---

## Java Solution

## Solution

Refer to **2058_Concatenation_of_Array.java** for the complete Java implementation.
---

## Complexity Analysis

**Time Complexity:** `O(n)`

- The array is traversed only once.

**Space Complexity:** `O(n)`

- A new array of size `2n` is created.

---

## Key Takeaways

- Learn how to create a new array with a different size.
- Practice array indexing using `i + nums.length`.
- This is a simple simulation problem with no advanced algorithm.

---

## Common Mistakes

- Creating an array of size `n` instead of `2n`.
- Using `i + 1` instead of `i + nums.length`.
- Forgetting to return the new array.

---

## Interview Notes

- This is a basic array manipulation problem.
- The expected solution uses a single traversal.
- It mainly tests understanding of array indexing and creating a new array.
