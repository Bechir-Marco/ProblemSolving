var minimumRecolors = function (blocks, k) {
    
    l = blocks.length
    let min =Infinity
    let cW =0
    for (let i = 0; i <= l-k ; i++) {
        console.log('block',blocks);
        let s = blocks.substring(i, k+i)
        console.log(s);
        for (let j = 0; j < s.length; j++) {
            if (s[j]==='W')
            cW++
        }
        if (min > cW) min = cW
        cW = 0
        s=''

    }
    return min
};
minimumRecolors("WBBWWBBWBW",7)