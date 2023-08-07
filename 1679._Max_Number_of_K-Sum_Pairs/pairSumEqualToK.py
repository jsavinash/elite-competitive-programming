def pairSumEqualToK(arr, k):
    count = 0
    hash = {}
    for i in range(len(arr)):
        if k - arr[i] in hash and hash[k - arr[i]] > 0:
            count += 1
            hash[k - arr[i]] -= 1
        else:
         if arr[i] in hash and hash[arr[i]] > 0:
            hash[arr[i]] += 1
         else:
            hash[arr[i]] = 1
    return count
    
print(pairSumEqualToK([1,2,3,4], 5))