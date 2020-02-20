# @Author   : Ganesh Satpute
# @Email 	: ghsatpute@gmail.com
# @Time     : 27 Apr 2014, 10:42AM

numTestCases = int(raw_input())

for i in range(0, numTestCases):
    string = raw_input()
    string = list(string)

    isFunny = True
    l = len(string) - 1
    for j in range(0, l):
        if (abs(ord(string[j])
                    - ord(string[j + 1]))
                !=
                abs(ord(string[l - j])
                        - ord(string[l - j - 1]))):
            isFunny = False
            break

    if (isFunny):
        print "Funny"
    else:
        print "Not Funny"
