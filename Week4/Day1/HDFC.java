package week4.day1;

public class HDFC implements RBI{

	public void mandatoryKYC() {
		System.out.println("Pan Card");
		
	}
	
	public void depositAmount() {
		System.out.println("1 Lakh");
		
	}
	
	public static void main(String[] args) {
		HDFC hdfcOptions=new HDFC();
		hdfcOptions.mandatoryKYC();
	}

	
}
