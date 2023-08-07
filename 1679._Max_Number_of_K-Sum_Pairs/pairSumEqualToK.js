const pairSumEqualToK = (arr, k) => {
    const hash = {};
    let noOfPairs = 0;
    for (let i = 0; i < arr.length; i++) {
        if (hash[k - arr[i]]) {
            noOfPairs++;
            hash[k - arr[i]]--;
        } else {
            !hash[arr[i]] ? hash[arr[i]] = 1 : hash[arr[i]]++;
        }
    }
    return noOfPairs;
}
console.log("pairSumEqualToK", pairSumEqualToK([1,2,3,4], 5));