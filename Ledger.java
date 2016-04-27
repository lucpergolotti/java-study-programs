/*
* Name: Luc Pergolotti
* tuf48949@temple.edu
* Date: 
* <assignment>
* Purpose: 
*/
public class Ledger {
    private static double[] sale;
    private static int salesMade = 0, maxSales;
    
    public Ledger(int max){
        sale = new double[max];
        maxSales = max;
    }
    
    public static void addSale(double d){
        if(salesMade < maxSales){
            sale[salesMade] = d;
            salesMade++;
        }
        else{
            System.out.println("Cannot add sale, reached maximum.");
        }
    }
    public static int getNumberOfSales(){
        return salesMade;
    }
    public double totalSales(){
        double total = 0;
        for(int i = 0; i < salesMade; i++){
            total += sale[i];
        }
        return total;
    }
    public double getAverageSale(){
        double total = totalSales();
        double avg = total / salesMade;
        return avg;
    }
    public int getCountAbove(double v){
        int count = 0;
        for(int i = 0; i < salesMade; i++){
            if (v < sale[i]){
                count++;
            }
        }
        return count;
    }
}
