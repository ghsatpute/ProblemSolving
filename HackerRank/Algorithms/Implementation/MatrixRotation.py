# @Author   : Ganesh Satpute
# @Email    : ghsatpute@gmail.com
# @Time     : 27 Feb 2016, 09:240 PM

# TODO: Incomplete, Need to optimize for larger input size
# Currently rotating one position at a time. Can we rotate by some n in single go?

"""
https://www.hackerrank.com/challenges/matrix-rotation-algo/copy-from/17864306

You are given a 2D matrix, a, of dimension MxN and a positive integer R. You have to rotate the matrix R times and print the resultant matrix. Rotation should be in anti-clockwise direction.

Rotation of a 4x5 matrix is represented by the following figure. Note that in one rotation, you have to shift elements by one step only (refer sample tests for more clarity).

matrix-rotation

It is guaranteed that the minimum of M and N will be even.

Input Format 
First line contains three space separated integers, M, N and R, where M is the number of rows, N is number of columns in matrix, and R is the number of times the matrix has to be rotated. 
Then M lines follow, where each line contains N space separated positive integers. These M lines represent the matrix.

Output Format 
Print the rotated matrix.

Constraints 
2 <= M, N <= 300 
1 <= R <= 109 
min(M, N) % 2 == 0 
1 <= aij <= 108, where i ∈ [1..M] & j ∈ [1..N]

Sample Input #00

4 4 1
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
Sample Output #00

2 3 4 8
1 7 11 12
5 6 10 16
9 13 14 15
Sample Input #01

4 4 2
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
Sample Output #01

3 4 8 12
2 11 10 16
1 7 6 15
5 9 13 14
Sample Input #02

5 4 7
1 2 3 4
7 8 9 10
13 14 15 16
19 20 21 22
25 26 27 28
Sample Output #02

28 27 26 25
22 9 15 19
16 8 21 13
10 14 20 7
4 3 2 1
Sample Input #03

2 2 3
1 1
1 1
Sample Output #03

1 1
1 1
Explanation 
Sample Case #00: Here is an illustration of what happens when the matrix is rotated once.

 1  2  3  4      2  3  4  8
 5  6  7  8      1  7 11 12
 9 10 11 12  ->  5  6 10 16
13 14 15 16      9 13 14 15
Sample Case #01: Here is what happens when to the matrix after two rotations.

 1  2  3  4      2  3  4  8      3  4  8 12
 5  6  7  8      1  7 11 12      2 11 10 16
 9 10 11 12  ->  5  6 10 16  ->  1  7  6 15
13 14 15 16      9 13 14 15      5  9 13 14
Sample Case #02: Following are the intermediate states.

1  2  3  4      2  3  4 10    3  4 10 16    4 10 16 22
7  8  9 10      1  9 15 16    2 15 21 22    3 21 20 28
13 14 15 16 ->  7  8 21 22 -> 1  9 20 28 -> 2 15 14 27 ->
19 20 21 22    13 14 20 28    7  8 14 27    1  9  8 26
25 26 27 28    19 25 26 27    13 19 25 26   7 13 19 25



10 16 22 28    16 22 28 27    22 28 27 26    28 27 26 25
 4 20 14 27    10 14  8 26    16  8  9 25    22  9 15 19
 3 21  8 26 ->  4 20  9 25 -> 10 14 15 19 -> 16  8 21 13
 2 15  9 25     3 21 15 19     4 20 21 13    10 14 20  7
 1  7 13 19     2  1  7 13     3  2  1  7     4  3  2  1
Sample Case #03: As all elements are same, any rotation will reflect the same matrix.

"""

def print_matrix(mat):
    #print "--------------------"
    for i in range(len(mat)):
        for j in range(len(mat[i])):
            print mat[i][j],
        print ""
    #print "--------------------"

def read_matrix(num_rows, num_cols):
    """
    Reads matrix from the standard output
    :param num_rows: number of rows to be read
    :type num_rows: int
    :param num_cols: number of columns of matrix to be read
    :type num_cols: int
    :return : matrix of dimensions num_rows x num_cols
    """
    mat = [[0] * num_cols for j in range(num_rows)]
    #print mat
    for j in range(num_rows):
        mat[j] = list(map(int, raw_input().split(' ')))
    #print mat
    return mat

def rotate(mat, num_rows, num_cols, boundary, rotate_by):
    # Define boundaries on which matrix to rotate
    left = 0 + boundary
    right = num_cols - boundary
    top = 0 + boundary
    bottom = num_rows - boundary
    rotate_by = rotate_by % (num_rows * num_cols)
    
    if (left >= right ) or ( top >= bottom):
        return
    
    for i in range(rotate_by):
        rotate_by_1(mat, left, right, top, bottom)
    #print "=================================="
    rotate(mat, num_rows, num_cols, boundary + 1, rotate_by)
    #print "=================================="
    #return mat
             
def rotate_by_1(mat, left, right, top, bottom):
    #print top, left, bottom, right
    # Start from top - left, increment top while 
    i = top # row index
    j = left # column index
    back = mat[i][j]
    # Shift left elements
    #print_matrix(mat)
    while i < bottom:
        temp = mat[i][j]
        mat[i][j] = back
        back = temp
        i += 1
    #print_matrix(mat)
    # Decrease the i and increase j
    i -= 1
    j += 1
    # Shift bottom elements
    while j < right: 
        temp = mat[i][j]
        mat[i][j] = back
        back = temp
        j += 1
    #print_matrix(mat)
    j -= 1
    i = bottom - 2
    # Shift right elements
    while i >= top:
        temp = mat[i][j]
        mat[i][j] = back
        back = temp
        i -= 1
    #print_matrix(mat)
    i = top
    j = right - 2
    # Shift top elements
    while j >= left:
        temp = mat[i][j]
        mat[i][j] = back
        back = temp
        j -= 1
    #print_matrix(mat)
    #return mat
        

m, n, r = map(int, raw_input().split(' '))
#print m, n, r
mat = read_matrix(m, n)
#print mat
#mat = rotate_by_1(mat, 0, n, 0, m)
rotate(mat, m, n, 0, r)
print_matrix(mat)