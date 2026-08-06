# 119. Pascal's Triangle II

## Problem

Given an integer `rowIndex`, return the `rowIndex`th row of Pascal's Triangle.

The row index is **0-indexed**.

For example:

```text
rowIndex = 0 → [1]
rowIndex = 1 → [1,1]
rowIndex = 2 → [1,2,1]
rowIndex = 3 → [1,3,3,1]
rowIndex = 4 → [1,4,6,4,1]
```

---

## Approach

Use the same logic as Pascal's Triangle.

For every row:

1. Create a new list.
2. The first and last elements are always `1`.
3. For the middle elements, use the previous row.
4. Add the two elements directly above the current position.
5. Continue until reaching `rowIndex`.
6. Return the required row.

---

## Key Logic

The first and last elements are always `1`.

```java
if (j == 0 || j == i) {
    row.add(1);
}
```

For the middle elements:

```java
List<Integer> prev = list.get(i - 1);
row.add(prev.get(j - 1) + prev.get(j));
```

The current row is built using the previous row.

---

## Dry Run

For:

```text
rowIndex = 3
```

### Row 0

```text
[1]
```

### Row 1

```text
[1,1]
```

### Row 2

```text
[1,2,1]
```

The middle element is:

```text
1 + 1 = 2
```

### Row 3

Using the previous row:

```text
[1,2,1]
```

Calculate:

```text
1 + 2 = 3
2 + 1 = 3
```

Therefore:

```text
[1,3,3,1]
```

The required row is:

```text
[1,3,3,1]
```

---

## Complexity

- Time Complexity: `O(rowIndex²)`
- Space Complexity: `O(rowIndex²)`

The complete triangle is stored in the list.

---

## Java Code

Refer to **119_Pascals_Triangle_II.java** for the complete Java implementation.
