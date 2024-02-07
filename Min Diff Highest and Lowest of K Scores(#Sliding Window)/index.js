var minimumDifference = function (nums, k) {
    if (nums.length < k) {
        return 0;
    }

    nums.sort((a, b) => a - b);
    let lowest = Infinity;

    for (let i = 0; i <= nums.length - k; i++) {
        const diff = nums[i + k - 1] - nums[i];
        lowest = Math.min(diff, lowest);
    }

    return lowest;
};
