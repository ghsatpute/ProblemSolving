# @Author   : Ganesh Satpute
# @Email    : ghsatpute@gmail.com
# @Time     : 21 May 2016, 09:35 PM

"""
Minimum number of jumps to reach end
Given an array of integers where each element represents the max number of steps that can be made forward from that element. Write a function to return the minimum number of jumps to reach the end of the array (starting from the first element). If an element is 0, then cannot move through that element.

Example:

Input: arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
Output: 3 (1-> 3 -> 8 ->9)
First element is 1, so can only go to 3. Second element is 3, so can make at most 3 steps eg to 5 or 8 or 9.
"""
import sys

arr = [1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9]

n = len(arr)
# Create an jump array, initialized it with max int value
jumps = [sys.maxint] * n
# Set 0th value of jump array to 0, you don't need to jump to reach to 0th element from 0th element
jumps[0] = 0
# Whether we've found the answer
complete = False
for i in range(n):
    if complete:
        break
    jump = arr[i]
    # Take the jump length, initialize all the element within that jump's reach to: jumps needed to reach here + 1
    for j in range(i+1, i + jump + 1):
        # If we reached the end of the array, we've already got the answer, can exit the outer loop as well
        if j >= n:
            complete = True
            break

        if jumps[j] > jumps[i] + 1:
            jumps[j] = jumps[i] + 1

print "To reach to n'th element you need to jump {} times ".format(arr[n-1])

