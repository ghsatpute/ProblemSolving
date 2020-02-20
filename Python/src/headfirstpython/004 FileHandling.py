# Author : Ganesh Satpute
# Date   : 26-11-2014 09:54PM
# Desc   : File handling in Python
#        : Referring Head First Python

import os

# Print current directory
print('Current Directory is ' + os.getcwd())
try:
    # Open a file
    file = open("004 FileHandling.txt")

    print("\nContent of file are : \n")
    # Iterate throught file and print the content to standard output
    for line in file :
        # Without end='' print adds extra line in between
        # Needs to check the print command
        print(line, end='')

    # Seek the file pointer to the start of file
    file.seek(0)
    list = []
    # Get all words in the file in list
    for line in file :
        list.extend(line.split(' '))

    print("All words are : " + str(list))

    # Now open a file for writing
    # w+ for writing and if not present will be created
    outfile = open("004 FileHandling_Output.txt",'w+')
    # Write the word list into file
    # file=outfile tells print to write to file instead of stdout
    print(str(list), file=outfile)

finally :
    # Flushes the data to disk
    outfile.close()

    # Close the file
    file.close()



try:
    # with is similar to 'using' in C# no need of finally here.
    # After end of scope it will automatically will clear the resources
    with open('004 FileHandling_Ouput2.txt', "w+") as data:
        print("It's...", file=data)

except IOError as err:
    print('File error: ' + str(err))
