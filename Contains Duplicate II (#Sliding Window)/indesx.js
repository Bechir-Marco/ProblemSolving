var containsNearbyDuplicate = function (nums, k) {
    let myMap = new Map();
    
    for (let i = 0; i <= nums.length; i++) {
        
        if (myMap.has(nums[i])) {
            let check = Math.abs(myMap.get(nums[i]) - i)
            if (check<= k)
                return true
            else {
                myMap.set(nums[i], i);

            }
        }
        else {
            myMap.set(nums[i], i);
            
        }
    }
    return false 
};
containsNearbyDuplicate([1, 0, 1, 1],1)