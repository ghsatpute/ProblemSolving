# @Author   : Ganesh Satpute
# @Email    : ghsatpute@gmail.com
# @Date     : 27 Apr 2015, 10:05 AM

'''



'''
def insertionSort(ar):    
    for i in range(1, len(ar)) :
        temp = ar[i]
        j = i
        while(j > 0  and ar[j - 1] >= temp) :
            ar[j] = ar[j - 1]
            j -= 1
        ar[j] = temp
        print " ".join(map(str, ar))
        
    return ""

m = input()
ar = [int(i) for i in raw_input().strip().split()]
insertionSort(ar)
