# @Author   : Ganesh Satpute
# @Email 	: ghsatpute@gmail.com
# @Time     : 27 Apr 2014, 08:42AM
numTestCases = int(raw_input())

for i in range(0, numTestCases) :
    string = list(raw_input())
    #print string
    deletions = 0
    for i in range(1, len(string)) :
        if(string[i] == string[i-1]) :
            deletions += 1
    print deletions