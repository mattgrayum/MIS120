import java.util.Scanner;

public class ConvertHexToDec
{
   public static void main(String[] args)
   {
      //Gets a hexadecimal number from the user and converts it to a decimal number
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a hexadecimal value: ");
      String hexString = (input.nextLine()).toUpperCase();
      
      if(isValidHexadecimalNumber(hexString))
      {
         System.out.println("The hexadecimal value " + hexString + 
                            " converted to a decimal value is " + 
                            convertHexStringToDecimal(hexString));
      }                       
   }
   
   public static long convertHexStringToDecimal(String str)
   {
      long decimalTotal = 0;
      int length = str.length();
      int i, j; 
      int[] intArray = new int[length]; 
      
      //convert string to integer array
      for(i = 0; i < length; i++)
      {
         switch (str.charAt(i))
         {
            case 'A': intArray[i] = 10; break;
            case 'B': intArray[i] = 11; break; 
            case 'C': intArray[i] = 12; break; 
            case 'D': intArray[i] = 13; break; 
            case 'E': intArray[i] = 14; break; 
            case 'F': intArray[i] = 15; break; 
            default:
               intArray[i] = Character.getNumericValue(str.charAt(i));
               break;                 
         }
      }
      //iterate backward through integer array, from right to left, to accumulate decimal value
      for(i = (length - 1), j = 0; i >= 0; i--, j++)
      {
         decimalTotal += intArray[i] * Math.pow(16, j);   
      }
      return decimalTotal; 
   }
   
   public static boolean isValidHexadecimalNumber(String hexStr)
   {
      boolean isValid = true;
      
      for(int i = 0; i < hexStr.length() && isValid == true; i++)
      {
         int num = (int)hexStr.charAt(i); //convert char to ASCII int equivalent
         
         if((num >= 48 && num <= 57) ||   //must be digit 0-9 or letters A-F or a-f
            (num >= 65 && num <= 70) || 
            (num >= 97 && num <= 102))  
         {
            isValid = true;
         }
         else 
         {
            isValid = false;
            System.out.println("**ERROR** Invalid hexidecimal value.");
         }     
      }
      return isValid;   
   }
}