/**
 * 
 */

/**
 * @author zengziwei
 *
 */
public abstract class CartItem {
	public int quantity;
	public Product product;
	
	public CartItem(int quantity, Product product){
		this.quantity=quantity;
		this.product=product;
	}
	
	public Product getProduct() {
		return this.product;	
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public float unitPrice() {
		return this.product.unitPrice;
	}
	
	public boolean decreaseQty(int nb) {
		return true;
	}
	
	public boolean increaseQty(int nb) {
		return true;
	}
	public  abstract  float price();
	public  abstract  String toString();
	

}
