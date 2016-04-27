
import java.util.Arrays;
import java.util.Scanner;

/*
* Name: Luc Pergolotti
* tuf48949@temple.edu
* Date: 
* <assignment>
* Purpose: 
*/
public class CharacterFrequency {
    public static String number;
    public static int[] counts = new int[10];
    
    public static void getFrequency(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a 9 digit phone number");
        number = keyboard.next();
        for(int i = 0; i < 9; i++){
            for (int j = 48; j < 59; j++)
                if(((int)number.charAt(i)) == j){
                    counts[j-48]++;
                }
        }
        System.out.println(Arrays.toString(counts));
    }
}
