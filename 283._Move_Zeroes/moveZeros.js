const moveZeros = (nums) => {
    if (nums == null || nums.length == 0) {
        return;
    }
    let currentElement = 0;
    let countZero = 0;
    for (var i = 0; i < nums.length; i++) {
        if (nums[i] !== 0) {
            nums[currentElement] = nums[i];
            currentElement++;
        } else {
            countZero++;
        }
    }
    for (var j = nums.length - countZero; j < nums.length; j++) {
        nums[j] = 0;
    }

    return nums;
};
console.log("moveZeros => ", moveZeros([0, 1, 0, 3, 12]));