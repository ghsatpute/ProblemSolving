# -*- coding: utf-8 -*-
# @Author   : Ganesh Satpute
# @Email    : ghsatpute@gmail.com
# @Time     : 23 APR 2016, 03:24 PM
"""
https://www.hackerrank.com/challenges/larrys-array/

Lisa just got a new math workbook. A workbook contains exercise problems, grouped into chapters.

There are nn chapters in Lisa's workbook, numbered from 11 to nn.
The ii-th chapter has titi problems, numbered from 11 to titi.
Each page can hold up to kk problems. There are no empty pages or unnecessary spaces, so only the last page of a chapter may contain fewer than kk problems.
Each new chapter starts on a new page, so a page will never contain problems from more than one chapter.
The page number indexing starts at 11.
Lisa believes a problem to be special if its index (within a chapter) is the same as the page number where it's located. Given the details for Lisa's workbook, can you count its number of special problems?

Note: See the diagram in the Explanation section for more details.

Input Format

The first line contains two integers nn and kk — the number of chapters and the maximum number of problems per page respectively. 
The second line contains nn integers t1,t2,…,tnt1,t2,…,tn, where titi denotes the number of problems in the ii-th chapter.

Constraints

1≤n,k,ti≤1001≤n,k,ti≤100
Output Format

Print the number of special problems in Lisa's workbook.

Sample Input

5 3  
4 2 6 1 10
Sample Output

4
"""

num_chaps, max_problem_per_page = map(int, raw_input().split(' '))
probs_per_chap = map(int, raw_input().split(' '))
#print num_chaps, probs_per_chap
chap = 0        # Chapter number, 1-indexed
page = 0        # Page number, 1-indexed
special = 0

while chap < num_chaps:
    for prob_num in range(probs_per_chap[chap]): # As arrays are 0-indexed
        if prob_num % max_problem_per_page == 0:
            page += 1
        if prob_num + 1 == page:
            special += 1
    chap += 1
    
print special