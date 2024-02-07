var threeSumClosest = function (nums, target) {
  let p = 0;
  let p1 = 1;
  let p2 = nums.length - 1;
  nums.sort((a, b) => a - b);
  let sum = 0;
  let closestSum = Infinity;
  while (p < p2 - 1) {
    
    p1 = p + 1;
    p2 = nums.length - 1;
    while (p1 < p2) {
        sum = nums[p] + nums[p1] + nums[p2];
      if (sum == target) return sum;
      if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
        closestSum = sum;
      }
      if (sum > target) {
        p2--;
      } else p1++;
      }
      p++
  }
  return closestSum;
};
threeSumClosest([1, 1, 1, 0], -100);
