# 209. Minimum Size Subarray Sum

**Difficulty:** Medium  
**Topic:** Arrays, Sliding Window

---

## Problem

Given an array of positive integers `nums` and a positive integer `target`, return the **minimal length** of a subarray whose sum is greater than or equal to `target`.

If there is no such subarray, return `0`.

---

## Intuition

Since all elements are **positive**, increasing the window size always increases (or keeps) the sum.

We can use a **Sliding Window**:

- Expand the window by moving the right pointer.
- Once the sum becomes greater than or equal to the target, shrink the window from the left to find the minimum length.
- Continue until the end of the array.

---

## Approach

1. Initialize two pointers:
   - `left = 0`
   - `sum = 0`
2. Traverse the array using the right pointer.
3. Add the current element to the window sum.
4. While the sum is greater than or equal to the target:
   - Update the minimum length.
   - Remove the leftmost element from the sum.
   - Move the left pointer forward.
5. If no valid subarray exists, return `0`.

---

## Dry Run

### Input

```text
target = 7

nums = [2,3,1,2,4,3]
```

Initially

```text
left = 0

sum = 0

minLength = ∞
```

### right = 0

```text
sum = 2
```

Less than target.

---

### right = 1

```text
sum = 5
```

Less than target.

---

### right = 2

```text
sum = 6
```

Less than target.

---

### right = 3

```text
sum = 8
```

Now

```text
sum >= target
```

Window

```text
[2,3,1,2]
```

Length

```text
4
```

Update

```text
minLength = 4
```

Shrink

```text
sum = 6

left = 1
```

---

### right = 4

```text
sum = 10
```

Window

```text
[3,1,2,4]
```

Length

```text
4
```

Shrink

```text
sum = 7

left = 2
```

Still valid

Window

```text
[1,2,4]
```

Length

```text
3
```

Update

```text
minLength = 3
```

Shrink

```text
sum = 6

left = 3
```

---

### right = 5

```text
sum = 9
```

Window

```text
[2,4,3]
```

Length

```text
3
```

Shrink

```text
sum = 7

left = 4
```

Still valid

Window

```text
[4,3]
```

Length

```text
2
```

Update

```text
minLength = 2
```

Shrink

```text
sum = 3

left = 5
```

Traversal completed.

Answer

```text
2
```

---

## Complexity Analysis

**Time Complexity:** `O(n)`

- Each element enters and leaves the window at most once.

---

**Space Complexity:** `O(1)`

- Only a few variables are used.

---

## Key Takeaways

- Sliding Window works because all numbers are positive.
- Expand the window until the target is reached.
- Shrink the window to find the smallest valid subarray.
- Each element is processed at most twice.

---

## Common Mistakes

- Trying to use Sliding Window when negative numbers are present.
- Forgetting to update the minimum length before shrinking the window.
- Using nested loops, resulting in `O(n²)`.

---

## Interview Notes

Whenever a problem asks for:

- Smallest/Largest subarray
- Positive integers
- Sum-based conditions

Sliding Window should be one of your first considerations.

---

## Solution

Refer to **209_Minimum_Size_Subarray_Sum.java** for the complete Java implementation.
