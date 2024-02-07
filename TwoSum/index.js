// var twoSum = function (nums, target) {
//     for (let i = 0; i < nums.length; i++) {
//         for (let j = i + 1; j < nums.length; j++) {
//             if (nums[i] + nums[j] === target) {
//                 return [i, j];
//             }
//         }
//     }
// };

// Optimal Solution O(n)

var twoSum = function (nums, target) {
  let map = new Map();
  for (let i = 0; i < nums.length; i++) {
    let val = target - nums[i];
      if (map.has(val)) {
      return [map.get(val), i];
    }
      map.set(nums[i],i);
  }
};

console.log(twoSum([3,2,4],6)           )

