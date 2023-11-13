rating = [4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0]
grade = ['A+', 'A0', 'B+', 'B0', 'C+', 'C0', 'D+', 'D0', 'F']

total = 0 # 학점의 합
result = 0 # 학점 * 점수

for _ in range(20):
    subject, num, score = map(str,input().split())
    num = float(num)
    if score != 'P':
        total += num
        result += num * rating[grade.index(score)]
print(round(result/total, 6))