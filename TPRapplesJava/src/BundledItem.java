/**
 * 
 */

/**
 * @author zengziwei
 *
 */
public class BundledItem extends CartItem {

	/* (non-Javadoc)
	 * @see CartItem#price()
	 */
	int bundleSize;
	int paidQuantity;
	BundledItem(int quantity, Product product,int bundleSize,
			int paidQuantity){
		super(quantity,product);
		this.bundleSize=bundleSize;
		this.paidQuantity=paidQuantity;
	}
	public float price() {
		// TODO Auto-generated method stub
		int q = this.quantity/this.bundleSize;
		int qr = this.quantity%this.bundleSize;
		return (q*this.paidQuantity)+qr*this.product.unitPrice;
	}

	/* (non-Javadoc)
	 * @see CartItem#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str=String.format("%-15s Item: %-10s qt=%d up=%-10.2fe bs=%-5d pq=%-10.2fe %15.2f", "Bundled",
				this.product.description, this.quantity, this.product.unitPrice,
				this.bundleSize,this.paidQuantity,this.price());
		return str+"\n";
	}

}
