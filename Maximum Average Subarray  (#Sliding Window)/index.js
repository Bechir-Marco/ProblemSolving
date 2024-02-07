var findMaxAverage = function (nums, k) {
    let windowStart = 0;
    let max = -Infinity;
    let sumSoFar = 0;
    for (let windowEnd = 0; windowEnd < nums.length; windowEnd++) {
        sumSoFar += nums[windowEnd];

        if (windowEnd - windowStart === k - 1) {
            let aavg = sumSoFar / k;
            max = Math.max(max, aavg);
            sumSoFar -= nums[windowStart];
            windowStart++;
        }

    }
    return max;
};
