package oracle.ejb30;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;

@Stateful
public class CartBean implements Cart {
    private ArrayList items;

    @PostConstruct
    public void initialize() {
        items = new ArrayList();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public Collection getItems() {
        return items;
    }
}
