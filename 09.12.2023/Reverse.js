function reverse(n){
    n=n+"";
    return n.split("").reverse().join("");
}
console.log(reverse(56789));

var a=Number(prompt("Enter the Number"));
a=a+"";
var b=a.split("").reverse().join("");
console.log(b);