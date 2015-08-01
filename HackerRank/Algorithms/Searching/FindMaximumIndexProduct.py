# Enter your code here. Read input from STDIN. Print output to STDOUT\

numTestCases = int(raw_input())

array = map(long, raw_input().split(" "))
maxElement = max(array)
maxProduct = 0 
for i in range(0, len(array)) :
    if array[i] == maxElement : 
        continue
    k = i - 1
    while k >= 0 and array[k] <= array[i] :
        k -= 1
    #print i, "K ", k+1
    if k == -1 :
        continue
    l = i + 1
    while l < len(array) and array[l] <= array[i] :
        l += 1
    #print i, "L ", l+1
    if l == len(array) :
        continue
    # Indices start from 1
    l += 1
    k += 1
    if l * k > maxProduct :
        maxProduct = l * k
print maxProduct        