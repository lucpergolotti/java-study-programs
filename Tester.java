
import java.util.Scanner;

/*
* Name: Luc Pergolotti
* tuf48949@temple.edu
* Date:
* <assignment>
* Purpose:
*/
public class Tester {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean isExited = false;
        System.out.println("Enter a maximum number of sales to be made.");
        int max = keyboard.nextInt();
        Ledger ledgerObject = new Ledger(max);
        do{
            System.out.println("Pick an option");
            System.out.println("1. Add Sale");
            System.out.println("2. Get number of sales made");
            System.out.println("3. Get total income from all sales.");
            System.out.println("4. Get average of all sales.");
            System.out.println("5. Get number of sales valued higher than"
                    + " specified number");
            System.out.println("6. Check if the values are strictly increasing.");
            System.out.println("7. Exit");
            int option = keyboard.nextInt();
            switch (option){
                case 1:
                    System.out.print("Enter the amount paid: ");
                    double d = keyboard.nextDouble();
                    ledgerObject.addSale(d);
                    break;
                case 2:
                    System.out.println("Total number of sales: "
                            + ledgerObject.getNumberOfSales());
                    break;
                case 3:
                    System.out.println("Total income accumulated: "
                            + ledgerObject.totalSales());
                    break;
                case 4:
                    System.out.println("Average price of sales: "
                            + ledgerObject.getAverageSale());
                    break;
                case 5:
                    System.out.println("Value to check against: ");
                    double value = keyboard.nextInt();
                    System.out.println("There are " + ledgerObject.getCountAbove(value)
                            + " sales above this value.");
                case 6:
                    if(ledgerObject.isStrictlyIncreasing())
                        System.out.println("The only increase.");
                    else
                        System.out.println("The values are not strictly increasing.");
                    break;
                case 7:
                    isExited = true;
                    break;
            }
        }while(isExited == false);
    }

}
