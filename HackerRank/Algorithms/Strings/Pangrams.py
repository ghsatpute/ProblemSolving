
# @Author   : Ganesh Satpute
# @Email 	: ghsatpute@gmail.com
# @Time     : 27 Apr 2014, 08:42AM

string = list(raw_input())

aSet = set()
for i in range(0, len(string)) :
    if(string[i].isalpha()) :
        aSet.add(string[i].lower())
        if(len(aSet) == 26) :
            break
        
if(len(aSet) == 26) :
    print "pangram"
else :
    print "not pangram"