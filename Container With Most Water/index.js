var maxArea = function (height) {
  let i = 0;
  let j = height.length - 1;
  let max = 0;

    while (i < j) {
     width = j-i
      const h = Math.min(height[i], height[j]);
        waterContainer = width * h
        if (max < waterContainer)max =waterContainer
        if (height[i] < height[j]) i++
        else j--
 }

  return max;
};

maxArea([1, 8, 6, 2, 5, 4, 8, 3, 7]);
