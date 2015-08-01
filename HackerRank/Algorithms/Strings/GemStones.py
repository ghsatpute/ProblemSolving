# @Author   : Ganesh Satpute
# @Email 	: ghsatpute@gmail.com
# @Time     : 27 Apr 2014, 09:42AM

numTestCases = int(raw_input())

array = []
for i in range(0, numTestCases) :
    array.append(raw_input())
gemElements = 0    
for i in range(97, 123) : # 97 for a, 122 for z, here using 123 as 122 will be the last number
    present = 0
    for j in range(0, len(array)) :
        if chr(i) in array[j] :
            present += 1
    if(present == len(array)) :
        gemElements += 1
        
print gemElements