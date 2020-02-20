

#!/bin/python
def partition(ar):    
    pivot = ar[0]
    left = 1
    right = len(ar) - 1
    while(left < right) :
        
        while(ar[left] < pivot and left < right) :
            left += 1
            #print "Left ", left
        while(ar[right] > pivot and left <= right) :
            right -= 1
            #print "Right ", right
        
        if(left <= right) :
            temp = ar[left]
            ar[left] = ar[right]
            ar[right] = temp
            #left += 1
            #right -= 1
            #print left, right, ar
    
    temp = ar[right]
    ar[right] = pivot
    ar[0] = temp
    print " ".join(map(str, ar))
    return left

m = input()
ar = [int(i) for i in raw_input().strip().split()]
partition(ar)