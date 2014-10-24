
public class CalculatorDemo {
public static void main(String[] args) {
// TODO Auto-generated method stub
	double payRate= 40; //hours
	double hour =8.5; //payment per hour
	PayCalculator regularPay = new RegularPay(payRate);
	//payment for 100 hours at 8.5 per hour
	System.out.println("The regular pay is $ "+regularPay.computePay(hour));
	PayCalculator hazardPay = new HazardPay(payRate);
	//payment with additional pay.
	System.out.println("The hazard pay is $ "+hazardPay.computePay(hour));
	
	}
}