package Method_Overridding;

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AXIS a=new AXIS();
		System.out.println("AXIS interest rate :" +a.getRateOfInterest());
		
		ICICI i=new ICICI();
		System.out.println("ICIC interest rate :" +i.getRateOfInterest());

		SBI s=new SBI();
		System.out.println("SBI interest rate :" +s.getRateOfInterest());

	}

}
