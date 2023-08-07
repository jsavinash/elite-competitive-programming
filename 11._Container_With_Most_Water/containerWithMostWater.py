def containerWithMostWater(waterHeight):
    lPtr = 0
    rPtr = len(waterHeight) - 1
    maxArea = 0
    while lPtr < rPtr:
        currentMaxArea = min(waterHeight[lPtr], waterHeight[rPtr]) * (rPtr - lPtr)
        maxArea = max(maxArea, currentMaxArea)
        if waterHeight[lPtr] < waterHeight[rPtr]:
            lPtr += 1
        else:
            rPtr -= 1
    return maxArea      

print(containerWithMostWater([1, 8, 6, 2, 5, 4, 8, 3, 7]))