import collections
def solution(nums):
    check = collections.Counter(nums)
    length = len(nums)
    if len(check) > length//2:
        return length//2
    else:
        return len(check)