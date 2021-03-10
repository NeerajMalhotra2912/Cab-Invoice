package AddressBook.CabInvoiceGenrator;
import org.junit.*;
public class InvoiceServiceTest {
	
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
		
		InvoiceGenrator invoiceGenrator = new InvoiceGenrator();
		double distance = 2.0;
		int time = 5;
		double fare = invoiceGenrator.calculateFair(distance,time);
		Assert.assertEquals(25, fare);
	}
	

}
