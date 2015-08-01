
# @Author   : Ganesh Satpute
# @Email 	: ghsatpute@gmail.com
# @Time     : 28 Apr 2014, 08:10 PM

numTestCases = int(raw_input())

for i in range(0, numTestCases) :
    str1 = raw_input()
    str2 = raw_input()
        
    found = False
    if(len(set(str1) & set(str2)) > 0) :
        found = True
    
    if(found) :
        print "YES"
    else :
        print "NO"
    
    