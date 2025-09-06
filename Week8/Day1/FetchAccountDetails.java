package week8.day1;

public class FetchAccountDetails {
	
	public static void main(String[] args) {
		AccountDetails acc=new AccountDetails();
		acc.get(7);
		
		int set = acc.set();
		System.out.println(set);
	}

}
