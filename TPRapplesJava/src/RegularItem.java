/**
 * 
 */

/**
 * @author zengziwei
 *
 */
public class RegularItem extends CartItem {

	/* (non-Javadoc)
	 * @see CartItem#price()
	 */
	RegularItem(int quantity, Product product){
		super(quantity,product);
		this.quantity=quantity;
		this.product=product;
	}
	public float price() {
		// TODO Auto-generated method stub
		return this.quantity * this.product.unitPrice;
	}
	
	// a ameliorer
	public String toString() {
		String str=String.format("%-15s Item: %-10s qt=%5d up=%.2fe %30.2f", "Regular",
				this.product.description, this.quantity, this.product.unitPrice,
				this.price());
		return str+"\n";
	}
//	public static void main(String[] args)
//	{
//	String x="pizza";
//	int y = 5;
//	int z = 1;
//	int m = y*z;
//	String str1 = String.format("%-15s Item: %-10s qt=%d up=%.2fe %15.2f", "Regular","pizza",5,1.0,5.0);
//	String str2 = String.format("%-15s Item: %-10s qt=%d up=%.2fe %15.2f", "Regulasfdafr","pizasdfew",5,1.0,10.0);
//	System.out.println(str1); 
//	System.out.println(str2); 
//	}
}
