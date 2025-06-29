const nums = [1, 0, 0, 1];
const freqMap = new Map();

for (const num of nums) {
  freqMap.set(num, (freqMap.get(num) || 0) + 1);
}

const isPrime = (n) => {
  if (n < 2) {
    return false;
  }
  for (let i = 0; i * i < n; i++) {
    if (n % i == 0) {
      return false;
    }
  }
  return true;
};

for (const count of freqMap.values()) {
  if (!isPrime(count)) {
    console.log(false);
    break;
  }
}

console.log(true);
