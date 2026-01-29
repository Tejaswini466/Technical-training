def green_light_problem(n, c, s):
    max_dist = 0
    for i in range(n):
        if s[i] == c:
            dist = 0
            j = i
            while s[j] != 'g':
                j = (j + 1) % n  
                dist += 1
            max_dist = max(max_dist, dist)
    return max_dist


n, c, s = 3, 'r', "rrg"
print(green_light_problem(n, c, s)) 