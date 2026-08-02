# 53. Maximum Subarray

## Problem

Given an integer array `nums`, find the contiguous subarray with the largest sum and return its sum.

A **subarray** is a contiguous (continuous) part of an array.

---

## Approach: Kadane's Algorithm

We traverse the array only once while maintaining:

- `currentSum` → Maximum subarray sum ending at the current index.
- `maxSum` → Maximum subarray sum found so far.

For every element:

- Either extend the previous subarray.
- Or start a new subarray from the current element.

We choose whichever gives the larger sum.

---

## Algorithm

1. Initialize:

```java
currentSum = nums[0];
maxSum = nums[0];
```

2. Traverse the array from index `1`.

3. Update the current sum.

```java
currentSum = Math.max(nums[i], currentSum + nums[i]);
```

This means:

- Start a new subarray from `nums[i]`, or
- Continue the previous subarray.

Choose the better one.

4. Update the maximum sum.

```java
maxSum = Math.max(maxSum, currentSum);
```

5. Return `maxSum`.

---

## Dry Run

Input

```
[-2,1,-3,4,-1,2,1,-5,4]
```

Initially

```
currentSum = -2
maxSum = -2
```

Index 1

```
currentSum = max(1, -2 + 1)
           = 1

maxSum = 1
```

Index 2

```
currentSum = max(-3, 1 + (-3))
           = -2

maxSum = 1
```

Index 3

```
currentSum = max(4, -2 + 4)
           = 4

maxSum = 4
```

Index 4

```
currentSum = max(-1, 4 + (-1))
           = 3

maxSum = 4
```

Index 5

```
currentSum = max(2, 3 + 2)
           = 5

maxSum = 5
```

Index 6

```
currentSum = max(1, 5 + 1)
           = 6

maxSum = 6
```

Index 7

```
currentSum = max(-5, 6 + (-5))
           = 1

maxSum = 6
```

Index 8

```
currentSum = max(4, 1 + 4)
           = 5

maxSum = 6
```

Final Answer

```
6
```

The maximum subarray is:

```
[4, -1, 2, 1]
```

---

## Time Complexity

```
O(n)
```

---

## Space Complexity

```
O(1)
```

---

## Java Code

## Solution

Refer to **53_Maximum_Subarray.java** for the complete Java implementation.
