# 268. Missing Number

**Difficulty:** Easy  
**Topic:** Arrays

---

## Problem

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the only number in the range that is missing from the array.

---

## Intuition

The numbers are expected to be from `0` to `n`.

If we store all the numbers in a `HashSet`, we can easily check which number from `0` to `n` is missing.

---

## Approach (HashSet)

1. Create a `HashSet`.
2. Insert every element of the array into the set.
3. Traverse from `0` to `n`.
4. The first number not present in the set is the missing number.
5. Return that number.

---

## Dry Run

### Input

```text
nums = [3,0,1]
```

Create a HashSet

```text
set = {3,0,1}
```

Check numbers from `0` to `3`

```text
0 → Present

1 → Present

2 → Missing ✅
```

Return

```text
2
```

---

### Another Example

```text
nums = [0,1]
```

HashSet

```text
{0,1}
```

Check

```text
0 → Present

1 → Present

2 → Missing
```

Return

```text
2
```

---

## Complexity Analysis

**Time Complexity:** `O(n)`

- One traversal to insert into the HashSet.
- One traversal to find the missing number.

Overall: **O(n)**

---

**Space Complexity:** `O(n)`

- Extra space is used for the HashSet.

---

## Key Takeaways

- HashSet provides `O(1)` average lookup time.
- Easy to understand and implement.
- Good solution when extra space is allowed.

---

## Common Mistakes

- Traversing only until `n-1` instead of `n`.
- Forgetting that the missing number can be `n`.
- Using an array instead of a HashSet without proper initialization.

---

## Better Approaches

This problem can also be solved using:

- Sum Formula (`O(1)` Space)
- XOR (`O(1)` Space)

These approaches are preferred in interviews because they use constant extra space.

---

## Interview Notes

If the interviewer asks for an optimized solution after the HashSet approach, move to:

- Sum Formula
- XOR Technique

---

## Solution

Refer to **268_Missing_Number.java** for the complete Java implementation.
