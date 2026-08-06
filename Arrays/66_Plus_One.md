# 66. Plus One

## Problem

Given a large integer represented as an array of digits, increment the integer by one and return the resulting array of digits.

Each element contains a single digit.

The digits are arranged from the most significant digit to the least significant digit.

---

## Approach

Start from the last digit because adding `1` affects the number from the right side.

For every digit:

- If the digit is less than `9`, increment it by `1` and return the array.
- If the digit is `9`, change it to `0` and continue to the previous digit because a carry is generated.

If every digit is `9`, create a new array with one extra position and put `1` at the beginning.

For example:

[9,9,9]

becomes:

[1,0,0,0]

---

## Dry Run

### Example 1

Input:

[1,2,3]

Start from the last digit:

3 < 9

Increment:

3 → 4

Output:

[1,2,4]

---

### Example 2

Input:

[1,2,9]

Start from the last digit:

9 → 0

Continue to the previous digit:

2 < 9

Increment:

2 → 3

Output:

[1,3,0]

---

### Example 3

Input:

[9,9,9]

First digit from the right:

9 → 0

Second digit:

9 → 0

Third digit:

9 → 0

All digits were 9, so create a new array:

[1,0,0,0]

---

## Key Logic

The main logic is:

if the current digit is less than 9:

- increment it
- return the array immediately

If the current digit is 9:

- change it to 0
- continue to the previous digit

This handles the carry automatically.

---

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1) in the normal case
- If all digits are 9, an additional array of size n + 1 is created.

---

## Java Code

Refer to **66_Plus_One.java** for the complete Java implementation.
