package week4.day1;
//              ChildClass      extends ParentClass
public class AxisImplementation extends Axis {

	@Override
	public void houseLoan() {
		System.out.println("50 Lakhs");
		
	}

	public void depositAmount() {
		super.depositAmount();
		System.out.println("20 Lakhs");
	}
	
	public static void main(String[] args) {
		AxisImplementation axOptions=new AxisImplementation();
		axOptions.houseLoan();
		axOptions.depositAmount();
	}
	
}
//AxisImplementation extends Axis implements RBI