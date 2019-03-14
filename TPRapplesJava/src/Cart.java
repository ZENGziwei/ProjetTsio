/**
 * 
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/**
 * @author zengziwei
 *
 */
public class Cart {
	List<CartItem> list =new LinkedList<CartItem>();
	private float tot=0;
	public void clear() {
		this.list.clear();
	}
	
	public void add(CartItem item) {
		this.list.add(item);
	}
	
	public void remove(CartItem item) {
		this.list.remove(item);
		
	}
	
	public float total() {
		Iterator<CartItem> iter = list.iterator();
		CartItem item;
		while (iter.hasNext()) {
			item = iter.next();
			tot = tot + item.price();
		}
		return tot;
	}
	
	public List<CartItem> priceGreaterThan(int amount){
		List<CartItem> ls =new LinkedList<CartItem>();
		Iterator<CartItem> iter = list.iterator();
		CartItem item;
		while (iter.hasNext()) {
			item = iter.next();
			if(amount<item.price())
				ls.add(item);
		}
		
		return ls;
		
	}
	
	public int quantityProduct(Product p) {
		Iterator<CartItem> iter = list.iterator();
		CartItem item;
		int total=0;
		while (iter.hasNext()) {
			item = iter.next();
			if(p.description==item.product.description)
				total = total + item.quantity;
		}
		
		return total;
	}
	
	public String toString() {
		Iterator<CartItem> iter = list.iterator();
		CartItem item;
		String str="";
		String str2 = String.format("Total: %30.2f",this.total());
		while (iter.hasNext()) {
			item = iter.next();
			str = str + item.toString();
		}
		
		
		return str + str2;
	}
	

}
