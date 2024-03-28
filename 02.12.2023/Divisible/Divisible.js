function Divisible(){
     var a=Number(document.getElementById("num1").value);
    
     if(a%3==0 && a%5==0)
    {
        document.getElementById("answer").value="Divisible By 3&5";	
     }
     else if(a%3==0){
               document.getElementById("answer").value="Divisible by 3";
      }
       else if(a%5==0){
               document.getElementById("answer").value="Divisible by 5";
      }
      else{
	 document.getElementById("answer").value=" Not Divisible 3& 5";
}
}
