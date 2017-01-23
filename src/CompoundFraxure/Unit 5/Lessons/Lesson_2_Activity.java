package Unit

import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
public class Lesson_2_Activity {

	/**
	* @param args
    */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
        ArrayList <String> list = new ArrayList ();
        System.out.println("Please enter words, enter STOP to stop the loop.");
        String s = "null";
        while (!(s.equals("STOP"))) {
            s = scan.nextLine();
            list.add(s);
        }
        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1));
        list.remove(1);
        System.out.println(list.get(1));
        
        for (String r: list) {
            for (int j = 0; j < r.length(); j++) {
                if (r.charAt(j) == 'a') {
                    System.out.println(r);
                    break;
                }
            }
        }
    }

}