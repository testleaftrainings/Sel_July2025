package week2.day1;

public class Access1 {
	
	public void depositAmount() {
		System.out.println("Amount deposited");
	}
	
	private void withdrawAmount() {
		System.out.println("Amount withdrawn");
	}
	
	public static void main(String[] args) {
		Access1 accessOptions=new Access1();
		
		accessOptions.depositAmount();
		accessOptions.withdrawAmount();
	}

}
