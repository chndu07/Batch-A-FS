str1=input()
str2=input()
def Rotations(string1, string2):
    size1 = len(string1)
    size2 = len(string2)
    if size1!=size2:
        return 0
    temp = ''
    temp=str1+str1
    if (temp.count(string2)> 0):
        return 1
    else:
        return 0
if Rotations(str1,str2):
    print ("true")
else:
    print ("false")
    
