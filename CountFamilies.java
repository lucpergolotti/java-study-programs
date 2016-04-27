
import java.util.Scanner;

/*
* Name: Luc Pergolotti
* tuf48949@temple.edu
* Date: 4/27/16
* Purpose: Get the bottom ten percent of incomes entered by user.
*/
public class CountFamilies {
    public static double[] incomes;
    public static int k, count;
    public static double tenPercent;
    
    public static void inputIncomes(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many incomes would you like to compare: ");
        k = keyboard.nextInt();
        incomes = new double[k];
        for (int i = 0; i < k; i++){
            System.out.println("Enter income number " + (i+1) + ":");
            double income = keyboard.nextDouble();
            incomes[i] = income;
        }
    }
    private static double getMax(){
        double maxValue = Double.MIN_VALUE;
        for (int i = 0; i < k; i++){
            if (incomes[i] > maxValue){
                maxValue = incomes[i];
                count = i;
            }
        }
        return maxValue;
    }
    
    public static void findBottomTen(){
        tenPercent = (getMax() / 100) * 10;
        System.out.println("The bottom ten percent of incomes are: ");
        for (int i = 0; i < k; i++){
            if (incomes[i] < tenPercent){
                System.out.print(incomes[i] + " ");
            }
        }
    }
}

