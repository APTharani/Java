function addition()
{
     var a=Number(document.getElementById("num1").value);
     var b=Number(document.getElementById("num2").value);
     document.getElementById("answer").value=a+b;
}
function Subtraction()
{
     var a=Number(document.getElementById("num1").value);
     var b=Number(document.getElementById("num2").value);
     document.getElementById("answer").value=a-b;
}
function Multiplication()
{
     var a=Number(document.getElementById("num1").value);
     var b=Number(document.getElementById("num2").value);
     document.getElementById("answer").value=a*b;
}
function Division()
{
     var a=Number(document.getElementById("num1").value);
     var b=Number(document.getElementById("num2").value);
     document.getElementById("answer").value=a/b;
}
function Power()
{
     var a=Number(document.getElementById("num1").value);
     var b=Number(document.getElementById("num2").value);
     document.getElementById("answer").value=a**b;
}