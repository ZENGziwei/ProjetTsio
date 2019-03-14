/**
 * 
 */

/**
 * @author zengziwei
 *
 */
public class Product {
	float unitPrice;
	String description;
	
	public Product(float unitPrice, String description) {
		this.unitPrice=unitPrice;
		this.description=description;
	}
	
	public float unitPrice() {	
		return this.unitPrice;
				
	}
	
	public String description() {	
		return this.description;
				
	}

}
