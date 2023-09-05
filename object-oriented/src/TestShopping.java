import com.ey.shop.CartException;
import com.ey.shop.Product;
import com.ey.shop.ShoppingCart;

public class TestShopping {
	
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Product p1 = new Product("iPhone X", 23000);
		
		try {
			cart.addToCart(p1);
			cart.addToCart(new Product("Apple Watch SE", 3300));
			cart.addToCart(new Product("MacBook Pro", 9));
			cart.addToCart(new Product("MacBook air", 9));
			cart.addToCart(new Product("MacBook Pro Max",99));
			cart.addToCart(new Product("AirPods2", 8999));
		} catch (CartException e) {
			e.printStackTrace();
		}
		
				
		cart.checkout();
	}
}
