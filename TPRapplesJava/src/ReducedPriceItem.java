/**
 * 
 */

/**
 * @author zengziwei
 *
 */
public class ReducedPriceItem extends CartItem {

	/* (non-Javadoc)
	 * @see CartItem#price()
	 */
	float priceFactor;
	 ReducedPriceItem(int quantity, Product product,float priceFactor){
		super(quantity,product);
		this.priceFactor=priceFactor;
	}
	public float price() {
		// TODO Auto-generated method stub
		return (this.quantity * this.product.unitPrice)*this.priceFactor;
	}

	/* (non-Javadoc)
	 * @see CartItem#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str=String.format("%-15s Item: %-10s qt=%-5d up=%.2fe pf=%f %15.2f", "Reduced",
				this.product.description, this.quantity, this.product.unitPrice,
				this.priceFactor,this.price());
		return str+"\n";
	}

}
