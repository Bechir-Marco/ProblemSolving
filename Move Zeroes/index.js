var moveZeroes = function (nums) {
    leftPointer = 0 
    for (let i = 0; i < nums.length; i++) {
        if (nums[i] !== 0) {
            nums[leftPointer]= nums[i]
            leftPointer++;
        }
    }
    for (let i = leftPointer; i < nums.length; i++) {
        nums[i]=0
    }


};
