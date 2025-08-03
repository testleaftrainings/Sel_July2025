package week3.day2;

public class ReverseString {

	public static void main(String[] args) {
		String str="July";
		
		//Method1:
		//  0   1   2   3
		//{'J','u','l','y'}  //4
		char[] charArray = str.toCharArray();
		//   3   2    1    0
		for (int i = charArray.length-1; i >=0; i--) {
			System.out.println(charArray[i]);
			//System.out.println(charArray[3]);  y
			////System.out.println(charArray[2]);  l
			//System.out.println(charArray[1]);  u
			//System.out.println(charArray[0]);  J
			
		}

		System.out.println("----------------");
		//method2:
		//length=4
	        //  0   1   2   3
			//{'J','u','l','y'}
		//3  2  1  0
		for (int i = str.length()-1; i >=0; i--) {
			System.out.print(str.charAt(i));
			//System.out.println(str.charAt(3)); //y
			//System.out.println(str.charAt(2));  //l
			//System.out.println(str.charAt(1));  //u
			//System.out.println(str.charAt(0));  //J
		}
	}

}
