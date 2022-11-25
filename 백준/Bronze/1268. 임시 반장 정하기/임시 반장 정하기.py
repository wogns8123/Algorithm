N = int(input())
list_2 = []
for _ in range(N):
    list_2.append(list(map(int,input().split())))

student=[] # 학생별로 겹치는 학생을 저장
for i in range(N):
    student.append(set()) #set으로 지정

tmp1=[]     # i,j => j,i
for i in range(5):
    tmp2 = []
    for j in range(N):
        tmp2.append(list_2[j][i])
    tmp1.append(tmp2)        

for i, list_1 in enumerate(tmp1):       # 자신을 포함하여 겹치는 반인 경우 student에 저장
    for j, val1 in enumerate(list_1):
        for k, val2 in enumerate(list_1):
            if val1 == val2:
                student[j].add(k)

max_idx, max_val = 0,0
for idx, val in enumerate(student):
    len_val = len(val)
    if len_val>max_val:
        max_idx = idx+1
        max_val = len_val
print(max_idx)