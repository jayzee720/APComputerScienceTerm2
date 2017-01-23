/*
 * AP CS MOOC
 * Term 2 - Assignment 1: Time
 * A class which represents the time of day in hours and seconds.
 */
package January.Assignment1;

public class Time
{
     private int hour;
     private int minute;     
     
     /* Complete required constructors and methods here */
     
     /* i give it five minutes until ben gets up and yells WHO THE FUCK IS WHISTLING
      *Default constructor that sets time to 0000.  
      */ 
     public Time()
     {
         hour = 0;
         minute = 0;
     }
     
     /*
      * If h is between 1 and 23 inclusive, set the hour to h. 
      * Otherwise, set the hour to 0. If m is between 0 and 59 inclusive, 
      * set the minutes to m. Otherwise, set the minutes to 0. 
      */ 
     public Time(int h, int m)
     {
        if(h<1 || h>23)
            h = 0;
         else
            h = hour;
         if(m<0 || m>59)
             m = 0;
         else
             m = minute;

     }
     
     /* Returns the time as a String of length 4 in the format: 0819. 
      * Notice that if the hour or minute is one digit, it should 
      * print a zero first. For example, 6 should print as 06.
     */
     public String toString()
     {
         String hours = "";
         String minutes = "";
         switch (hour)
         {
             case 1 : hours = "01";
             case 2 : hours = "02";
             case 3 : hours = "03";
             case 4 : hours = "04";
             case 5 : hours = "05";
             case 6 : hours = "06";
             case 7 : hours = "07";
             case 8 : hours = "08";
             case 9 : hours = "09";
             case 10 : hours = "10";
             case 11 : hours = "11";
             case 12 : hours = "12";
         }
         switch (minute)
         {
             case 1 : minutes = "01";
             case 2 : minutes = "02";
             case 3 : minutes = "03";
             case 4 : minutes = "04";
             case 5 : minutes = "05";
             case 6 : minutes = "06";
             case 7 : minutes = "07";
             case 8 : minutes = "08";
             case 9 : minutes = "09";
             default: minutes = Integer.toString(minute);
         }

         return hours.concat(minutes);
     }
     
     /*
      * Returns the time as a String converted from military time 
      * to standard time. For example, 0545 becomes 5:45 AM and 
      * 1306 becomes 1:06 PM.
      */ 
     public String convert()
     {
         boolean pm = false;
         if(hour > 12)
         {
             pm = true;
         }
         return "";
     }
     
    /*
     * Advances the time by one minute. 
     * Remember that 60 minutes = 1 hour. 
     * Therefore, if your time was 0359, and you add one minute, 
     * it becomes 0400. 2359 should increment to 0000.
     */ 
    public void increment()
    {
      
    }
      
}