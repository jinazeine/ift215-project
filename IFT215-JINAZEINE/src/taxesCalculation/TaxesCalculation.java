
package taxesCalculation;

public class TaxesCalculation {
    private int yearlySalary;
    private boolean married;
    private int nbKids;
   

public TaxesCalculation (int yearlySalary, boolean married, int nbKids){
    this.yearlySalary=yearlySalary;
    this.married=married;
    this.nbKids=nbKids;
    
}
public int getYearlySalary(){
    return yearlySalary;
}
public void setYearlySalary(int yearlySalary){
   this.yearlySalary=yearlySalary;
}

public boolean hasMarried(){
    return married;
}
public void setMarried(boolean married){
    this.married=married;
}
public int getNbKids(){
    return nbKids;
}
public void setNbKids(int nbKids){
    this.nbKids=nbKids;
}

public int getTaxesAmount(){
    int taxesAmount;
    int taxedAmount;
    int abatement;
    int newTaxedAmount;
    int tax;
    if (married==true){
        abatement=7500000+2500000+nbKids*500000;
    } else{
        abatement=7500000;
    }
    taxedAmount=yearlySalary-abatement;
    
    if (taxedAmount>6000000){
        tax=6000000*2/100;
        newTaxedAmount=taxedAmount-6000000;
    } else { taxesAmount=0;}
    if (newTaxedAmount>9000000){
        tax=9000000*4/100;
        newTaxedAmount=taxedAmount-(6000000+9000000);
            
    } else {tax=newTaxedAmount}
    
      
        
            
       
        
    
    
  return taxesAmount;
}
}


