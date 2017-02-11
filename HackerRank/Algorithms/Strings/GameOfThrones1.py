# @Author   : Ganesh Satpute
# @Email 	: ghsatpute@gmail.com
# @Time     : 27 Apr 2014, 08:42AM

string = list(raw_input())

found = False
# Write the code to find the required palindrome and then assign the variable 'found' a value of True or False
even = False
if len(string) % 2 == 0:
    even = True

occuredLetters = []

for i in range(0, len(string)):
    if string[i] in occuredLetters:
        occuredLetters.remove(string[i])
    else:
        occuredLetters.append(string[i])
if even and len(occuredLetters) == 0:
    found = True
if not even and len(occuredLetters) == 1:
    found = True

if not found:
    print("NO")
else:
    print("YES")
