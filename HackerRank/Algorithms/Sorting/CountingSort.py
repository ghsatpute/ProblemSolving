# @Author   : Ganesh Satpute
# @Email    : ghsatpute@gmail.com
# @Date     : 29 Apr 2015, 11:45 PM

nums = int(raw_input())

array = map(int, raw_input().split(" "))
countings = [0] * 100
for i in range(0, nums) :
    countings[array[i]] += 1
    
print " ".join(map(str, countings))
