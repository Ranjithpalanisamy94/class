package clss;

public class Desktop implements Hardware , Software {

	@Override
	public void hardwareresoures() {
    System.out.println("onnum ila");
		
	}

	@Override
	public void softwareresoures() {
		System.out.println("irruku ana ila");
		
	}
	
	public static void main(String[] args) {
		Desktop dp = new Desktop();
		dp.hardwareresoures();
		dp.softwareresoures();
		
	}

}
