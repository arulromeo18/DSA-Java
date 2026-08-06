# 238. Product of Array Except Self

## Problem

Given an integer array `nums`, return an array `answer` such that:

```text
answer[i] = product of all elements of nums except nums[i]
```

The solution must run in `O(n)` time and should not use division.

---

## Approach: Prefix Product + Suffix Product

For every index, we need:

```text
product of elements on the left × product of elements on the right
```

We can calculate these two products using two passes.

### Step 1: Store Prefix Products

The `ans` array stores the product of all elements to the **left** of each index.

For example:

```text
nums = [1,2,3,4]
```

After the first pass:

```text
ans = [1,1,2,6]
```

Explanation:

```text
ans[0] = 1
ans[1] = 1
ans[2] = 1 × 2 = 2
ans[3] = 1 × 2 × 3 = 6
```

The current element is not included.

---

### Step 2: Multiply by Suffix Product

Start from the right side.

Maintain:

```text
suffix = 1
```

At every index:

```text
ans[i] = ans[i] × suffix
```

Then update:

```text
suffix = suffix × nums[i]
```

This adds the product of all elements to the right.

---

## Dry Run

Input:

```text
nums = [1,2,3,4]
```

### Prefix Pass

Initially:

```text
ans = [1,0,0,0]
```

After processing:

```text
ans = [1,1,2,6]
```

These values represent the products on the left.

---

### Suffix Pass

Start:

```text
suffix = 1
```

At index `3`:

```text
ans[3] = 6 × 1 = 6
suffix = 1 × 4 = 4
```

At index `2`:

```text
ans[2] = 2 × 4 = 8
suffix = 4 × 3 = 12
```

At index `1`:

```text
ans[1] = 1 × 12 = 12
suffix = 12 × 2 = 24
```

At index `0`:

```text
ans[0] = 1 × 24 = 24
```

Final result:

```text
[24,12,8,6]
```

---

## Why This Works

For each index:

```text
answer[i] = left product × right product
```

The first pass calculates the left product.

The second pass calculates the right product and multiplies it with the stored left product.

Therefore, no extra prefix or suffix array is required.

---

## Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(1)` extra space, excluding the output array.

---

## Java Code

Refer to **238_Product_of_Array_Except_Self.java** for the complete Java implementation.
