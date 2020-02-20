# @Author   : Ganesh Satpute
# @Email    : ghsatpute@gmail.com
# @Time     : 19 Feb 2016, 12:23 AM

"""
A modified Kaprekar number is a positive whole number nn with dd digits, such that when we split its square into two pieces - a right hand piece rr with dd digits and a left hand piece ll that contains the remaining dd or d−1d−1 digits, the sum of the pieces is equal to the original number (i.e. ll + rr = nn).

Note: r may have leading zeros.

Here's an explanation from Wikipedia about the ORIGINAL Kaprekar Number (spot the difference!): In mathematics, a Kaprekar number for a given base is a non-negative integer, the representation of whose square in that base can be split into two parts that add up to the original number again. For instance, 45 is a Kaprekar number, because 45² = 2025 and 20+25 = 45.

The Task 
You are given the two positive integers pp and qq, where pp is lower than qq. Write a program to determine how many Kaprekar numbers are there in the range between pp and qq (both inclusive) and display them all.

Input Format

There will be two lines of input: pp, lowest value qq, highest value

Constraints: 
0<p<q<1000000<p<q<100000
Output Format

Output each Kaprekar number in the given range, space-separated on a single line. If no Kaprekar numbers exist in the given range, print INVALID RANGE.

Sample Input

1
100
Sample Output

1 9 45 55 99

Explanation

11, 99, 4545, 5555, and 9999 are the Kaprekar Numbers in the given range.

"""
fr = int(raw_input())
to = int(raw_input())
count = 0
for i in range(fr, to + 1):
	# Square the number and convert it into string
    num = str(i*i)
    # Obtain first part by splitting the number
	# If square has odd length f should be lesser than l (Of course, otherwise equal)
    f = num[0:(len(num))/2]
    l = num[-1 * (len(num) - len(f)):]
	
    if not f == '':
        f = int(f)
    else:
        f = 0
    
    if not l == '':
        l = int(l)
    else:
        l = 0
        
    if i == f + l:
        print i, 
        count += 1

if count == 0:
    print "INVALID RANGE"