package week4.day1;

public class SBI implements RBI {

	public void mandatoryKYC() {
		System.out.println("Aadhar Card");
		
	}
	
	public void depositAmount() {
		System.out.println("2 Lakhs");
		
	}
	
	public static void main(String[] args) {
		SBI sbiOptions=new SBI();
		sbiOptions.mandatoryKYC();
	}

	

}
