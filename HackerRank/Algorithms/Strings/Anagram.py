

# Enter your code here. Read input from STDIN. Print output to STDOUT

numTestCases = int(raw_input()) 

for i in range(0, numTestCases ) : 
    string = raw_input()
    if(len(string) % 2 == 0) :
        string1 = list(string[0:len(string)/2])
        string2 = list(string[len(string)/2:len(string)])
        len2 = len(string2)
        for i in range(0, len(string1)) :
            if(string1[i] in string2) :
                string2.remove(string1[i])
        # Diff bet original and current letters in string2 are no of deleted letters
        # Same letters will be repeated in string1, so minusing those letters will give letters which are extra in string1
        # For string2 the letter remaining are letters to be deleted
        print min((len(string1) - (len2 - len(string2))), len(string2))
    else :
        print -1
        
        