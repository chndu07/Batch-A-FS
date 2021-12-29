import string
def pangram(str):
    alphabet = "abcdefghijklmnopqrstuvwxyz"
    for char in alphabet:
        if char not in str.lower():
            return False
    return True
string = input()
if(pangram(string) == True):
    print("true")
else:
    print("false") 
