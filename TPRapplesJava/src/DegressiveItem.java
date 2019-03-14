/**
 * 
 */

/**
 * @author zengziwei
 *
 */
public class DegressiveItem extends CartItem {

	/* (non-Javadoc)
	 * @see CartItem#price()
	 */
	int thresholdQuantity;
	float reducedUnitPrice;
	DegressiveItem(int quantity, Product product,int thresholdQuantit,
			int reducedUnitPrice ){
		super(quantity,product);
		this.thresholdQuantity= thresholdQuantit;
		this.reducedUnitPrice=reducedUnitPrice ;
	}
	public float price() {
		// TODO Auto-generated method stub
		float price = 0;
		if (this.quantity>=this.thresholdQuantity)
			price = this.reducedUnitPrice * this.quantity;
		else 
			price = this.quantity * this.product.unitPrice;
		return price;
	}

	/* (non-Javadoc)
	 * @see CartItem#toString()
	 */
	@Override
	//a ameliorer
	public String toString() {
		String str = "";
		if (this.quantity>=this.thresholdQuantity)
			str=String.format("%-15s Item: %-10s qt=%d up=%-10.2fe %15.2f", "Degressive",
					this.product.description, this.quantity, this.reducedUnitPrice,
					this.price());
		else 
			str=String.format("%-15s Item: %-10s qt=%d up=%-10.2fe %15.2f", "Degressive",
				this.product.description, this.quantity, this.product.unitPrice,
				this.price());
		return str+"\n";
	}

}
