package hw_3;

import java.util.ArrayList;
import java.util.List;

public class Order implements Comparable<Order>{
    public int number;
    public String item;
    public int iD;
    public List<Order> orders;
    public List<Item> items;


    public Order() {
        int number;
        String item;
        int iD;

        orders = new ArrayList<>();
        items = new ArrayList<>();

    }

    public int getNumber() {
        return number;
    }

    public Object setNumber(int number) {
        this.number = number;
        return number;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item, int iD) {
        this.item = item;
        this.iD = iD;
    }

    public void setOrder(int number) {
        this.number = number;
    }


    public boolean IsOrder(Order order) {
        return orders.contains(order);
    }


    @Override
    public int compareTo(Order diff) {
        return this.number - diff.number;
    }



}
