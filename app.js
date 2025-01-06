const nums = [0, 2, 1, 5, 3, 4];

let ans = [];
for (let i = 0; i < nums.length; i++) {
  let indexValue = nums[i];
  let element = nums[indexValue];
  ans[i] = element;
}
console.log(ans);
