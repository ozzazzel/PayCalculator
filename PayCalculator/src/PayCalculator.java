
/**
* @author Oscar
* Pay caculator. when use regular pay, the pay is
* hour multiply pay rate
* when use the hazard pay, the pay is hour multiply
* pay rate multiply 1.5
*/
public abstract class PayCalculator {
double payRate;
public PayCalculator(double payRate){
this.payRate=payRate;
}
public abstract double computePay(double hour);
}