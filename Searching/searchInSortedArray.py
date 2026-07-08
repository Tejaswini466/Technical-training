def search(nums, target):
    left, right = 0, len(nums) - 1
    
    while left <= right:
        mid = (left + right) // 2
        
        if nums[mid] == target:
            return mid
        if nums[left] <= nums[mid]:
            if nums[left] <= target < nums[mid]:
                right = mid - 1
            else:
                left = mid + 1
        else:
            if nums[mid] < target <= nums[right]:
                left = mid + 1
            else:
                right = mid - 1
    
    return -1


if __name__ == "__main__":
    n = int(input("Enter size of array: "))
    nums = list(map(int, input("Enter array elements: ").split()))
    target = int(input("Enter target: "))
    result = search(nums, target)
    print("Output:", result)