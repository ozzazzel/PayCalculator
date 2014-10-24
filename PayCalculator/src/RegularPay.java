public class RegularPay extends PayCalculator {
	public RegularPay(double payRate){
		super(payRate);
	}
	@Override
	//override computePay from PayCalculator
	public double computePay(double hour){
		return(payRate*hour);
		
	}
}