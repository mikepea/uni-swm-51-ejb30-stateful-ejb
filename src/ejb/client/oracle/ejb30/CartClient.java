package oracle.ejb30;

import java.util.Collection;
import java.util.Iterator;

import javax.ejb.EJB;
import javax.naming.InitialContext;

public class CartClient {
@EJB
private static Cart cart;
    public static void main(String[] args) throws Exception {
        
        System.out.println("Adding items to cart");
        cart.addItem("Item1");
        cart.addItem("Item2");
        System.out.println("Listing cart contents");
        Collection items = cart.getItems();
        for (Iterator i = items.iterator(); i.hasNext();) {
            String item = (String) i.next();
            System.out.println("  " + item);
        }
    }
}
