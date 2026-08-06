# 525. Contiguous Array

## Problem

Given a binary array `nums`, return the maximum length of a contiguous subarray with an equal number of `0` and `1`.

---

## Approach: Prefix Balance + HashMap

Treat:

- `0` as `-1`
- `1` as `+1`

Maintain a `balance` while traversing the array.

If a subarray contains an equal number of `0` and `1`, its total balance will be `0`.

Instead of looking for a balance of `0` every time, store the **first index** where each balance occurs.

If the same balance appears again at index `i`, then the elements between the previous index and `i` have equal numbers of `0` and `1`.

### Why?

Suppose:

```text
balance at index a = 2
balance at index b = 2
```

The balance increased from `2` to `2`, meaning the changes between `a` and `b` cancel out.

Therefore, that subarray contains an equal number of `0` and `1`.

---

## Key Logic

Convert the values into balance changes:

```java
if (nums[i] == 0)
    balance--;
else
    balance++;
```

Store the first occurrence of each balance:

```java
map.put(0, -1);
```

The `-1` represents the position before the array starts.

When the same balance appears again:

```java
max = Math.max(max, i - map.get(balance));
```

Only store the balance's first occurrence:

```java
if (!map.containsKey(balance)) {
    map.put(balance, i);
}
```

This is important because the earliest occurrence gives the longest possible subarray.

---

## Dry Run

Input:

```text
[0,1,0,1]
```

Initial:

```text
balance = 0
map = {0 : -1}
max = 0
```

### Index 0

```text
nums[0] = 0
balance = -1
```

First occurrence:

```text
map = {0:-1, -1:0}
```

### Index 1

```text
nums[1] = 1
balance = 0
```

Balance `0` already exists at index `-1`.

Length:

```text
1 - (-1) = 2
```

So:

```text
max = 2
```

### Index 2

```text
nums[2] = 0
balance = -1
```

Balance `-1` already exists at index `0`.

Length:

```text
2 - 0 = 2
```

### Index 3

```text
nums[3] = 1
balance = 0
```

Balance `0` already exists at index `-1`.

Length:

```text
3 - (-1) = 4
```

Final answer:

```text
4
```

---

## Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(n)`

The HashMap can contain up to `n + 1` different balance values.

---

## Java Code

Refer to **525_Contiguous_Array.java** for the complete Java implementation.
