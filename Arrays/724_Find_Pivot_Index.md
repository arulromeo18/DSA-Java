# 724. Find Pivot Index

**Difficulty:** Easy  
**Topic:** Arrays, Prefix Sum

---

## Problem

Given an integer array `nums`, find the **pivot index**.

The pivot index is the index where:

- Sum of all elements to the left equals
- Sum of all elements to the right.

If no pivot index exists, return `-1`.

---

## Intuition

Instead of calculating the left and right sums for every index separately, we can calculate:

- Total sum of the array.
- Running left sum while traversing.

Using these two values, the right sum can be calculated without another loop.

```
Right Sum = Total Sum - Left Sum - Current Element
```

If

```
Left Sum == Right Sum
```

then the current index is the pivot index.

---

## Approach

1. Calculate the total sum of the array.
2. Initialize `leftSum = 0`.
3. Traverse the array.
4. Calculate:

```
rightSum = totalSum - leftSum - nums[i]
```

5. If

```
leftSum == rightSum
```

return the current index.

6. Otherwise,

```
leftSum += nums[i]
```

7. If no pivot exists, return `-1`.

---

## Dry Run

### Input

```text
nums = [1,7,3,6,5,6]
```

Total Sum

```text
28
```

Initially

```text
leftSum = 0
```

### Index 0

```text
Current = 1

rightSum = 28 - 0 - 1 = 27

0 ≠ 27
```

Update

```text
leftSum = 1
```

---

### Index 1

```text
Current = 7

rightSum = 28 - 1 - 7 = 20

1 ≠ 20
```

Update

```text
leftSum = 8
```

---

### Index 2

```text
Current = 3

rightSum = 28 - 8 - 3 = 17

8 ≠ 17
```

Update

```text
leftSum = 11
```

---

### Index 3

```text
Current = 6

rightSum = 28 - 11 - 6 = 11

leftSum = rightSum ✅
```

Return

```text
3
```

---

## Complexity Analysis

**Time Complexity:** `O(n)`

- One traversal to calculate the total sum.
- One traversal to find the pivot.

Overall: **O(n)**

---

**Space Complexity:** `O(1)`

- Only variables are used.

---

## Key Takeaways

- Prefix Sum helps avoid recalculating sums repeatedly.
- Right sum can be calculated using:

```
rightSum = totalSum - leftSum - nums[i]
```

- No extra arrays are required.

---

## Common Mistakes

- Updating `leftSum` before checking the pivot.
- Forgetting to subtract the current element while calculating the right sum.
- Using nested loops, resulting in `O(n²)`.

---

## Interview Notes

This is a classic Prefix Sum problem.

Whenever a question involves comparing sums on the left and right of an index, think of using a running sum instead of recalculating sums repeatedly.

---

## Solution

Refer to **724_Find_Pivot_Index.java** for the complete Java implementation.
