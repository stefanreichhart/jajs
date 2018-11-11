// (\d{4})-(\d{2})-(\d{2});
let regex = /(?<year>\d{4})-(?<month>\d{2})-(?<day>\d{2})/u;
let result = regex.exec('2015-01-02');

console.log(result); // object (but looks like array in console)

console.log("date=  " + result[0]);
console.log("year=  " + result[1]);
console.log("month= " + result[2]);
console.log("day=   " + result[3]);


// ------------------------------------------------------------------------------------------------


const regexGreekSymbol = /\p{Script=Greek}/u;
var test = regexGreekSymbol.test('π');

console.log(test);