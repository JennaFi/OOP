package hw_3;

import java.util.Collections;

public class Item implements  Comparable<Item>{
    public String name;
    public int iD;
    private boolean inStock;
    private int weight;

    public int order;

    public Item(String name, int iD, int weight, boolean inStock){
        this.name = name;
        this.iD = iD;
        this.inStock = inStock;
        this.weight = weight;
        int order;

    }

    public String getName(){return name;}

    public void setName(String name) {
        this.name = name;
    }
    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Name of item: ");
        str.append(name);
        str.append(", ");
        str.append("id of item: ");
        str.append(iD);
        str.append(", ");
        str.append("Weight of item, kg: ");
        str.append(weight);
        str.append(", ");
        str.append("is item in stock: ");
        str.append(inStock);
        return str.toString();
    }


    @Override
    public int compareTo(Item diff) {
        return this.weight - diff.weight;
    }


}
