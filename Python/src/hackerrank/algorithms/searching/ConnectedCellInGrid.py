from copy import copy, deepcopy

rows = int(raw_input())
cols = int(raw_input())

matrix = [[0 for x in range(cols)] for x in range(rows)]

for i in range(rows) :
    matrix[i] = map(int, raw_input().split(" "))
# print matrix
maxLength = 0
for i in range(rows) :
    for j in range(cols) :
        if(matrix[i][j] == 1) :
            tempMat = deepcopy(matrix)
            #print tempMat
            curNode = i, j
            length = 1
            # Mark current node as visited
            tempMat[i][j] = 'x'
            #print "Current Node ", curNode
            while(True) :
                found = False
                
                '''
                if curNode[1] + 1 < cols :
                    if tempMat[curNode[0]][curNode[1] + 1] == 1 :
                        print "Both Yes"
                    else : 
                        print "Yes No"
                else :
                    print "No", tempMat
                '''    
                # East element    
                if curNode[1] + 1 < cols and tempMat[curNode[0]][curNode[1] + 1] == 1 :
                        curNode = curNode[0], curNode[1] + 1
                        found = True
                        #print "East"
                # South-East Element
                elif curNode[0] + 1 < rows and curNode[1] + 1 < cols  and tempMat[curNode[0] + 1][curNode[1] + 1] == 1 :
                        curNode = curNode[0] + 1, curNode[1] + 1
                        found = True
                        #print "South-East"
                # South Element
                elif curNode[0] + 1 < rows and tempMat[curNode[0] + 1][curNode[1]] == 1 :
                        curNode = curNode[0] + 1, curNode[1]
                        found = True
                        #print "South"
                # South-West Element
                elif curNode[0] + 1 < rows and curNode[1] - 1 >= 0 and tempMat[curNode[0] + 1][curNode[1] - 1] == 1 :
                        curNode = curNode[0] + 1, curNode[1] - 1
                        found = True
                        #print "South-West"
                # West element
                elif curNode[1] - 1 >= 0 and tempMat[curNode[0]][curNode[1] - 1] == 1 :
                        curNode = curNode[0], curNode[1] - 1
                        found = True
                        #print "West"
                # North-West Element
                elif curNode[0] - 1 >= 0 and curNode[1] - 1 >= 0 and tempMat[curNode[0] - 1][curNode[1] - 1] == 1 :
                        curNode = curNode[0] - 1, curNode[1] - 1
                        found = True
                        #print "North-West"
                # North Element
                elif curNode[0] - 1 >= 0 and tempMat[curNode[0] - 1][curNode[1]] == 1 :
                        curNode = curNode[0] - 1, curNode[1]
                        found = True
                        #print "North"
                # North-East Element
                elif curNode[0] - 1 >= 0 and  curNode[1] + 1 < cols and tempMat[curNode[0] - 1][curNode[1] + 1] == 1 :
                        curNode = curNode[0] - 1, curNode[1] + 1
                        found = True
                        #print "North-East"
                
                if found :
                    tempMat[curNode[0]][curNode[1]] = 'x'
                    length += 1
                    #print "Step current NOde " , curNode, " Length ", length
                else :
                    #print "Breaking the current node"
                    break
            if maxLength < length :
                maxLength = length
            
print maxLength
