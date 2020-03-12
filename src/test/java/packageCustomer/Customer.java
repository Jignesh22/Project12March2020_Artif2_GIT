package packageCustomer;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Customer {
	
	@Test
	public void customer_1_Details() {
		System.out.println("Customer-1:");
		System.out.println("CustomerName: Abhinandan Sapkal"+"\n");
		//Assert.fail();
	}
	@Test
	public void customer_2_Details() {
		System.out.println("Customer-2:");
		System.out.println("CustomerName: Amit Sharma"+"\n");
	}
	@Test
	public void customer_3_Details() {
		System.out.println("Customer-3:");
		System.out.println("CustomerName: Jignesh Patel"+"\n");
		
	}
	
	

}
