package week8.day1;

public class LearnExceptions {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(7/0);
			}
		catch(ArithmeticException exp){
			System.out.println("The execution is: "+exp);
		}
		
		try {
			int arr[]=new int[-3];
			System.out.println(arr[3]);
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("The execution is: "+e);
		}
		
		
		finally {
	   System.out.println("Report-pass/fail");
		}
		 
	}
	

}
