# @Author   : Ganesh Satpute
# @Email 	: ghsatpute@gmail.com
# @Time     : 27 Apr 2014, 11:42AM

string1 = list(raw_input())
string2 = list(raw_input())
len2 = len(string2)
for i in range(0, len(string1)) :
    #print i
    if(string1[i] in string2) :
        string2.remove(string1[i])
# Diff bet original and current letters in string2 are no of deleted letters
# Same letters will be repeated in string1, so minusing those letters will give letters which are extra in string1
# For string2 the letter remaining are letters to be deleted
print (len(string1) - (len2 - len(string2))) + len(string2)
#print len(string2)
