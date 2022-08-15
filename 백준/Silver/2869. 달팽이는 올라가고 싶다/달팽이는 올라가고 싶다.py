import math
a,b,V = map(int,input().split())
day = (V-b)/(a-b)

print(math.ceil(day))
