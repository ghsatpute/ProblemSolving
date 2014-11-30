# Author : Ganesh Satpute
# Date   : 23-11-2014 11:55PM
# Desc   : Playing with Python functions
#        : Referring Head First Python

#---------------------------------------------------------------------#
# Declare a function
# While declaring Python function no need to add return type
# Seems function parameters are not checked again types even if you give them
# Again, don't forget the column :P 
def add(number_1, number_2, number_3=0) : # number_3 is optional parameter
    return number_1 + number_2 + number_3
# call the add function
print(add(3.4,4))

#---------------------------------------------------------------------#
# Declare simple recursive function of factorial
def factorial(number) :
    if(number==1) : # Colon (!)
        return 1
    else : # Colon (!)
        return number * factorial(number - 1)
# Call factorial function
print("Factorial of 4 is : " + str(factorial(4)))

#---------------------------------------------------------------------#

