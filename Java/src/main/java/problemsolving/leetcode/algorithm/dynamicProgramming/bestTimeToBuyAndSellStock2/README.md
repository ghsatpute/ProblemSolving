# 122. Best Time to Buy and Sell Stock II

Say you have an array `prices` for which the `i`th element is the price of a
 given stock on day `i`.

Design an algorithm to find the maximum profit. You may complete as many
 transactions as you like (i.e., buy one and sell one share of the stock
  multiple times).

**Note**: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

#### Example 1:

**Input**: `[7,1,5,3,6,4]`

**Output**: `7`

**Explanation**: 

Buy on day 2 (price = 1) and sell on day 3 (price = 5),
 profit = 5-1 = 4.
 
 Then buy on day 4 (price = 3) and sell on day 5 (price = 6), 
 profit = 6-3 = 3.

#### Example 2:

**Input**: `[1,2,3,4,5]`
**Output**: `4`
**Explanation**: 

Buy on day 1 (price = 1) and sell on day 5 (price = 5), 
profit = 5-1 = 4.

Note that you cannot buy on day 1, buy on day 2 and sell them later, 
as you are engaging multiple transactions at the same time. 
You must sell before buying again.

#### Example 3:

**Input**: `[7,6,4,3,1]`
**Output**: `0`
**Explanation**: In this case, no transaction is done, i.e.
 max profit = 0.
 
 
## Solution
First solution is a brute force approach.  At each node you 
have three options, 
1. Buy
2. Sell 
3. Do nothing 

Note that, for first element there'll be no sell option. Similarly 
for last element there won't be buy option. 

This will have exponential time complexity of `3^N`. 

Second solution, tries optimising the first solution using dynamic 
programming. We save result of each state in memoization table. This
 will be more than `nlogn`. 
 
Third solution, just looks at last day's stock value and decides what 
to do. If the yesterday's price is less than today then add difference 
to profit. We repeat this for all elements from `i = 2 to n`.
 