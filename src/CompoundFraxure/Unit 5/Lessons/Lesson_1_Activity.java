package Unit

import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
public class Lesson_1_Activity {

	/**
	* @param args
    */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
        ArrayList <String> list = new ArrayList ();
        System.out.println("Please enter words, enter STOP to stop the loop.");
        String s = "null";
        int i = 0;
        while (!(s.equals("STOP"))) {
            s = scan.nextLine();
            list.add(s);
            i++;
        }
        
        list.remove(i-1);
        
        System.out.println(list.size());
        System.out.println(list);
        if (list.size() > 2) {
            list.remove(0);
            list.remove(list.size()-1);
            System.out.println(list);
        }
        
    }

}