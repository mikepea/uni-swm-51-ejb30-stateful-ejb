package oracle.ejb30;

import java.util.Collection;

import javax.ejb.Remote; 

@Remote
public interface Cart {
    public void addItem(String item);

    public void removeItem(String item);

    public Collection getItems();
}
