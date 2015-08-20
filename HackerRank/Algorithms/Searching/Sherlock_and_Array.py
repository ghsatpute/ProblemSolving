# @Author   : Ganesh Satpute
# @time     : 22 Aug 2015, 11:59 PM

"""
Problem Statement

Русский \| 中文
Watson gives Sherlock an array A of length N. Then he asks him to determine if there exists an element in the array such that the sum of the elements on its left is equal to the sum of the elements on its right. If there are no elements to the left/right, then the sum is considered to be zero. 
Formally, find an i, such that, A1+A2...Ai-1 =Ai+1+Ai+2...AN.

Input Format 
The first line contains T, the number of test cases. For each test case, the first line contains N, the number of elements in the array A. The second line for each test case contains N space-separated integers, denoting the array A.

Output Format 
For each test case print YES if there exists an element in the array, such that the sum of the elements on its left is equal to the sum of the elements on its right; otherwise print NO.

Constraints 
1≤T≤10 
1≤N≤105 
1≤Ai ≤2×104 
1≤i≤N
Sample Input

2
3
1 2 3
4
1 2 3 3
Sample Output

NO
YES
Explanation 
For the first test case, no such index exists. 
For the second test case, A[1]+A[2]=A[4], therefore index 3 satisfies the given conditions.
"""



numTest = int(raw_input())

for i in range(numTest) :
    length = int(raw_input())
    array = map(int, raw_input().split(" "))
    li = -1 # Left index
    ri = length# Right index
    ls = 0 # Left sum
    rs = 0 # Right sum
    while li + 1 != ri - 1 : 
        if ls > rs : 
            ri -= 1
            rs += array[ri]
            #print "Right ", rs, ri
        else :
            li += 1
            ls += array[li]
            #print "Left ", ls, li
    if ls == rs : 
        print "YES"
    else :
        print "NO"