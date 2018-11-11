function padLeft_v1(num, size) {
    var s = num+"";
    while (s.length < size) s = "0" + s;
    return s;
}

function padLeft_v2(num, size) {
    var s = "000000000" + num;
    return s.substr(s.length - size);
}

// ... at least 1 million more variations
// of this sh** on stackoverflow et al.

console.log(padLeft_v1(9, 2));

console.log(padLeft_v2(2, 4));


// ------------------------------------------------------------------------------------------------


var r = " abc ".replace(/^\s+/g, "");
console.log(`trim right: '${r}'`);

var l = " abc ".replace(/\s+$/g, "");
console.log(`trim left: '${l}'`);

var b = " abc ".replace(/^\s+/g, "").replace(/\s+$/g, "");
console.log(`trim both: '${b}'`);


// ------------------------------------------------------------------------------------------------


// ⚠ ️Notice ...
let hearts = '❤️❤️❤heart'; // 👈🏼 emojis in comments !

console.log(hearts == '\u2764\uFE0F\u2764\uFE0F\u2764heart');
console.log(hearts.length == 8); // false !
console.log(hearts.length == 10); // true !


let single = '❤️';
console.log(single == '\u2764\uFE0F'); // true !
console.log(hearts.length == 1); // false !
console.log(hearts.length == 2); // true !