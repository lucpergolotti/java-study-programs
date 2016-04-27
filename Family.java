/*
* Name: Luc Pergolotti
* tuf48949@temple.edu
* Date: 
* <assignment>
* Purpose: 
*/
public class Family {
    public double income;
    public int size;

    public Family(double income, int size) {
        this.income = income;
        this.size = size;
    }
    
    public boolean isPoor(double housingCost, double foodCost){
        if ((housingCost + foodCost)*size > income/2)
            return true;
        return false;
    }
    public String toString(){
        String info = "Income: $" + income + "Size: " + size;
        return info;
    }
}
