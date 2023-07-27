package hw_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stock {

    public List<Item> items;
    public List<Integer> orders;
    private Order order;

    public Stock() {

        items = new ArrayList<>();
        this.order = new Order();
        orders = new ArrayList<Integer>();
    }

    public void addItem(Item item) {
        items.add(item);

    }
    public void addOrder(Order order) {
        orders.add(order.number);

    }



    public void removeItem(Item item) {
        items.remove(item);

    }


    public void updateStock() {
        System.out.println("there are " + items.size() + " items in stock");

    }
    public void sortedByWeight() {
        Collections.sort(items);
        for (Item item:items) {
            System.out.println(item);
        }
    }

    public void sortedByNumbers() {
        Collections.sort(orders);
        for (Integer order:orders) {
            System.out.println(order);
        }
    }

}
