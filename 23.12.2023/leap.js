var year=Number(prompt("Enter the Year:"));
if((year%4==0)&&(year%100!==0)||(year%400==0))
{
	console.log(year +"is a leap year");
}
else{
	console.log(year +"is a not leap year");
}
2)
function nearest(a,b)
{
	var c=100-a;
	var d=100-b;
	if(c>d){
	    return b +" is a nearest value"	
	}
	else{
	    return a +" is a nearest value"	
	}
}
console.log(nearest(5,10));
3)...
var a=Number(prompt("Enter the first number: "));
var b=Number(prompt("Enter the second number: "));
var c=Number(prompt("Enter the third number: "));
a=a%10;
b=b%10;
c=c%10;
if(a==b && a==c){
	console.log (a,b,c +"last three digit is same");
}
else{
	console.log (a,b,c +"last three digit is not same");
}

4)
function hour(number){
	var hours=math.floor(number/60);
                   var minute=number%60;
	return hours +":" +minute;
}
console.log(hour(24));

var num=Number(prompt("Enter the number"));
var hours=math.floor(num/60);
var minute=num%60;
console.log(hours+":"+minute);

5)
function greatestNumber(array){
	array.sort(function(a,b){
	return a-b;
	});
let secondLowest=array[1];
let reverseArray=array.reverse();
let secondgreatest=reverseArray[2];
return[secondLowest,secondgreatest];
}
console.log(greatestNumber([,1,2,3,4,5]));

6)
var array=["Jothi","Tharani"];
for(i=1;i<=6;i++)
{
	if(i%2==0)
	{
		console.log(array[0]);
	}
	else if(i%2==1)
	{
		console.log(array[1]);
	}
}













