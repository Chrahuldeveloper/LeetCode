const s = ""
const t = "y"

const set = s.concat(t).split("").sort()

for (let i = 0; i < set.length; i += 2) {
  if (set[i] !== set[i + 1]) {
    console.log(set[i]);
    break; 
  }
}

