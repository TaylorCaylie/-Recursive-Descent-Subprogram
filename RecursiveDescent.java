//Caylie Taylor
//CAT180006
//cs 4337.403
package hw5;

import java.util.*;
import java.io.FileNotFoundException;

public class Hw5 {

  
    public static void main(String[] args) throws FileNotFoundException {
        int counter = 0;
        
        String input = "do {    if ( number % 2 == 0 )        even ++;     number = number + 1;  }  while ( number <= 10 )";
        
        
           for (int i=0; i < input.length(); i++){
           
            if(input.charAt(i)=='{'){
                counter++;
                    System.out.println("Next Token Is: " + counter + ":\n" + "Next lexeme is: " + input.charAt(i));
                   
                    System.out.println("Enter <exp>");
                    System.out.println("Enter <term>");
                    System.out.println("Enter <factor>");
                    
                    System.out.println("\n");
                   // break;
            }
            
            if(input.charAt(i)=='}'){
                counter++;
                     System.out.println("Next Token Is: " + counter + ":\n" + "Next lexeme is: " + input.charAt(i));
                    
                    System.out.println("Enter <factor>");
                    System.out.println("Enter <term>");
                     System.out.println("Enter <exp>");
                      System.out.println("\n");
                   // break;
            }
                
                if(input.charAt(i)=='('){
                counter++;
                     System.out.println("Next Token Is: " + counter + ":\n" + "Next lexeme is: " + input.charAt(i));
                    
                    System.out.println("Enter <exp>");
                    System.out.println("Enter <term>");
                    System.out.println("Enter <factor>");
                    //break;
                     System.out.println("\n");
            }
                
               if(input.charAt(i)==')'){
                counter++;
                     System.out.println("Next Token Is: " + counter + ":\n" + "Next lexeme is: " + input.charAt(i));
                   
                    System.out.println("Enter <factor>");
                    System.out.println("Enter <term>");
                     System.out.println("Enter <exp>");
                      System.out.println("\n");
                    //break;
            }
                if(input.charAt(i)==';'){
                counter++;
                System.out.println("Next Token Is: " + counter + ":\n" + "Next lexeme is: " + input.charAt(i));
                   
                    System.out.println("Exit <factor>");
                    System.out.println("Exit <term>");
                     System.out.println("\n");
                    //break;
            }
               if(input.charAt(i)=='+'){
                
                   if(input.charAt(i+1)=='+'){
                       counter++;
                    System.out.println("Next Token Is: " + counter + ":\n" + "Next lexeme is: " + input.charAt(i)  + input.charAt(i+1));
                    ;
                    System.out.println("Exit <factor>");
                    System.out.println("Exit <term>");
                    System.out.println("\n");
                   }else{
                       counter++;
                       System.out.println("Next Token Is: " + counter + ":\n" + "Next lexeme is: " + input.charAt(i));
                  
                  System.out.println("Exit <factor>");
                    System.out.println("Exit <term>");
                    System.out.println("\n");
                   }
                  //  break;
            }
                
               if(input.charAt(i)=='-'){
                    counter++;
                    System.out.println("Next Token Is: " + counter + ":\n" + "Next lexeme is: " + input.charAt(i));
                    
                    System.out.println("Exit <factor>");
                    System.out.println("Exit <term>");
                    System.out.println("\n");
                  //  break;
            }
              
                if(input.charAt(i)=='%'){
                counter++;
                   System.out.println("Next Token Is: " + counter + ":\n" + "Next lexeme is: " + input.charAt(i));
                   
                   System.out.println("Exit <factor>");
                    System.out.println("Exit <term>");
                    System.out.println("\n"); 
                   // break;
            }
                    
                if(input.charAt(i)=='='){
          
                 if(input.charAt(i+1)=='='){
                     counter++;
                   System.out.println("Next Token Is: " + counter + ":\n" + "Next lexeme is: " + input.charAt(i) + input.charAt(i+1));
                   
                   System.out.println("Exit <factor>");
                    System.out.println("Exit <term>");
                    System.out.println("\n");
                 }else{
                     counter++;
                    System.out.println("Next Token Is: " + counter + ":\n" + "Next lexeme is: " + input.charAt(i));
                 
                 System.out.println("Exit <factor>");
                    System.out.println("Exit <term>");
                    System.out.println("\n");
                 }
                 
                
                   
            }
                    
            if(input.charAt(i)==' '){

              }
            
            if(Character.isLetter(input.charAt(i))){
                counter++; 
                System.out.println("Next Token is: " + counter + "\n" + "Next Lexime is:");
                
                  
                  while((Character.isLetter(input.charAt(i)))){
                      System.out.print(input.charAt(i));
                      i++;
                  }
                  System.out.println("\n");
                  System.out.println("Exit <term>");
                  System.out.println("Exit <factor>");
                  
                 System.out.println("\n");
             
            }
            
            
            if(Character.isDigit(input.charAt(i))){
                counter++; 
               
                System.out.println("Next Token is: " + counter + "\n" + "Next Lexime is:");
                  
                  while((Character.isDigit(input.charAt(i)))){
                      System.out.print(input.charAt(i));
                      i++;
                  }
                  System.out.println("\n");
                  
              System.out.println("Exit <term>");
               System.out.println("Exit <factor>");
                System.out.println("\n");
            }
               
            }
          
            
        

      System.out.print("Total count:" + counter);
}
        
    }
    
   

    
   


