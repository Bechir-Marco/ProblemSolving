var countGoodSubstrings = function (s) {
    let counter = 0;
    let str = '';
    for (let i = 0; i < s.length; i++) {
        str += s[i];
        if (str.length === 3) {
            let arr = [...str];
            let mySet = new Set(arr);
            str = '';
            i = i - 2;
            if (mySet.size === 3) {
                counter++;
            }
        }
    }
    return counter;
};