package AddressBook.CabInvoiceGenrator;

public class InvoiceGenrator {

	private static final int Minimum_Cost_Per_Kilometer = 10;
	private static final int Cost_Per_Time = 1;

	public double calculateFair(double distance, int time) {
		// TODO Auto-generated method stub
		return distance = Minimum_Cost_Per_Kilometer + time * Cost_Per_Time;
	}

}
