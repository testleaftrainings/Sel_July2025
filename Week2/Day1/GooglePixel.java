package week2.day1;

public class GooglePixel {

	public void takeHighQualityPhoto() {
		System.out.println("Photo");
	}

	public String makeCall() {
		return "Vineeth";
	}

	public static void main(String[] args) {
		GooglePixel pixelOptions = new GooglePixel();
		pixelOptions.takeHighQualityPhoto();
		String makeCall = pixelOptions.makeCall();
		System.out.println(makeCall);
	}

}
