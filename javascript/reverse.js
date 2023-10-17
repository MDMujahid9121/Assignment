let str = prompt("Please enter the sentence:");
let reversedStr = str.split(' ')
                 .map(word=>word.split('').reverse().join(''))
                 .join(' ');
console.log(reversedStr);