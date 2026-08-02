# 11. Container With Most Water

## Problem

You are given an integer array `height` of length `n`.

There are `n` vertical lines drawn such that the two endpoints of the `iᵗʰ` line are `(i, 0)` and `(i, height[i])`.

Find two lines that, together with the x-axis, form a container that can hold the maximum amount of water.

Return the maximum amount of water a container can store.

**Note:** You may not slant the container.

---

## Approach: Two Pointers

We use two pointers:

- `left` → Starts at the beginning of the array.
- `right` → Starts at the end of the array.

The width of the container is:

```java
right - left
```

The height of the container is the smaller of the two heights:

```java
Math.min(height[left], height[right])
```

Area is calculated as:

```java
width × minimum height
```

After calculating the current area:

- Update the maximum area.
- Move the pointer having the smaller height.

Reason:

Moving the taller line cannot increase the height of the container because the shorter line is the limiting factor. Therefore, we move the shorter line in hopes of finding a taller one.

---

## Algorithm

1. Initialize:

```java
left = 0;
right = n - 1;
maxArea = 0;
```

2. While `left < right`:

- Calculate:

```java
width = right - left;
height = Math.min(height[left], height[right]);
area = width * height;
```

- Update:

```java
maxArea = Math.max(maxArea, area);
```

- If

```java
height[left] < height[right]
```

move `left`.

Otherwise move `right`.

3. Return `maxArea`.

---

## Dry Run

Input

```
[1,8,6,2,5,4,8,3,7]
```

Initially

```
left = 0
right = 8
maxArea = 0
```

Area

```
Width = 8
Height = min(1,7) = 1

Area = 8
```

Move `left`.

```
left = 1
right = 8
```

Area

```
Width = 7
Height = min(8,7) = 7

Area = 49

maxArea = 49
```

Move `right`.

```
left = 1
right = 7
```

Area

```
Width = 6
Height = min(8,3) = 3

Area = 18
```

Continue the same process until both pointers meet.

Final Answer

```
49
```

---

## Time Complexity

```
O(n)
```

---

## Space Complexity

```
O(1)
```

---

## Java Code

## Solution

Refer to **11_Container_With_Most_Water.java** for the complete Java implementation.
