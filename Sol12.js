let num = 38;

function adddigits(num) {
  if (num < 10) return num;
  let digits = String(num).split("").map(Number);
  let count = 0;
  for (let i = 0; i < digits.length; i++) {
    count += digits[i];
  }

  return adddigits(count);
}

console.log(adddigits(num));
