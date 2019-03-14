
public class test {
	public static void main(String[] args) {
		Cart mycart = new Cart();
		mycart.clear();
		Product book = new Product(6,"book");
		Product egg = new Product(1,"egg");
		RegularItem itembooks=new RegularItem(5,book);
		ReducedPriceItem itemeggs = new ReducedPriceItem(6,egg,(float) 0.5);
		mycart.add(itembooks);
		mycart.add(itemeggs);
		
		System.out.println(mycart.toString()); 
	}

}
