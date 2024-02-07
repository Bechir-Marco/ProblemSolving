function shortestToChar(s, c) {
  const n = s.length;
  const answer = [];
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

const s = 'loveleetcode';
const c = 'e';
const result = shortestToChar(s, c);
console.log(result); // Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
