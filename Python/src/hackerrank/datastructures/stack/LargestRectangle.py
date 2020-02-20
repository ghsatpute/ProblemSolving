# @Author   : Ganesh Satpute
# @Email    : ghsatpute@gmail.com
# @Date     : 21 Aug 2015, 12:38 AM
"""
Problem Statement

There are N buildings in a certain one-dimensional landscape. Each building has a height given by hi,i?[1,N].
If you join K adjacent buildings, they will form a solid rectangle of area K�min(hi,hi+1,�,hi+k-1).

Given N buildings, find the greatest such solid area formed by consecutive buildings.

Input Format 
The first line contains N, the number of buildings altogether. 
The second line contains N space-separated integers, each representing the height of a building.

Constraints 
1=N=105 
1=hi=106
Output Format 
One integer representing the maximum area of rectangle formed.

Sample Input

5
1 2 3 4 5
Sample Output

9

"""

# Could've used stack but didn't

num = int(raw_input())
arr = map(int, raw_input().split(" "))

maxArea = 0;

for i in range(num):
    ib = i  # Incrementor backwards
    while ib > -1 and arr[ib] >= arr[i]:
        ib -= 1
    ib += 1

    if1 = i  # Incrementor forwards
    while if1 < num and arr[if1] >= arr[i]:
        if1 += 1
    if1 -= 1

    area = ((if1 - ib) + 1) * arr[i]

    if area > maxArea:
        maxArea = area;
print maxArea
