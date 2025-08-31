package week7.day2;

public class LearnConstructor {
	
	
	int number;
	String name;
	
	//Default Constructor
	public LearnConstructor() {
		System.out.println("It is from a default constructor");
	}
	
	//Paramaterized         //   7            Vineeth
	public LearnConstructor(int number,String name) {
		this();
		System.out.println("It is from a paramaterized constructor");
		this.number=number;
		this.name=name;
		          
	}
	
	

	public static void main(String[] args) {
		
		
		LearnConstructor lc1=new LearnConstructor(7,"Vineeth");
		System.out.println(lc1.number);
		System.out.println(lc1.name);

	}

}
