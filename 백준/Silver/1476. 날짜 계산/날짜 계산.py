e,s,m = map(int,input().split())
checkE = 0
checkS = 0
checkM = 0
year = 0
while True:
    if checkE == e and checkS == s and checkM == m:
        break
    year+=1
    checkM+=1
    checkS+=1
    checkE+=1
    if checkE>15:
        checkE=1
    if checkM > 19:
        checkM = 1
    if checkS>28:
        checkS=1
print(year)