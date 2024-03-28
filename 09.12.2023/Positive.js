var a=[1,2,3,4,5,6,7,8,9,10,-11,-12,-13,-14,-15];
var sum=0;
var neg=0
for(var i=0;i<a.length;i++){
 if(a[i]>0)
{
	sum=sum+a[i];
	
}
else{
	neg=neg+a[i];
}
}