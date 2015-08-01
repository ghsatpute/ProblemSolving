# @Author   : Ganesh Satpute
# @email    : ghsatpute@gmail.com
# @date     : 23 Apr 2015, 10:06 AM

'''
ANGRY PROFESSOR 

Problem Statement

The professor is conducting a course on Discrete Mathematics to a class of  students. He is angry at the lack of their discipline, and he decides to cancel the class if there are less than students present after the class starts.

Given the arrival time of each student, your task is to find out if the class gets cancelled or not.

Input Format

The first line of the input contains , the number of test cases. Each test case contains two lines. 
The first line of each test case contains two space-separated integers,  and . 
The next line contains  space-separated integers, , representing the arrival time of each student.

If the arrival time of a given student is a non-positive integer (), then the student enters before the class starts. If the arrival time of a given student is a positive integer (), the student enters after the class has started.

Output Format

For each testcase, print "YES" (without quotes) if the class gets cancelled and "NO" (without quotes) otherwise.

Constraints





Note 
If a student enters the class exactly when it starts , the student is considered to have entered before the class has started.

Sample Input

2
4 3
-1 -3 4 2
4 2
0 -1 2 1
Sample Output

YES
NO
Explanation

For the first test case, , i.e., the professor wants at least  students to be in class but there are only 2 who have arrived on time ( and ), hence the class gets cancelled.

For the second test case, , i.e, the professor wants at least  students to be in class and there are  who have arrived on time ( and ), hence the class does not get cancelled.



'''



numTestCases = int(raw_input())

for i in range(0, numTestCases) :
    numStudents, reqStudents = map(int, raw_input().split(" "))
    arrivalTimings = map(int, raw_input().split(" "))
    numStudOnTime = 0
    for j in range(0, len(arrivalTimings)) :
        if(arrivalTimings[j] <= 0) :
            numStudOnTime +=  1
    if(numStudOnTime >= reqStudents) :
        print "NO"
    else : 
        print "YES"