# 121. Best Time to Buy and Sell Stock

## Problem

You are given an array `prices` where `prices[i]` is the price of a given stock on the `iᵗʰ` day.

You want to maximize your profit by choosing:

- One day to buy the stock.
- A different future day to sell the stock.

Return the maximum profit you can achieve.

If no profit is possible, return `0`.

---

## Approach

We traverse the array only once.

Maintain:

- `minPrice` → Lowest stock price seen so far.
- `maxProfit` → Maximum profit found so far.

For every price:

- Update the minimum buying price.
- Calculate the profit if we sell today.
- Update the maximum profit.

This ensures that the buying day always comes before the selling day.

---

## Algorithm

1. Initialize:

```java
minPrice = prices[0];
maxProfit = 0;
```

2. Traverse the array from index `1`.

3. If the current price is smaller than `minPrice`,
   update `minPrice`.

4. Otherwise,

```java
profit = prices[i] - minPrice;
```

5. Update

```java
maxProfit = Math.max(maxProfit, profit);
```

6. Return `maxProfit`.

---

## Dry Run

Input

```
[7,1,5,3,6,4]
```

Initially

```
minPrice = 7
maxProfit = 0
```

Day 2

```
Price = 1

minPrice = 1
```

Day 3

```
Price = 5

Profit = 5 - 1 = 4

maxProfit = 4
```

Day 4

```
Price = 3

Profit = 2

maxProfit = 4
```

Day 5

```
Price = 6

Profit = 5

maxProfit = 5
```

Day 6

```
Price = 4

Profit = 3

maxProfit = 5
```

Answer

```
5
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

Refer to **121_Best_Time_to_Buy_and_Sell_Stock.java** for the complete Java implementation.
