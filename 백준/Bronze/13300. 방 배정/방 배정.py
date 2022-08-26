student, cap = map(int,input().split())
student_arr= [[] for _ in range(7)]
for i in range(student):
    gender, grade = map(int,input().split())
    student_arr[grade].append(gender)
room = 0

for i in student_arr:
    room += (i.count(1)+(cap-1))//cap
    room += (i.count(0)+(cap-1))//cap
print(room)




