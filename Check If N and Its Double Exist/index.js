var checkIfExist = function (arr) {
   
    let mySet = new Set();
    for (let i = 0; i < arr.length; i++)  {
        if (mySet.has(arr[i] * 2) || mySet.has(arr[i] / 2)) {
           return true 
        }
        mySet.add(arr[i])
    }
    return false 
};
checkIfExist([10,2,5,3])
