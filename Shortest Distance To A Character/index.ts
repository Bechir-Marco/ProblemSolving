function shortestToCharr(s: string, c: string): number[] {
   const n = s.length;
   const answer : number[] = [];
   let prev = -Infinity;

   for (let i = 0; i < n; i++) {
     if (s[i] === c) {
       prev = i;
     }
     answer[i] = i - prev;
   }
   prev = Infinity;

   for (let i = n - 1; i >= 0; i--) {
     if (s[i] === c) {
       prev = i;
     }
     answer[i] = Math.min(answer[i], prev - i);
   }

   return answer;
}
console.log(shortestToChar('loveleetcode', 'e'));