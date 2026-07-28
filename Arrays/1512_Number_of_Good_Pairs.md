# 1512. Number of Good Pairs

**Difficulty:** Easy  
**Topic:** Arrays, HashMap

---

## Problem

Given an array of integers `nums`, return the number of **good pairs**.

A pair `(i, j)` is considered good if:

- `nums[i] == nums[j]`
- `i < j`

---

## Intuition

For every element, we need to know how many times it has already appeared.

If a number has appeared `k` times before, then the current occurrence forms `k` new good pairs.

Example:

```text
nums = [1,1,1]
```

- First `1` → 0 pairs
- Second `1` → 1 pair
- Third `1` → 2 pairs

Total = **3**

---

## Approach (HashMap)

1. Create a `HashMap<Integer, Integer>` to store the frequency of each number.
2. Traverse the array.
3. If the current number has appeared before, add its frequency to the answer.
4. Increase its frequency in the map.
5. Return the total number of good pairs.

---

## Dry Run

### Input

```text
nums = [1,2,3,1,1,3]
```

Initially

```text
count = 0
map = {}
```

### Iteration 1

```text
Current = 1

map = {1=1}
count = 0
```

### Iteration 2

```text
Current = 2

map = {1=1,2=1}
count = 0
```

### Iteration 3

```text
Current = 3

map = {1=1,2=1,3=1}
count = 0
```

### Iteration 4

```text
Current = 1

Already seen once

count = count + 1 = 1

map = {1=2,2=1,3=1}
```

### Iteration 5

```text
Current = 1

Already seen twice

count = count + 2 = 3

map = {1=3,2=1,3=1}
```

### Iteration 6

```text
Current = 3

Already seen once

count = count + 1 = 4

map = {1=3,2=1,3=2}
```

### Output

```text
4
```

---

## Java Solution

```java
class Solution {
    public int numIdenticalPairs(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {

            if (map.containsKey(num)) {
                count += map.get(num);
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}
```

---

## Complexity Analysis

**Time Complexity:** `O(n)`

- The array is traversed only once.

**Space Complexity:** `O(n)`

- In the worst case, every element is unique.

---

## Key Takeaways

- HashMap is used to store the frequency of each number.
- If a number has appeared `k` times, the current occurrence forms `k` new good pairs.
- This avoids using nested loops.

---

## Common Mistakes

- Using two nested loops, resulting in `O(n²)` time complexity.
- Updating the frequency before adding it to the answer.
- Forgetting that `i` must be less than `j`.

---

## Interview Notes

- This is a classic frequency-counting problem.
- Whenever a question asks you to count duplicates efficiently, consider using a `HashMap`.
- This solution improves the brute-force `O(n²)` approach to `O(n)`.
