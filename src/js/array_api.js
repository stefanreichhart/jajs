var array = [ 1, 2, 3, 4, 5, 6, 7, 8, 9, NaN, Infinity, 10 ];
var subject = 10;

var test0 = array.indexOf(subject) !== -1;
var test1 = array.indexOf(subject) >= 0;
var test2 = ~array.indexOf(subject);

console.log(test0 + ", " + test1 + ", "+ test2 + "=" + !!test2);