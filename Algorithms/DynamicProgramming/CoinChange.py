# @Author   : Ganesh Satpute
# @Email    : ghsatpute@gmail.com
# @Time     : 04 Feb 2017, 07:42 PM

"""
http://www.geeksforgeeks.org/dynamic-programming-set-7-coin-change/
"""


def _coin_change(coins, s, i):
    if s == 0:
        return 1
    if s < 0:
        return 0

    if i >= len(coins) and s > 0:
        return 0

    # If solution contains n'th coin
    a = _coin_change(coins, s - coins[i], i)
    # print "Sum\t: " + str(s) + "\t\tCurrent coin\t:" + str(coins[i]) + " include\t\tWays are\t:" + str(a)
    # If solution does not contain n'th coin
    b = _coin_change(coins, s, i + 1)
    # print "Sum\t: " + str(s) + "\t\tCurrent coin\t" + str(coins[i]) + " don't include\t\tWays are\t:" + str(a)
    print "{}\t{}\t{}".format(s, i, a + b)
    return a + b


def coin_change(coins, s):
    return _coin_change(coins, s, 0)


def coin_change_d(coins, s):
    arr = [[0 for i in range(s + 1)] for j in range(len(coins))]
    '''
        sum->   0   1   2   3   4   5
    coins
     |
     v
     1          1   1   1   1   1   1
     2          1   1   2   2   3   3
     3          1   1   2   3   4   5
    '''
    print arr
    for i in range(len(coins)):
        arr[i][0] = 1

    for c in range(len(coins)):
        coin = coins[c]
        for sm in range(1, s+1):
            if sm - c >= 0:
                arr[c][sm] += arr[c][sm - coin]
            if c - 1 >= 0:
                arr[c][sm] += arr[c - 1][sm]

    return arr[len(coins) - 1][s]

total = 5
coins = [1, 2, 3]
'''
[1 1 1 1 1]
[1 1 1 2]
[1 1 3]
[1 3]
[2 3]
'''
# print coin_change(coins, total)
print coin_change_d(coins, total)

