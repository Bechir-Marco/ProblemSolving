var removeDuplicates = function (nums) {
  let set = new Set(nums);
  nums.length = 0;
  nums.push(...set.values());
  console.log(nums);
  return set.size;
};
removeDuplicates([0,1,1,2,2,3,4,4])
