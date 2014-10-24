public class HazardPay extends PayCalculator {
	public HazardPay(double payRate){
		super(payRate);
	}
	@Override
	//override computePay from PayCalculator
	public double computePay(double hour){
		return payRate*hour*1.5;
		
	}
}