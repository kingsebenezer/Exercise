
import java.io.*;
public class prime {    
    
     public static void main (String[] args)
   {		
       int i =0,j,value;    
       
       System.out.println("Prime numbers 20 to 100 are :");

       for (i = 20; i <= 100; i++)         
       { 		  	  
                
           value = 1; 
          for(j=2; j<=i/2; j++)
         {            
            if(i%j==0)
            {
                value = 0;
                break;
            }
          }
          if(value==1)
          {
            System.out.print(i + " ");
          }
       
        }
  
}
}
