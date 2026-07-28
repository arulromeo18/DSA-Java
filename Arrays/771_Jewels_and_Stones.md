# 771. Jewels and Stones

**Difficulty:** Easy  
**Topic:** Arrays, HashSet

---

## Problem

You're given two strings:

- `jewels` represents the types of stones that are jewels.
- `stones` represents the stones you have.

Return the number of stones that are also jewels.

---

## Intuition

To quickly determine whether a stone is a jewel, we need fast lookups.

A `HashSet` provides an average lookup time of `O(1)`.

Store all jewels in a HashSet, then check every stone.

---

## Approach

1. Create a `HashSet<Character>`.
2. Insert every character from `jewels` into the set.
3. Traverse the `stones` string.
4. If the current stone exists in the HashSet, increment the count.
5. Return the count.

---

## Dry Run

### Input

```text
jewels = "aA"
stones = "aAAbbbb"
```

Initially

```text
set = {a, A}

count = 0
```

### Stone 1

```text
Current = 'a'

Found in set

count = 1
```

---

### Stone 2

```text
Current = 'A'

Found in set

count = 2
```

---

### Stone 3

```text
Current = 'A'

Found in set

count = 3
```

---

### Stone 4

```text
Current = 'b'

Not found
```

---

### Stone 5

```text
Current = 'b'

Not found
```

---

### Stone 6

```text
Current = 'b'

Not found
```

---

### Stone 7

```text
Current = 'b'

Not found
```

Final Answer

```text
3
```

---

## Complexity Analysis

**Time Complexity:** `O(n + m)`

- `n` = length of `jewels`
- `m` = length of `stones`

Each string is traversed once.

---

**Space Complexity:** `O(n)`

- The HashSet stores all jewel characters.

---

## Key Takeaways

- HashSet provides fast membership checking.
- Converting the jewel characters into a set avoids repeatedly searching the string.
- This is a common lookup optimization technique.

---

## Common Mistakes

- Using `String.contains()` for every stone, leading to slower performance.
- Forgetting that uppercase and lowercase letters are different characters.
- Not using a HashSet when fast lookups are required.

---

## Interview Notes

Whenever you need to repeatedly check whether an element exists in another collection, consider using a **HashSet** for efficient lookups.

---

## Solution

Refer to **771_Jewels_and_Stones.java** for the complete Java implementation.
