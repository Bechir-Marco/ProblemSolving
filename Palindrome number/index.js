// var isPalindrome = function (x) {
//   let strNum = x.toString();
//   for (let i = 0; i < strNum.length / 2; i++) {
//     if (strNum[i] !== strNum[strNum.length - 1 - i])
//     return false;
//     }
//     return true
// };


var isPalindrome = function (x) {
  let reverse =0
  
  if (x<0)
        return false
        let copy = x
    while (copy > 0) {
      let mod = copy % 10;
      reverse = reverse * 10 + mod ;
      copy = ~~(copy / 10);
    }
    return x === reverse;
};



// var isPalindrome = function (x) {
//   return x=== ~~x.toString().split("").reverse().join("")
// };
