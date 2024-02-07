/**
 * @param {number} num
 * @param {number} k
 * @return {number}
 */
var divisorSubstrings = function (num, k) {
    const numToString = num.toString();
    let c = 0;

    for (let i = 0; i <= numToString.length - k; i++) {
        const s1 = numToString.substring(i, i + k);
        const substringInt = parseInt(s1);

        if (s1.length === k && num % substringInt === 0 && !(/^0+$/).test(substringInt)) {
            c++;
        }
    }

    return c;
};
