package AddressBook.CabInvoiceGenrator;

public class CalculateFair {
	
	private static final int Cost_Per_Time = 1;
	private static final double Minimum_Cost_Per_Kilometer = 10;
	
	public double calculateFair(double distnace, int time) {
//		double distance;
		return distance = Minimum_Cost_Per_Kilometer + time * Cost_Per_Time;
	}

}
