# 219. Contains Duplicate II

**Difficulty:** Easy  
**Topic:** Arrays, HashMap

---

## Problem

Given an integer array `nums` and an integer `k`, return `true` if there are two distinct indices `i` and `j` such that:

- `nums[i] == nums[j]`
- `|i - j| <= k`

Otherwise, return `false`.

---

## Intuition

We need to know the last position where each number appeared.

While traversing the array:

- If the current number has appeared before,
- Check the distance between the current index and its previous index.
- If the distance is less than or equal to `k`, return `true`.

Otherwise, update its latest index.

---

## Approach

1. Create a `HashMap` to store each number and its latest index.
2. Traverse the array.
3. If the current number already exists:
   - Calculate the distance between the current index and the previous index.
   - If the distance is less than or equal to `k`, return `true`.
4. Update the current index in the HashMap.
5. If no such pair exists, return `false`.

---

## Dry Run

### Input

```text
nums = [1,2,3,1]
k = 3
```

Initially

```text
map = {}
```

### Index 0

```text
Current = 1

map = {1=0}
```

---

### Index 1

```text
Current = 2

map = {1=0,2=1}
```

---

### Index 2

```text
Current = 3

map = {1=0,2=1,3=2}
```

---

### Index 3

```text
Current = 1

Previous Index = 0

Distance = 3 - 0 = 3

3 <= 3 ✅
```

Return

```text
true
```

---

### Another Example

```text
nums = [1,2,3,1,2,3]
k = 2
```

Distances

```text
1 → 3

2 → 3

3 → 3
```

Since

```text
3 > 2
```

Return

```text
false
```

---

## Complexity Analysis

**Time Complexity:** `O(n)`

- Each element is processed once.

---

**Space Complexity:** `O(n)`

- HashMap stores the latest index of each unique element.

---

## Key Takeaways

- HashMap stores the **latest occurrence** of every element.
- Only the previous occurrence is needed.
- No nested loops are required.

---

## Common Mistakes

- Not updating the latest index after checking.
- Using nested loops (`O(n²)`).
- Forgetting that the distance should be:

```
currentIndex - previousIndex
```

---

## Interview Notes

Whenever a problem asks:

- Duplicate elements
- Distance between indices

Think of using a **HashMap** to store the latest index of each element.

---

## Solution

Refer to **219_Contains_Duplicate_II.java** for the complete Java implementation.
