var replaceElements = function (arr) {
  let findMax = (arr) => {
    let max = 0;
    for (let i = 0; i < arr.length; i++) {
      if (arr[i] >= max) max = arr[i];
    }
    return max;
  };
  let finalArray = [];
  let counter = arr.length;
  if (arr.length == 1) {
    arr.splice(0, 1);
    finalArray.push(-1);

    return finalArray;
  } else
    while (counter >= 1) {
      arr.splice(0, 1);
      max = findMax(arr);
      finalArray.push(max);
      counter--;
      if (counter == 1) {
        finalArray.push(-1);
        break;
      }
    }
  return finalArray;
};


