// var threeSum = function (nums) {
//   nums.sort((a, b) => a - b); 
//   let p = 0;
//   let p1 = 1;
//   let p2 = nums.length - 1;
//     let result = []; 
//     let arrSet = new Set()
//   while (p < p2 - 1) {
    
//     while (p1 < p2) {
//       let currentSum = nums[p] + nums[p1] + nums[p2];
//       if (currentSum === 0) {
//         let subArr = [nums[p], nums[p1], nums[p2]];
//         let subArrToString = JSON.stringify(subArr);
//         if (!arrSet.has(subArrToString)) {
//           arrSet.add(subArrToString);
//           result.push(subArr);
//         }
//         p1++;
//         p2--;
//       } else if (currentSum < 0) {
//         p1++;
//       } else {
//         p2--;
//       }
//     }
//     p++;
//     p1 = p + 1;
//     p2 = nums.length - 1;
//   }
//   return result;
// };
var threeSum = function (nums) {
  nums.sort((a, b) => a - b);
  let result = [];

  for (let i = 0; i < nums.length - 2; i++) {
    if (i > 0 && nums[i] === nums[i - 1]) {
      continue;
    }

    let lowIndex = i + 1;
    let higherIndex = nums.length - 1;

    while (lowIndex < higherIndex) {
      const sum = nums[i] + nums[lowIndex] + nums[higherIndex];

      if (sum === 0) {
        result.push([nums[i], nums[lowIndex], nums[higherIndex]]);
        lowIndex++;
        higherIndex--;

        while (
          lowIndex < higherIndex &&
          nums[lowIndex] === nums[lowIndex - 1]
        ) {
          lowIndex++;
        }
        while (
          lowIndex < higherIndex &&
          nums[higherIndex] === nums[higherIndex + 1]
        ) {
          higherIndex--;
        }
      } else if (sum < 0) {
        lowIndex++;
      } else {
        higherIndex--;
      }
    }
  }

  return result;
};

console.log(threeSum([-2,0,1,1,2]));
