def prefix_sum(arr):
    prefix = [0] * (len(arr)+1)
    for i in range(len(arr)):
        prefix[i+1] = prefix[i] + arr[i]
    return prefix

arr = [2, 4, 5, 7]
prefix = prefix_sum(arr)