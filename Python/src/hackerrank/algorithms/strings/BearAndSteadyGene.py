# Few non-ascii characters came due to copy-paste of problem statement so changing encoding to utf-8.
# -*- coding: utf-8 -*-
# @Author   : Ganesh Satpute
# @Email    : ghsatpute@gmail.com
# @Time     : 02 May 2016, 12:02 AM

"""
A gene is represented as a string of length nn (where nn is divisible by 44), composed of the letters AA, CC, TT,
 and GG. It is considered to be steady if each of the four letters occurs exactly n4n4 times. For example, GACTGACT
 and AAGTGCCTAAGTGCCT are both steady genes.

Bear Limak is a famous biotechnology scientist who specializes in modifying bear DNA to make it steady.
Right now, he is examining a gene represented as a string ss. It is not necessarily steady. Fortunately, Limak can
choose one (maybe empty) substring of ss and replace it with any substring of the same length.

Modifying a large substring of bear genes can be dangerous. Given a string ss, can you help Limak find the length
of the smallest possible substring that he can replace to make ss a steady gene?

Note: A substring of a string SS is a subsequence made up of zero or more consecutive characters of SS.

Input Format

The first line contains an interger nn divisible by 44, denoting the length of a string ss.
The second line contains a string ss of length nn. Each character is one of the four: AA, CC, TT, GG.

Constraints

4≤n≤5000004≤n≤500000
nn is divisible by 44
Subtask

4≤n≤20004≤n≤2000 in tests worth 30%30% points.
Output Format

On a new line, print the minimum length of the substring replaced to make ss stable.

Sample Input

8
GAAATAAA
Sample Output

5
Explanation

One optimal solution is to replace a substring AAATAAAATA with TTCCGTTCCG, resulting in GTTCCGAAGTTCCGAA.
 The replaced substring has length 55, so we print 55 on a new line.
"""
import sys


class genes:
    def get_index(gene):
        if gene == 'G':
            return genes.G
        if gene == 'A':
            return genes.A
        if gene == 'T':
            return genes.T
        if gene == 'C':
            return genes.C
        raise Exception('Genes are only four types, not {}'.format(gene))
    get_index = staticmethod(get_index)
    G, A, T, C = range(4)


def count_genes(arr):
    res = [0,0,0,0]
    for i in range(len(arr)):
        res[genes.get_index(arr[i])] += 1
    return res


def count_deficit(count, n):
    return map(lambda x: n/4 - x, count)


def count_need(deficit):
    need = []
    for i in range(4):
        if deficit[i] < 0:
            need.append(0 - deficit[i])
        else:
            need.append(0)
    return need


def are_needs_satisfied(need, cur_count):
    for i in range(4):
        if cur_count[i] < need[i]:
            return False
    return True


n = int(raw_input())
array = raw_input()
count = count_genes(array)

deficit = count_deficit(count, n)

# We need an array with containing all the element which needs to be removed
need = count_need(count, deficit)

start = 0               # Start of subarray
end = 0                 # End of subarray, no need to explicitly maintain, but makes it simple to read
length = 0              # Length of subarray
e_start = 0             # Efficient start, with minimum length, a for answer
e_end = 0
e_length = sys.maxint   # Efficient subarray

cur_count = [0, 0, 0, 0]

while end < n:
    # If needs are satisfied increase the start
    # Otherwise increase the end
    if are_needs_satisfied(need, cur_count): # In last run
        # Update the new array, if it is efficient
        if length < e_length:
            e_start = start
            e_end = end         # End will not be inclusive
            e_length = e_end - e_start
        ch = array[start]
        start += 1
        length = end - start
        cur_count[genes.get_index(ch)] -= 1
    else:
        ch = array[end]
        cur_count[genes.get_index(ch)] += 1
        end += 1
        length = end - start

print e_length
