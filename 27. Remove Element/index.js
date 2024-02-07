var removeElement = function (nums, val) {

    let counter = 0;
    for (let i = 0; i <= nums.length; i++) {


        let index = nums.indexOf(val);
        if (index == -1) {
            return nums.length - counter;
        }

        else {
            counter++;
            nums.splice(index, 1);
            nums.push("_");
        }
    }

};