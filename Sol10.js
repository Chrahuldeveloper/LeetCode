let nums1 = [-80, -15, -81, -28, -61, 63, 14, -45, -35, -10];
let nums2 = [-1, -40, -44, 41, 10, -43, 69, 10, 2];

let onlyInNums1 = [];
let onlyInNums2 = [];

for (let i = 0; i < nums1.length; i++) {
  if (!nums2.includes(nums1[i]) && !onlyInNums1.includes(nums1[i])) {
    onlyInNums1.push(nums1[i]);
  }
}

for (let i = 0; i < nums2.length; i++) {
  if (!nums1.includes(nums2[i]) && !onlyInNums2.includes(nums2[i])) {
    onlyInNums2.push(nums2[i]);
  }
}

console.log([onlyInNums1, onlyInNums2]);
