class Palindrome{  
 public static void main(String args[]){  
  int r,sum=0,x;    
  int n=454;//It is the number variable to be checked for palindrome  
  
  x=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(x==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  
