# 1464. Maximum Product of Two Elements in an Array

**Difficulty:** Easy  
**Topic:** Arrays

---

## Problem

Given an integer array `nums`, choose two different indices `i` and `j`.

Return the maximum value of:

```
(nums[i] - 1) * (nums[j] - 1)
```

---

## Intuition

To maximize the product, we need the **two largest numbers** in the array.

Instead of sorting the array, we can find the largest and second largest elements in a single traversal.

---

## Approach

1. Maintain two variables:
   - `first` → Largest element
   - `second` → Second largest element

2. Traverse the array once.
3. Update `first` and `second` whenever a larger element is found.
4. Return:

```
(first - 1) * (second - 1)
```

---

## Dry Run

### Input

```text
nums = [3,4,5,2]
```

Initially

```text
first = -∞
second = -∞
```

### Iteration 1

```text
Current = 3

first = 3
second = -∞
```

### Iteration 2

```text
Current = 4

second = 3
first = 4
```

### Iteration 3

```text
Current = 5

second = 4
first = 5
```

### Iteration 4

```text
Current = 2

No update
```

Now,

```text
(first - 1) × (second - 1)

= (5 - 1) × (4 - 1)

= 4 × 3

= 12
```

### Output

```text
12
```

---

## Complexity Analysis

**Time Complexity:** `O(n)`

- The array is traversed only once.

**Space Complexity:** `O(1)`

- Only two variables are used.

---

## Key Takeaways

- No sorting is required.
- A single traversal is enough to find the two largest elements.
- This is more efficient than sorting the array.

---

## Common Mistakes

- Sorting the array unnecessarily (`O(n log n)`).
- Forgetting to update the second largest element when a new maximum is found.
- Using the same element twice.

---

## Interview Notes

- Whenever a problem asks for the largest or second largest element, think about solving it in one pass before considering sorting.
- This is a common interview optimization.

---

## Solution

Refer to **1464_Maximum_Product_of_Two_Elements_in_an_Array.java** for the complete Java implementation.
