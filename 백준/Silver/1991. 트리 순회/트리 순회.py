def preorder(n):
    if n != '.':
        print(n,end='')
        preorder(arr[n][0])
        preorder(arr[n][1])


def inorder(n):
    if n != '.':
        inorder(arr[n][0])
        print(n,end='')
        inorder(arr[n][1])
def postorder(n):
    if n != '.':
        postorder(arr[n][0])
        postorder(arr[n][1])
        print(n,end='')

V = int(input())
arr = {}
root1 = 'A'
for _ in range(V):
    root,left,right = input().split()
    arr[root] = [left,right]
preorder(root1)
print()
inorder(root1)
print()
postorder(root1)
# preorder(root)
# preorder(root)
#
# ch1 = [0] * (V+1)
# ch2 = [0] * (V+1)
# root_arr = []
# root = 1
# for _ in range(V):
#     root,left,right = input().split()
#     root_arr.append((_+1,root))
#
#     if ch1[root_arr[_][0]] == 0:
#         ch1[root_arr[_][0]] = (_+1,left)
#     else:
#         ch2[root_arr[_][0]] = (_+1,right)
# print(ch1)
# # preorder(root)