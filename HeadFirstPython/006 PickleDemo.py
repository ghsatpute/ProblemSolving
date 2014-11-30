# Date   : 27-11-2014 12:24AM
# Desc   : Using pickle
#        : Referring Head First Python

import pickle
# Pickle looks similar to serialization and deserialization in Java and C#
# It stores in-memory data structures to files, databases and
# read them back again

list = ['a','b','c','d','e','f','g','h']

with open("006 PickleDemo.txt","wb") as outdata :
    pickle.dump(list, outdata)

with open("006 PickleDemo.txt","rb") as indata :
    mylist = pickle.load(indata)

print(mylist)
