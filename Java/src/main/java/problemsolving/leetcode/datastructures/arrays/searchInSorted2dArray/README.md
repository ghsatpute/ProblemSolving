# 74. Search a 2D Matrix

Write an efficient algorithm that searches for a value in an m x n matrix. 
This matrix has the following properties:

* Integers in each row are sorted from left to right.
* The first integer of each row is greater than the 
  last integer of the previous row.
  
### Example 1:
![Example](Example1.jpg)
```
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true    
```

### Example 2:
![Example](Example2.jpg)
```
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
```

## Constraints:

* `m == matrix.length`
* `n == matrix[i].length`
* `1 <= m, n <= 100`
* `-10^4 <= matrix[i][j], target <= 10^4`

## Solution
1. If target is less than the first column of first row, then it won't be 
 present in 2D array hence return `false`
1. If target is greater than the last column of last row, then it won't be 
 present in 2D array hence return `false`
1. If both of above conditions are false, it means if `target` is present it
  has to be present in 2D array limits. 
   1. First find the row in which element could be present by binary 
    searching the first elements of each row. 
   2. After finding out the row, binary search the row to see if element is 
     present.
 