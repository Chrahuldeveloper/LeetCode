const arr = [6,5,5];
const freq = {};

for (let num of arr) {
  freq[num] = (freq[num] || 0) + 1;
}


const majority = Math.floor(arr.length/2)

for (let key in freq) {
  if (freq[key] > majority) {
    console.log(`${key}`);
  }
}
