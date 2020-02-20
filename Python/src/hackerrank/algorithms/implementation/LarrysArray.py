# -*- coding: utf-8 -*-
# @Author   : Ganesh Satpute
# @Email    : ghsatpute@gmail.com
# @Time     : 23 APR 2016, 06:04 PM

# TODO: Improvise the algorithm. 

"""
https://www.hackerrank.com/challenges/larrys-array

Larry has a permutation of NN numbers, AA, whose unique elements range from 11 to NN (i.e.: A={a1,a2,…,aN−1,aN}A={a1,a2,…,aN−1,aN}). He wants AA to be sorted, so he delegates the task of doing so to his robot. The robot can perform the following operation as many times as it wants:

Choose any 33 consecutive indices and rotate their elements in such a way that ABCABC rotates to BCABCA, which rotates to CABCAB, which rotates back to ABCABC.
For example: if A={1,6,5,2,4,3}A={1,6,5,2,4,3} and the robot rotates (6,5,2)(6,5,2), AA becomes {1,5, 2, 6,4,3}{1,5, 2, 6,4,3}.

On a new line for each test case, print YESYES if the robot can fully sort AA; otherwise, print NONO.

Input Format

The first line contains an integer, TT, the number of test cases. 
The 2T2T subsequent lines each describe a test case over 22 lines:

An integer, NN, denoting the size of AA.
NN space-separated integers describing AA, where the ithith value describes element aiai.
Constraints

1≤T≤101≤T≤10
3≤N≤10003≤N≤1000
1≤ai≤N, where every element ai is unique.1≤ai≤N, where every element ai is unique.
Output Format

On a new line for each test case, print YESYES if the robot can fully sort AA; otherwise, print NONO.

Sample Input

3
3
3 1 2
4
1 3 4 2
5
1 2 3 5 4
Sample Output

YES
YES
NO
Explanation

In the explanation below, the subscript of AA denotes the number of operations performed.

Test Case 0: 
A0={3,1,2}→rotate(3,1,2)→A1={1,2,3}A0={3,1,2}→rotate(3,1,2)→A1={1,2,3} 
AA is now sorted, so we print YESYES on a new line.

Test Case 1: 
A0={1,3,4,2}→rotate(3,4,2)→A1={1,4,2,3}A0={1,3,4,2}→rotate(3,4,2)→A1={1,4,2,3}. 
A1={1,4,2,3}→rotate(4,2,3)→A2={1,2,3,4}A1={1,4,2,3}→rotate(4,2,3)→A2={1,2,3,4}. 
AA is now sorted, so we print YESYES on a new line.

Test Case 2:
No sequence of rotations will result in a sorted AA. Thus, we print NONO on a new line.
"""

import sys
num_test_cases = int(raw_input())

def minimum(arr, start, end):
    """End inclusive
    """
    mini = sys.maxint
    mini_index = -1
    #print "Minimum " , start, end+1
    for i in range(start, end + 1):
        if arr[i] < mini:
            mini = arr[i]
            mini_index = i
    return mini_index

def rotate(arr, start, end):
    """End inclusive. Rotates 
    """
    backup = arr[end]
    for i in range(start, end):
        temp = arr[i]
        arr[i] = backup
        backup = temp
    arr[end] = backup
    
def select_triplet(start, end, min_i):
    """Selects triplets such a way that it includes minimum index.
    If possible, we try to keep minimum index at last
    This won't be possible in case minium index is less than two position away from start. In this case, 
    we return triplet from the start.
    End is inclusive. 
    """
    if end - start < 2:
        raise Exception("Cannot chose triplet from less than three elements start: {}, end: {}, and min_i: {}".format(start, end, min_i))
    if start + 2 >= min_i:
        return start, start+2
    else:
        return min_i - 2, min_i

def is_triplet_sorted(arr, start):
    min1 = minimum(arr, start, start + 2)
    min2 = minimum(arr, start+1, start + 2)
    if min1 == start and min2 == start + 1:
        return True
    else:
        return False
    
for i in range(num_test_cases):
    n = int(raw_input())
    arr = map(int, raw_input().split(' '))
    i = 0
    while i < n - 2:
        min_i = minimum(arr, i, n - 1) # n-1 coz 0-indexed
        if min_i != i:
            start, end = select_triplet(i, n - 1, min_i) # Start and end are inclusive here
            rotate(arr, start, end)
        else:
            i += 1
    if arr[i] < arr[i+1]: #is_triplet_sorted(arr, i):
        print "YES"
    else:
        print "NO"