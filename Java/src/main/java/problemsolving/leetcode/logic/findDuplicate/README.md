# 287. Find the Duplicate Number

Given an array of integers nums containing `n + 1` integers where 
each integer is in the range `[1, n]` inclusive.

There is only one duplicate number in nums, return this duplicate number.

Follow-ups:

1. How can we prove that at least one duplicate number must exist in nums? 
1. Can you solve the problem without modifying the array nums?
1. Can you solve the problem using only constant, `O(1)` extra space?
1. Can you solve the problem with runtime complexity less than `O(n2)`?


#### Example 1:
```
Input: nums = [1,3,4,2,2]
Output: 2
```

#### Example 2:
```
Input: nums = [3,1,3,4,2]
Output: 3
```

#### Example 3:
```
Input: nums = [1,1]
Output: 1
```

#### Example 4:
```
Input: nums = [1,1,2]
Output: 1
```


## Solution 
1. For every number `k`, add `n` to number at `k + 1`th index.  
1. Find the max after step 1
1. Maximum number's index is the result
1. Reset all the elements in array by taking `modulo n`

#### Example 1:
1. Input: `[1,3,4,2,2]`
1. `n` is 5
1. For each number `i` in array add `n` to `n[i - 1]` 
    1. `i = 0`: `n[n[0] - 1] += 5` => `n[1 - 1] += 5` => `n[0] += 5` 
    1. `i = 1`: `n[n[1] - 1] += 5` => `n[3 - 1] += 5` => `n[2] += 5`
    1. `i = 2`: `n[n[2] - 1] += 5` => `n[4 - 1] += 5` => `n[3] += 5`
    1. `i = 3`: `n[n[3] - 1] += 5` => `n[2 - 1] += 5` => `n[1] += 5`
    1. `i = 4`: `n[n[4] - 1] += 5` => `n[2 - 1] += 5` => `n[1] += 5`
1. Resulting array would be 
  `[6,13,9,7,2]`
1. Maximum is `5` and it's index is the answer
1. Reset the array using `nums[i] = nums[i] % n`. This works as maximum element is `n`. 
