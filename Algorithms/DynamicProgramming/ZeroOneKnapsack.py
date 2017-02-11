# @Author   : Ganesh Satpute
# @Email    : ghsatpute@gmail.com
# @Time     : 02 Feb 2017, 12:21 AM


#

# To test above function
val = [60, 100, 120]
wt = [10, 20, 30]
W = 50


def knapsack(values, weights, total_w, n):
    if total_w == 0 or n < 0:
        return 0

    if total_w < weights[n]:
        return knapsack(values, weights, total_w, n - 1)

    return max(
        knapsack(values, weights, total_w - weights[n], n - 1) + values[n],  # Weight including the object
        knapsack(values, weights, total_w, n - 1))


# print knapsack(values=val, weights=wt, total_w=W, n=len(val) - 1)

"""
max (arr[row-1][wt], values[row - 1] + arr[row - 1][col - weight[row - 1]])
values
  |   weight -->        0   1   2   ... 10  ... 20  ...  30                     40                          50
  V0  weights
  0,  0                 0   0   0       0       0        0                       0                           0
 60,  10                0   0   0      60      60       60                      60                          60
 100, 20                0   0   0      60     100     max(60, 100 + 60) = 160   max(60, 100 + 60) = 160    max(60, 100 + 60) = 160
 120, 30                0   0   0      60     100     max(160, 120 + 0) = 120   max(160, 120 + 60) = 180   max(60, 120 + 100) = 220

"""


def knapsack_dynamic(values, weights, total_w):
    values.insert(0, 0)
    weights.insert(0, 0)
    arr = [[0 for row in range(total_w + 1)]
           for wt in range(len(weights))]

    # print arr

    for row in range(1, len(weights)):
        for wt in range(1, total_w + 1):
            if wt >= weights[row]:
                arr[row][wt] = max(arr[row - 1][wt],  # Excluding the current item
                                   values[row] + arr[row - 1][wt - weights[row]])  # Include the current item
            else:
                arr[row][wt] = arr[row - 1][wt]

    return arr[len(values) - 1][total_w]


print knapsack_dynamic(val, wt, W)
