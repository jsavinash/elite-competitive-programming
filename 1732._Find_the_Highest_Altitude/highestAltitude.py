def highestAltitude(list):
    maxAltitude = 0
    totalGain = 0
    for x in range(len(list)):
        totalGain += list[x]
        maxAltitude = max(maxAltitude, totalGain)
    return maxAltitude

print(highestAltitude([-5,1,5,0,-7]))