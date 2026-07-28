# 75. Sort Colors

## Problem
Given an array `nums` containing only `0`, `1`, and `2`, sort the array in-place without using the library sort function.

- `0` → Red
- `1` → White
- `2` → Blue

---

## Approach: Dutch National Flag Algorithm

We maintain three pointers:

- `low` → Position where the next `0` should be placed.
- `mid` → Current element being processed.
- `high` → Position where the next `2` should be placed.

Initially:

```
low = 0
mid = 0
high = n - 1
```

### Rules

### Case 1: `nums[mid] == 0`

Swap `nums[low]` and `nums[mid]`.

Then move both pointers.

```java
low++;
mid++;
```

Reason:
- The `0` is now in its correct position.
- Everything before `low` is already sorted.

---

### Case 2: `nums[mid] == 1`

Just move `mid`.

```java
mid++;
```

Reason:
- `1` belongs in the middle.
- No swapping is required.

---

### Case 3: `nums[mid] == 2`

Swap `nums[mid]` and `nums[high]`.

```java
high--;
```

Do **not** increment `mid`.

Reason:
The element swapped from the `high` position has not been processed yet.
It could be `0`, `1`, or `2`, so it must be checked again.

---

## Dry Run

Input:

```
[2,0,2,1,1,0]
```

```
low=0  mid=0  high=5

2 0 2 1 1 0
^         ^
```

Swap `mid` and `high`

```
0 0 2 1 1 2

low=0
mid=0
high=4
```

Now `nums[mid]==0`

Swap `low` and `mid`

```
0 0 2 1 1 2

low=1
mid=1
```

Again `nums[mid]==0`

```
0 0 2 1 1 2

low=2
mid=2
```

`nums[mid]==2`

Swap with `high`

```
0 0 1 1 2 2

high=3
mid=2
```

`nums[mid]==1`

```
mid=3
```

Again `nums[mid]==1`

```
mid=4
```

Now `mid > high`.

Final array:

```
[0,0,1,1,2,2]
```

---

## Java Code

## Solution

Refer to **75_Sort_Colors.java** for the complete Java implementation.

```
