package week3.day2;
//             Child    extends   Parent
public class LaunchEdge extends LaunchChrome {
	
	
	public void launchBrowser() {
		
		System.out.println("Edge launched successfully");
		super.launchBrowser();
	}
	
	public static void main(String[] args) {
		LaunchEdge edgeOptions=new LaunchEdge();
		edgeOptions.launchBrowser();
	}

	
}
