
def isBadVersion(version):
    return version >= bad_version

class Solution:
    def firstBadVersion(self, n: int) -> int:
        left, right = 1, n
        while left < right:
            mid = left + (right - left) // 2
            if isBadVersion(mid):
                right = mid  
            else:
                left = mid + 1
        return left


if __name__ == "__main__":
    n = int(input("Enter total number of versions (n): "))
    bad_version = int(input("Enter the first bad version: "))

    sol = Solution()
    result = sol.firstBadVersion(n)
    print("First bad version is:", result)