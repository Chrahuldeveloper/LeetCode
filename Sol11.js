const arr = [3, 5, -2, -3, -6, -6];

let freq = {};
for (let i = 0; i < arr.length; i++) {
  if (freq[arr[i]] === undefined) {
    freq[arr[i]] = 1;
  } else {
    freq[arr[i]]++;
  }
}

let values = Object.values(freq);
values.sort((a, b) => a - b);

let count = 0;
for (let i = 0; i < values.length; i++) {
  if (values[i] == values[i + 1]) {
    count++;
  }
}

console.log(count === 0);
