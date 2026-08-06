# 167. Two Sum II - Input Array Is Sorted

## Problem

Given a **1-indexed** array of integers `numbers` that is already sorted in non-decreasing order, find two numbers such that they add up to a specific `target`.

Return the indices of the two numbers.

The indices must be returned as:

```text
[index1, index2]
```

where:

```text
1 <= index1 < index2 <= numbers.length
```

The problem guarantees that exactly one solution exists.

---

## Approach: Two Pointers

Because the array is already sorted, we can use two pointers:

- `start` → points to the first element.
- `end` → points to the last element.

Initially:

```text
start = 0
end = numbers.length - 1
```

Calculate:

```text
sum = numbers[start] + numbers[end]
```

### Case 1: `sum == target`

We found the required pair.

Return:

```java
[start + 1, end + 1]
```

The `+1` is required because the problem uses **1-based indexing**.

---

### Case 2: `sum < target`

The sum is too small.

Since the array is sorted, move `start` to the right:

```java
start++;
```

This increases the value and therefore increases the sum.

---

### Case 3: `sum > target`

The sum is too large.

Move `end` to the left:

```java
end--;
```

This decreases the value and therefore decreases the sum.

---

## Dry Run

Input:

```text
numbers = [2,7,11,15]
target = 9
```

Initially:

```text
start = 0
end = 3

2  7  11  15
^           ^
```

Calculate:

```text
2 + 15 = 17
```

`17 > 9`, so move `end`:

```text
start = 0
end = 2

2  7  11  15
^       ^
```

Calculate:

```text
2 + 11 = 13
```

`13 > 9`, so move `end` again:

```text
start = 0
end = 1

2  7  11  15
^   ^
```

Calculate:

```text
2 + 7 = 9
```

The sum equals the target.

Return:

```text
[1,2]
```

---

## Why Two Pointers Work

The array is sorted.

Therefore:

- Moving `start` right makes the sum larger.
- Moving `end` left makes the sum smaller.

This allows us to eliminate possibilities without checking every pair.

---

## Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

Only two pointer variables are used, so the extra space is constant.

---

## Java Code

Refer to **167_Two_Sum_II_Input_Array_Is_Sorted.java** for the complete Java implementation.
