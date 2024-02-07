/*/*//* Brute Force Solution /**** */



// function longestNiceSubstring(s) {
//     let  isNice = (sub) => {
//         for (let c of sub) {

//             if (!sub.includes(c.toLowerCase()) || !sub.includes(c.toUpperCase())) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     let longest = "";

//     for (let i = 0; i < s.length; i++) {
//         for (let j = i + 1; j <= s.length; j++) {
//             substring = s.substring(i, j);
//             console.log('j', j);
//             console.log('i', i);
//             if (isNice(substring)) {
//                 longest = substring.length > longest.length ? substring : longest;
//                 console.log('sub', substring);
//                 console.log('l', longest);
//             }
//         }
//     }

//     return longest;
// }



/********* O(n) Solution  *************************/
function longestNiceSubstring(s) {
    if (s.length < 2) return '';
    let arr = [...s];
    let mySet = new Set(arr);
    // for (let c of s) {
    //     mySet.add(c)
    // }
    for (let i = 0; i < s.length; i++) {
        let upper = s[i].toUpperCase();
        let lower = s[i].toLowerCase();
        if (mySet.has(upper) && mySet.has(lower)) continue;

        let strin1 = longestNiceSubstring(s.substring(0, i));
        let strin2 = longestNiceSubstring(s.substring(i + 1));


        return strin2.length > strin1.length ? strin2 : strin1;


    }
    return s;
}
