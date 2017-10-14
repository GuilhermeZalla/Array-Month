package arraymonth;
 import java.util.Scanner;
  public class ArrayMonth{
           
      public static void Month(){
          
         Scanner input = new Scanner(System.in);
  
       String[] month = new String[12];
       int i;
       
        for(i = 0; i < 12; ++i){
            System.out.print("Enter the "+(i+1)+"º month of the year: ");
            month[i] = input.nextLine();     
        }
          
        for(i = 0; i < 12; ++i){
            System.out.println("The "+(i+1)+" month of the year is: "+month[i]);
        }      
   }
 
  public static void main(String[] args){
      
      System.out.print(" Months of the year program \n"
                       + "                           \n");    
                Month();
  }
 }