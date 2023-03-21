# 46. Permutations
Given an array `nums` of distinct integers, return all the possible
permutations. You can return the answer in **any order**.

### Example 1
```
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
```

### Example 2
```
Input: nums = [0,1]
Output: [[0,1],[1,0]]
```

### Example 3
```
Input: nums = [1]
Output: [[1]]
```

## Constraints:

* 1 <= nums.length <= 6
* -10 <= nums[i] <= 10
* All the integers of nums are unique.

# Solution Tracing
This article helped me
https://leetcode.com/problems/permutations/solutions/685868/dfs-backtracking-python-java-javascript-picture/
```
nums = [1, 2, 3]
used = [0, 0, 0]
path = []
Solutions = [[]]

Iteration 0: 
    i = 0: 
        nums.length == path.size() => false 
        used = [1, 0, 0]
        paths = [1]
            permute call 
            nums.length == path.size() => false
            i = 0: 
                used[i] is true
            i = 1
                used = [1, 1, 0]
                paths = [1, 2]
                permute call 
                    nums.length == path.size() => false 
                    i = 0
                        used[i] is true
                    i = 1
                        used[i] is true
                    i = 2: 
                        used[1, 1, 1]
                        paths = [1, 2, 3]
                        permute call
                            nums.length == path.size() => true
                            add paths to solution and return 
                            return solutions = [[1, 2, 3]]
                        used = [1, 1, 0]   // Last set to zero again 
                        paths = [1, 2]      // Removed last element
                    return solutions = [[1, 2, 3]]
                used = [1, 0, 0]
                paths = [1]
            i = 2
                used [1, 0, 1]
                paths = [1, 3]
                permute call 
                    nums.length == path.size() => false 
                    i = 0: 
                        used[i] is true
                    i = 1: 
                        used = [1, 1, 1]
                        paths = [1, 3, 2]
                        permute call
                            nums.length == path.size() => true
                            add paths to solution and return 
                            return solutions = [[1, 2, 3], [1, 3, 2]]
                        used = [1, 0, 1]
                        paths = [1, 3]
                    i = 2: 
                        used[i] is true
                return solutions = [[1, 2, 3], [1, 3, 2]] 
           return solutions = [[1, 2, 3], [1, 3, 2]]
        used = [0, 0, 0]
        paths = []
    i = 2 
        nums.length == path.size() => false 
        used = [0, 1, 0]
        paths = [2]
            ...
```