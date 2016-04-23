# Few non-ascii characters came due to copy-paste of problem statement so changing encoding to utf-8.
# -*- coding: utf-8 -*-
# @Author   : Ganesh Satpute
# @Email    : ghsatpute@gmail.com
# @Time     : 27 Feb 2016, 09:240 PM

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
    for i in range(len(mat)):
        for j in range(len(mat[i])):
            print mat[i][j],
        print ""


def read_input_from_file(filename):
    """Reads input from from file for this problem.
    Format would be something like
    m n r
    <---- m1 ----->
    <---- m2 ----->
    ...
    <-----mn ----->

    :param filename: Name of the file from which input is to be read.
    :return: number of rows, number of columns, number of rotations to be made, and matrix
    """
    mat = []
    f = open(filename)
    m, n, r = map(int, f.readline().split(' '))
    if f is not None:
        for line in f:
            mat.append(list(map(int, line.split(' '))))
        return mat, m, n, r
    else:
        print "Could not read file"
        raise("Could not read file")


def read_input_from_stdin():
    """
    Reads matrix from the standard output
    :param num_rows: number of rows to be read
    :type num_rows: int
    :param num_cols: number of columns of matrix to be read
    :type num_cols: int
    :return : matrix of dimensions num_rows x num_cols
    """
    m, n, r = map(int, raw_input().split(' '))
    mat = [[0 for i in range(n)] for j in range(m)]
    for j in range(m):
        mat[j] = list(map(int, raw_input().split(' ')))
    return mat, m, n, r


def rotate(mat, rows, cols, boundary, rotate_by):
    """
    This method will rotate the matrix as given in the problem statement. This method will be recursively called.
    :param mat: Matrix which is to be rotated
    :param rows, cols: Number of rows and columns in the matrix.
    :param boundary: There will be multiple rectangle in the matrix along which we will rotate the elements.
    :param rotate_by: Amount by which we will rotate the matrix.
    """

    """
        Matrix(rows x column)
    Inner matrix with vertices (left, top), (left, bottom), (right, bottom), and (right, top)
     ___________________________________
    |                ^    ^             |
                     |    |             |
    |               top   |             |
    |               ______|____         |
    |            |        |             |
    |<---left--->|        |   |         |
    |<-----------|---right|-->|         |
    |            |        |   |         |
    |            |    bottom  |         |
    |            ____________ |         |
    |                                   |
    |___________________________________|

            Figure 1: Matrix and perimeters
    """
    # Define boundaries on which matrix to rotate
    left = 0 + boundary
    right = cols - boundary - 1  # Coz zero-indexed
    top = 0 + boundary
    bottom = rows - boundary - 1  # Coz zero indexed

    if rotate_by == 0:
        return
    if (left >= right) or (top >= bottom):
        return

    _rotate_by_n(mat, rows, cols, left, right, top, bottom, rotate_by)
    rotate(mat, rows, cols, boundary + 1, rotate_by)


def _rotate_by_n(mat, rows, cols, left, right, top, bottom, n):
    """This method will rotate the matrix by n along the perimeter.
    Perimeter will be defined by the left, right, top, and bottom values.
    :param mat: Matrix which is to be rotated.
    :param rows, cols: Number of rows and columns in the matrix.
    :param left, right, top, bottom: Perimeter definition as defined in Figure 1.
    :param n: Number of steps matrix is to be rotated by.
    """
    # Calculate length of perimeter of rectangle
    peri = ((bottom - top) + (right - left)) * 2
    n %= peri
    if n == 0:
        return
    # Starting point will be top-left corner
    x = top
    y = left
    i = 0
    """
    If number of steps walked is integral multiple of number of elements of perimeter, this means we have completed
    one loop, i.e. we have come to the point we have started
    Lets say, perimeter 24 and n is 16, and starting point is (0,0), after three walks we will be back to the point
    (0,0). At this point, we have rotated all three elements by 16. Now, if we continue this we will keep rotating
    same elements. To avoid this, we have to voluntarily walk one step, so we get to the point (1,0). After three walks
    of 16, we will be again back to the point (1,0). Again we walk one step. We will continue this until all elements
    are rotated.
    """
    steps_walked = 0
    pocket = mat[x][y]
    while i < peri:
        if i != 0 and steps_walked % peri == 0:
            # Walk n position, as we have completed one swapping loop on the perimeter
            x, y = _walk_n_pos(left, right, top, bottom, 1, x, y)
            pocket = mat[x][y]
            # No need to do swapping here
        x1, y1 = _walk_n_pos(left, right, top, bottom, n, x, y)
        steps_walked += n
        temp = mat[x1][y1]
        mat[x1][y1] = pocket
        pocket = temp
        x = x1
        y = y1
        i += 1


def _walk_n_pos(left, right, top, bottom, n, x, y):
    """
    Walks and gets next n'th element on perimeter of rectangle
    :param left, right, top, bottom: Boundaries from the left and top end. This defines perimeter on which we
            will walk.
    :param n: Number steps to take
    :param x, y: From this point on perimeter we will walk.
    :return: After walking n steps from (x, y), new co-ord (x1, y1) where we reach
    """
    x1 = x
    y1 = y
    rem = n
    while rem > 0:
        where = _where_am_i(left, right, top, bottom, x1, y1)
        if where == 1:  # I am on the left boundary
            if rem >= (bottom - x1):  # If I walk n pos, we will cross bottom-left point and be left with pos to walk
                rem -= bottom - x1
                x1 = bottom
            else:  # If I walk n pos, I won't reach bottom-left
                x1 += rem
                rem = 0
        elif where == 2:  # If I'm on bottom boundary
            if rem >= (right - y1):
                rem -= right - y1
                y1 = right
            else:
                y1 += rem
                rem = 0
        elif where == 3:  # If I'm on right boundary
            if rem >= (x1 - top):
                rem -= x1 - top
                x1 = top
            else:
                x1 = x1 - rem
                rem = 0
        elif where == 4:  # If I'm on top boundary
            if rem >= (y1 - left):
                rem -= y1 - left
                y1 = left
            else:
                y1 = y1 - rem
                rem = 0
    return x1, y1


def _where_am_i(left, right, top, bottom, x, y):
    """Finds out where am I on the given boundary of matrix.
    :param left, right, top, bottom: Left, right, top, and bottom boundary from the left end of matrix resp.
    :param x, y: X and Y co-ordinates specifying location on 2-D matrix.
    :return: Returns whether element is on left-edge, right-edge, bottom-edge, or top-edge
    """

    # TODO: Define enum
    if y == left and x != bottom:  # We will consider Bottom-Left element on bottom side
        return 1
    elif x == bottom and y != right:  # We will consider bottom-right element on right side
        return 2
    elif y == right and x != top:  # We will consider top-right element on top side
        return 3
    elif x == 0 + top and y != left:  # We will consider top-left element on left side.
        # P.S. Second condition is redundant code, but kept for the clarity and symmetry
        return 4
    else:
        raise ('Something is not right here')


# m - rows
# n - cols
# r - how much many times the matrix should be rotated
mat, m, n, r = read_input_from_stdin()
# mat, m, n, r = read_input_from_file("input.txt")
# print mat
# mat = rotate_by_1(mat, 0, n, 0, m)
rotate(mat, m, n, 0, r)
print_matrix(mat)
