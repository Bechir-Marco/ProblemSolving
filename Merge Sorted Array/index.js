// var merge = function (nums1, m, nums2, n) {
//   let i = 0
//   let j = 0
//   while (i < m) {
//     j=0
//     while (j<n) {
//       if (nums1[i] > nums2[j]) {
//         let temp = nums1[i]
//         nums1[i] = nums2[j]
//         nums2[j] = temp
//         j++
//       }else j++
//     }
//     i++
//   }
//   let cpt =0
//   while (cpt <  n) {
//     nums1[m + cpt] = nums2 [cpt]
//     cpt++
//   }
//   nums1.sort((a, b) => a - b)
//   return nums1
// };


//Another Sol To Use 3 Pointers
var merge = function (nums1, m, nums2, n) { 
  let p = m-1
  let p1 = m +n -1
  let p2 = n - 1
  if (m ==0) nums1[p]= nums2[0]
  while (p2 >= 0) {
    if (nums2[p2] > nums1[p]) {
      nums1[p1] = nums2[p2]
      p2--
      p1--
    } else {
      let temp = nums1[p]
      nums1[p] = nums2[p2]
      nums1[p1] = temp
      p2--
      p1--
      
    }
  }
  nums1.sort((a,b) =>a-b)
};
merge([4, 5, 6, 0, 0, 0], 3, [1, 2, 3], 3);
