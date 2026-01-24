def findMountainArray(target, mountainArr):
    left, right = 0, len(mountainArr) - 1
    while left < right:
        mid = (left + right) // 2
        if mountainArr[mid] < mountainArr[mid + 1]:
            left = mid + 1
        else:
            right = mid
    peak = left

    def binary_search(left, right, target, increasing=True):
        while left <= right:
            mid = (left + right) // 2
            if mountainArr[mid] == target:
                return mid
            if increasing:
                if mountainArr[mid] < target:
                    left = mid + 1
                else:
                    right = mid - 1
            else:  
                if mountainArr[mid] < target:
                    right = mid - 1
                else:
                    left = mid + 1
        return -1

    index = binary_search(0, peak, target, True)
    if index != -1:
        return index

    return binary_search(peak + 1, len(mountainArr) - 1, target, False)

n, target = map(int, input().split())
mountainArr = list(map(int, input().split()))
ans = findMountainArray(target, mountainArr)
print(ans)