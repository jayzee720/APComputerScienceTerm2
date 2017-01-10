package January.Lesson1;

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
        ArrayList <String> arrayList = new ArrayList <> ();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter words, enter STOP to stop the loop.");
        while(test)
        {
            String curinput = scan.nextLine();
            if(curinput.compareTo(stop) == 0)
            {
                test = false;
            }
            else if(curinput.compareTo(stop) != 0)
            {
                arrayList.add(curinput);
            }
        }
        System.out.println(arrayList.size());
        System.out.print(arrayList);
        if(arrayList.size() > 2)
        {
            arrayList.remove(1);
            arrayList.remove(arrayList.size());
        }
        System.out.println(arrayList);

    }
}
