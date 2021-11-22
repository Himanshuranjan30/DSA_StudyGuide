from collections import defaultdict
def solve(arr):
    frequency = defaultdict(int)
    temp = []
    for a, b in arr:
        frequency[a] += b
    res = 0
    for key in frequency:
        if frequency[key] >= 4:
            res += 4 * (frequency[key]//4) * key # how may square we can make
            frequency[key] %= 4 
        if 1 < frequency[key] <= 3:  # These can be use to make rectangles.
            temp.append(key)
    temp.sort()
    print(temp)
    res += 2 * sum(temp) if len(temp) %2 == 0 else 2 *sum(temp[1:])
    return res
    
arr = [[5, 6],[3, 2] , [4, 3], [6, 1]]
result = solve(arr)    
print(result)
