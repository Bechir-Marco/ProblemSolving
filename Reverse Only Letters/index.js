var reverseOnlyLetters = function (s) {
    function  isEnglishLetter(c){
        return ('a'<=c && c<="z") || ('A'<=c &&c<='Z')
        
    }
    let j = s.length - 1;
    let i= 0 
    let temp = ''
    let chars = s.split('')
    
   while (i<j) {
       if (!isEnglishLetter(chars[i])) {
         i++;
       }
        if (!isEnglishLetter(chars[j])) {
          j--;
        }
       if (
         isEnglishLetter(chars[i]) &&isEnglishLetter(chars[j])) {
         temp = chars[i];
         chars[i] = chars[j];
         chars[j] = temp;
         i++
         j--
       }
    }
    return chars.join('');
    
};
console.log(reverseOnlyLetters('dc-ba'));

