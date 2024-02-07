var isValid = function (s) {
  let myMap = new Map();
  myMap.set("(", ")");
  myMap.set("[", "]");
  myMap.set("{", "}");

  let stack = [];
  for (i in s) {
    if (myMap.has(s[i])) {
      stack.push(s[i]);
    } else if (myMap.get(stack.pop()) != s[i]) return false;
  }
  return stack.length === 0;
};
