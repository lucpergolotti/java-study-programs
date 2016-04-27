
import java.util.Scanner;

/*
* Name: Luc Pergolotti
* tuf48949@temple.edu
* Date: 
* <assignment>
* Purpose: 
*/
public class CountPoor {
    private static int k;
    private static Family[] families;
    
    public static void createArray(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many families: ");
        k = keyboard.nextInt();
        families = new Family[k];
        for(int i = 0; i<k; i++){
            System.out.println("Enter the total income for family " + (i+1));
            double income = keyboard.nextDouble();
            System.out.println("Enter the size of family " + (i+1));
            int size = keyboard.nextInt();
            families[i] = new Family(income, size);
        }
        for(int i = 0; i<k; i++){
            System.out.println("Enter the average housing cost for family " + (i+1));
            double housing = keyboard.nextDouble();
            System.out.println("Enter the average food cost of family " + (i+1));
            double food = keyboard.nextDouble();
            if (families[i].isPoor(housing, food))
                System.out.println("This family is poor.");
            else
                System.out.println("This family is not poor.");
            
            }
        }
    }
    
    
