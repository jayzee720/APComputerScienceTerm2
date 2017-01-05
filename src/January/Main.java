package January;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by andrewrusso on 1/5/17.
 */
public class Main {
    public static void main(String[]args)
    {
        Boolean test = true;
        String stop = "STOP";
        while(test == true)
        {
            ArrayList <String> arrayList = new ArrayList <> ();
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter words, enter STOP to stop the loop.");
            if(scan.nextLine().compareTo(stop) == 0)
            {
                System.out.print("asdfasd");
            }
        }
    }
}
