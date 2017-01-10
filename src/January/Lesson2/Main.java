package January.Lesson2;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[]args)
    {
        Boolean test = true;
        String stop = "STOP";
        ArrayList<String> arrayList = new ArrayList <> ();
        ArrayList<String> wordswitha = new ArrayList<>();
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
        for (String s: arrayList) {
            if(s.contains("a"))
            {
                wordswitha.add(s);
            }
        }
        System.out.println(wordswitha);
    }
}
