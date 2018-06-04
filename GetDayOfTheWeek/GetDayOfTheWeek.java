import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GetDayOfTheWeek
{
   public static void main(String[] args)
   {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a date in ## ## #### format (no slashes!)");
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        try
        {
           String inputDate = day + "/" + month + "/" + year;
           SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
           Date dt1 = format1.parse(inputDate);
           DateFormat format2 = new SimpleDateFormat("EEEE"); 
           String finalDay = format2.format(dt1);
           
           System.out.println("The day of the week on " + inputDate + " was " + finalDay.toUpperCase());
        }
        catch(Exception e)
        {
            
        }
   }
}