# Author : Ganesh Satpute
# Date   : 23-11-2014 10:59PM
# Desc   : Exception handling demo
#        : Referring Head First Python


# Try starts
try :
    print("trying to open the file")
    open("abc.txt") # abc.txt does not exist so will have exception
    print("File opened")
except IOError as err: # err will contain specific details of exception
    print("Exception occurred while opening file" + str(err))
finally :
    print("This is finally")
