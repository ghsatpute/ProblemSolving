# Author : Ganesh Satpute
# Date   : 23-11-2014 10:59PM
# Desc   : Playing with Python lists
#        : Referring Head First Python


# Declare List
# No data type needed
# List can contain any type of data, i.e. it can contain mixed types
Movies = [ "Inception",
            "Avengers",
	    "The Terminal"]

# Print the list as it is

print("\n\nPrinting the list directly:")
print(Movies)

# Foreach loop in python

print("\n\nPrinting each item using for loop:")
# Don't forge the Colon (!)
for movie in Movies:
    print("\t"+movie)


# Needs to explicitly convert int to convert
print("\n\n Length of list: " + str(len(Movies)))


# Operation : Append
# appends the data at the end of the list
print("\n\nBefore Appending: " + str(Movies))
Movies.append("Back to Future");
print("After appending : " + str(Movies))


# Operation : Pop
# removes item from end of the list
print("\n\nBefore popping: " + str(Movies))
Movies.pop()
print("After popping: " + str(Movies))

# Operation : Extend
# Adds list of items to existing lists
temp = ["A Walk to Remember", "The Edge of Tomorrow"]
print("\n\nList to be added: " + str(temp))
print("Before extending list: " + str(Movies))
Movies.extend(temp)
print("After extending list: " + str(Movies))


# Operation : Remove
# Removes specific element from the list
print("\n\nBefore removing element: " + str(Movies))
Movies.remove("A Walk to Remember")
print("After removing element: " + str(Movies))

# Operation : Insert
# Inserts element in particular position
print("\n\nBefore Inserting element: " + str(Movies))
Movies.insert(2,"A Walk to Remeber")
print("After Inserting element: " + str(Movies))

# Operation : List inside another list
Movies.insert(3,temp)
print("List after adding another List:\n" + str(Movies))
print("Printing [3][1]st element : " + str(Movies[3][1]))
