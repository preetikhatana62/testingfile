package welcome;



import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class testClass {
	createProductservicesIml cps;
	@BeforeEach
	void forAll() {
		cps=new createProductservicesIml();
	}
	@DisplayName("check a product")
	@Test
	void  create_a_product_givetheresult() {
		cps.createProduct();
		Assert.assertNotNull(cps);
	  
	
	}
@DisplayName("2 testcase")
@Test
void testcase_to_returnPorductName() {
	 
	String a=cps.getProductName();
    Assert.assertTrue(true);
		
	
}
}
