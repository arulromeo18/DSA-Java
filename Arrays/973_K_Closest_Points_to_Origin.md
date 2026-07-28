# 973. K Closest Points to Origin

**Difficulty:** Medium  
**Topic:** Arrays, Sorting

---

## Problem

Given an array of points where each point is represented as `[x, y]` and an integer `k`, return the `k` closest points to the origin `(0,0)`.

The distance between a point `(x, y)` and the origin is:

```
√(x² + y²)
```

Since the square root is common for all points, we compare using:

```
x² + y²
```

---

## Intuition

The point with the smaller value of:

```
x² + y²
```

is closer to the origin.

Instead of calculating the square root, compare only the squared distances.

Sort the points according to their squared distance and return the first `k` points.

---

## Approach

1. Sort the array using a custom comparator.
2. Calculate each point's squared distance:

```
distance = x² + y²
```

3. Points with smaller distances come first.
4. Copy the first `k` points into the answer array.
5. Return the answer.

---

## Dry Run

### Input

```text
points = [[3,3],[5,-1],[-2,4]]
k = 2
```

Calculate distances

```text
(3,3)

= 3² + 3²

= 9 + 9

= 18
```

```text
(5,-1)

= 5² + (-1)²

= 25 + 1

= 26
```

```text
(-2,4)

= (-2)² + 4²

= 4 + 16

= 20
```

After sorting

```text
[[3,3],[-2,4],[5,-1]]
```

Take first 2 points

```text
[[3,3],[-2,4]]
```

---

## Complexity Analysis

**Time Complexity:** `O(n log n)`

- Sorting dominates the running time.

---

**Space Complexity:** `O(1)`

- Ignoring the output array.

---

## Key Takeaways

- Distance comparison does not require the square root.
- Comparing squared distances gives the same ordering.
- Custom comparators can be used with `Arrays.sort()`.

---

## Common Mistakes

- Calculating square roots unnecessarily.
- Sorting in descending order instead of ascending order.
- Forgetting to return only the first `k` points.

---

## Interview Notes

This problem introduces custom sorting using a comparator.

An optimized solution using a **Priority Queue (Heap)** can reduce the complexity to:

```
O(n log k)
```

which is preferred when `k` is much smaller than `n`.

---

## Solution

Refer to **973_K_Closest_Points_to_Origin.java** for the complete Java implementation.
