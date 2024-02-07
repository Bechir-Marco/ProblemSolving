var threeSumSmaller = function (nums, target) {
  nums.sort((a, b) => a - b);
  let cpt = 0;
  let p = 0;
  let p1 = p + 1;
  let p2 = nums.length - 1;

  while (p < p2 - 1) {
    while (p1 < p2) {
      let s = nums[p] + nums[p1] + nums[p2];
      if (s < target) {
        cpt += p2 - p1;
        p1++;
      } else {
        p2--;
      }
    }
    p++;
    p1 = p + 1;
    p2 = nums.length - 1;
  }

  return cpt;
};

console.log(threeSumSmaller([1, 2, 3, 4, 5], 10));
