# @Author   : Ganesh Satpute
# @Email    : ghsatpute@gmail.com
# @Time     : 21 Feb 2016, 03:13 PM

"""
https://www.hackerrank.com/challenges/encryption/copy-from/17657545

An English text needs to be encrypted using the following encryption scheme. 
First, the spaces are removed from the text. Let LL be the length of this text. 
Then, characters are written into a grid, whose rows and columns have the following constraints:

⌊L√⌋≤rows≤column≤⌈L√⌉⌊L⌋≤rows≤column≤⌈L⌉, where ⌊x⌋⌊x⌋ is floor function and ⌈x⌉⌈x⌉ is ceil function
For example, the sentence if man was meant to stay on the ground god would have given us roots after removing spaces is 5454 characters long, so it is written in the form of a grid with 7 rows and 8 columns.

ifmanwas  
meanttos          
tayonthe  
groundgo  
dwouldha  
vegivenu  
sroots
Ensure that rows×columns≥Lrows×columns≥L
If multiple grids satisfy the above conditions, choose the one with the minimum area, i.e. rows×columnsrows×columns.
The encoded message is obtained by displaying the characters in a column, inserting a space, and then displaying the next column and inserting a space, and so on. For example, the encoded message for the above rectangle is:

imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau

You will be given a message in English with no spaces between the words. The maximum message length can be 8181 characters. Print the encoded message.

Here are some more examples:

Sample Input:

haveaniceday
Sample Output:

hae and via ecy
Sample Input:

feedthedog    
Sample Output:

fto ehg ee dd
Sample Input:

chillout
Sample Output:

clu hlt io

"""


#!/bin/python

import sys
import math

s = raw_input().strip()

s = s.replace(' ', '')
# Floor
sqrt = math.sqrt(len(s))
floor = int(math.floor(sqrt))
ceil = int(math.ceil(sqrt))
# Make sure array is enough to store the all characters from the string
if floor * ceil < len(s):
    floor = ceil
    
#print len(s), sqrt, floor, ceil
mat = [[0 for i in range(ceil)] for j in range(floor)]
index = 0
for i in range(floor):
    for j in range(ceil):
        if index < len(s):
            mat[i][j] = s[index]
        else:
			# -1 means and empty array
			# Maybe can do better, but right now lets keep as it is
            mat[i][j] = -1
        index += 1
#print mat
index = 0
for i in range(ceil):
    for j in range(floor):
        if mat[j][i] != -1:
            sys.stdout.write(str(mat[j][i]))
            index += 1
    sys.stdout.write(' ')