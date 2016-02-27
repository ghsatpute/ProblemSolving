# @Author   : Ganesh Satpute
# @Email    : ghsatpute@gmail.com
# @Time     : 17 Feb 2016, 11:38 PM

"""
https://www.hackerrank.com/challenges/the-time-in-words
Given the time in numerals we may convert it into words, as shown below:

5:005:015:105:305:405:455:475:28→ five o' clock→ one minute past five→ ten minutes past five→ half past five→ twenty minutes to six→ quarter to six→ thirteen minutes to six→ twenty eight minutes past five
5:00→ five o' clock5:01→ one minute past five5:10→ ten minutes past five5:30→ half past five5:40→ twenty minutes to six5:45→ quarter to six5:47→ thirteen minutes to six5:28→ twenty eight minutes past five
Write a program which prints the time in words for the input given in the format mentioned above.

Input Format

There will be two lines of input:
HH, representing the hours
MM, representing the minutes

Constraints
1≤H<121≤H<12
0≤M<600≤M<60
Output Format

Display the time in words.

Sample Input

5  
47  
Sample Output

thirteen minutes to six
"""

#!/bin/python

import sys

h = int(raw_input().strip())
m = int(raw_input().strip())

numbers = {1:'one', 2:'two', 3:'three', 4:'four', 5:'five',
           6:'six', 7:'seven', 8:'eight', 9:'nine', 10:'ten',
           11:'eleven', 12:'twelve', 13:'thirteen', 14:'fourteen', 15:'fifteen', 
           16:'sixteen', 17:'seventeen', 18:'eighteen', 19:'nineteen', 20:'twenty',
           21:'twenty one', 22:'twenty two', 23:'twenty three',	24:'twenty four', 25:'twenty five',
           26:'twenty six', 27:'twenty seven', 28:'twenty eigh', 29:'twenty nine', 30:'thirty'}

if m == 0:
    print "{} o' clock".format(numbers[h])
elif m == 1:
    print "one minute past {}".format(numbers[h])
elif m == 15:
    print "quarter past {}".format(numbers[h])
elif m < 30:
    print "{} minutes past {}".format(numbers[m], numbers[h])
elif m == 30:
    print "half past {}".format(numbers[h])
elif m == 45:
    print "quarter to {}".format(numbers[(h+1)%12])
elif m < 58:
    print "{} minutes to {}".format(numbers[60-m], numbers[(h+1)%12])
elif m == 59:
    print "one minute to {}".format(numbers[60-m], numbers[(h+1)%12])