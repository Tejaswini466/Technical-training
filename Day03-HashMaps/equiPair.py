def find_equi_pair(arr):
    n = len(arr)
    prefix = [0] * n

    prefix[0] = arr[0]
    for i in range(1, n):
        prefix[i] = prefix[i - 1] + arr[i]

    for i in range(1, n - 2):
        for j in range(i + 2, n - 1):  
            sum1 = prefix[i - 1]                  
            sum2 = prefix[j - 1] - prefix[i]      
            sum3 = prefix[n - 1] - prefix[j]     

            if sum1 == sum2 == sum3:
                return i, j   
    return -1

n = int(input())
arr = list(map(int, input().split()))


result = find_equi_pair(arr)
if result == -1:
    print(-1)
else:
    print(result[0], result[1])