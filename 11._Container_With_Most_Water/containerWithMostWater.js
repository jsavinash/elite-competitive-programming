const containerWithMostWater = (waterHeight) => {
    let lPtr = 0;
    let rPtr = waterHeight.length - 1;
    let maxArea = 0;
    while (lPtr < rPtr) {
        const currentMaxArea = Math.min(waterHeight[rPtr], waterHeight[lPtr]) * (rPtr - lPtr);
        maxArea = Math.max(maxArea, currentMaxArea);
        if (waterHeight[lPtr] < waterHeight[rPtr]) {
            lPtr++;
        } else {
            rPtr--;
        }
    }
    return maxArea;
}

console.log(containerWithMostWater([1, 8, 6, 2, 5, 4, 8, 3, 7]));