def count_occurrences(arr, x):
    count = 0
    for element in arr:
        if element == x:
            count += 1
    return count

if __name__ == "__main__":
    # Input list
    arr = list(map(int,input().split()))
    x=int(input())
    
    print(f"Element {x} occurs {count_occurrences(arr, x)} times.")