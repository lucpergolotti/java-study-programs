
import java.util.Scanner;

/*
* Name: Luc Pergolotti
* tuf48949@temple.edu
* Date: 
* <assignment>
* Purpose: 
*/
public class NumberAboveAverage {
    private static int[] temps = new int[10];
    private static double avg;
    public static int[] inputTemperatures(){
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i<10; i++){
            System.out.println("Enter temperature number " + (i+1) + ":");
            int temp = keyboard.nextInt();
            temps[i] = temp;
        }
        return temps;
    }
    public static double getAverageTemp(){
        double total = 0;
        for (int i = 0; i<10; i++){
            total += temps[i];
        }
        avg = total / 10;
        return avg;
    }
    public static void printAboveAverage(){
        System.out.println("The average temperature is " + avg + "degrees.");
        System.out.println("All above average temperatures: ");
        for (int i = 0; i<10; i++){
            if (temps[i] >= avg){
                System.out.print(temps[i] + " ");
            }
        }
    }
}
