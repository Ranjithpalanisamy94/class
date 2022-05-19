package clss;

public class interface2 implements interface1 {

	@Override
	public void carloan() {
		System.out.println("8%");
	}

	@Override
	public void bikeloan() {
	System.out.println("bike loan:9%");
		
	}
	public static void main(String[] args) {
		interface2 in = new interface2();
		in.carloan();
		in.bikeloan();
		
}
}
 

