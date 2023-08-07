def moveZeros(nums):
    count = 0
    currentElement = 0;
    for i in range(len(nums)):
        if nums[i] != 0:
            nums[currentElement] = nums[i]
            count+= 1
            currentElement += 1
    for j in range(len(nums)):
        if j >= count:
         nums[j] = 0
    return nums

print(moveZeros([0, 1, 0, 3, 12]))
