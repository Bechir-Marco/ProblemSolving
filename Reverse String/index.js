var reverseString = function (s) {
    
    let j = s.length -1
    let i = 0
    while (i < j) {
        let temp = s[j]
        s[j] = s[i]
         s[i]= temp
        i++
        j--
        
    }
};
reverseString('Hannnh')