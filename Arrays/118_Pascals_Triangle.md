# 118. Pascal's Triangle

## Problem

Given an integer `numRows`, return the first `numRows` of Pascal's triangle.

In Pascal's Triangle:

- The first and last element of every row is `1`.
- Every middle element is calculated by adding the two elements directly above it.

Example:

```text
        1
       1 1
      1 2 1
     1 3 3 1
    1 4 6 4 1
```

---

## Approach

Use a `List<List<Integer>>` to store the triangle.

For each row:

1. Create a new list for the current row.
2. Add `1` at the beginning and end of the row.
3. For middle elements, get the previous row.
4. Add the two values from the previous row:
   - `prev[j - 1]`
   - `prev[j]`
5. Add the completed row to the result.

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
List<Integer> prev = result.get(i - 1);
row.add(prev.get(j - 1) + prev.get(j));
```

For example, to calculate the `2` in:

```text
[1, 2, 1]
```

we use the previous row:

```text
[1, 1]
```

and calculate:

```text
1 + 1 = 2
```

---

## Dry Run

For:

```text
numRows = 5
```

### Row 1

```text
[1]
```

### Row 2

```text
[1, 1]
```

### Row 3

The middle element:

```text
1 + 1 = 2
```

Result:

```text
[1, 2, 1]
```

### Row 4

Middle elements:

```text
1 + 2 = 3
2 + 1 = 3
```

Result:

```text
[1, 3, 3, 1]
```

### Row 5

Middle elements:

```text
1 + 3 = 4
3 + 3 = 6
3 + 1 = 4
```

Result:

```text
[1, 4, 6, 4, 1]
```

Final result:

```text
[
    [1],
    [1, 1],
    [1, 2, 1],
    [1, 3, 3, 1],
    [1, 4, 6, 4, 1]
]
```

---

## Complexity

- Time Complexity: `O(numRows²)`
- Space Complexity: `O(numRows²)`

The space is `O(numRows²)` because the complete Pascal's Triangle is stored in the result.

---

## Java Code

Refer to **118_Pascals_Triangle.java** for the complete Java implementation.
