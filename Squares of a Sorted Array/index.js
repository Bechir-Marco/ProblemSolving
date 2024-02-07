var sortedSquares = function (nums) {
  nums.forEach((number, index) => {
    nums[index] = Math.pow(number, 2);
  });
  return nums.sort((a, b) => a - b);
};
