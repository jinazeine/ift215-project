
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
    int t1,t2,t3,t4,t5,t6,t7,t8;
    if (married==true){
        abatement=7500000+2500000+nbKids*500000;
    } else{
        abatement=7500000;
    }
    taxedAmount=yearlySalary-abatement;
    
  
    if (taxedAmount>120000000){
        t1=6000000*(2/100);
        newTaxedAmount=taxedAmount-6000000;
        t2=9000000*(4/100);
        newTaxedAmount=taxedAmount-9000000;
        t3=15000000*(7/100);
        newTaxedAmount=taxedAmount-15000000;
        t4=30000000*(11/100);
        newTaxedAmount=taxedAmount-30000000;
        t5=60000000*(15/100);
        newTaxedAmount=taxedAmount-60000000;
        t6=newTaxedAmount*(20/100);
        
   
   }
   
   
      
        
            
       
        
    
    
  return taxesAmount;
}
}


