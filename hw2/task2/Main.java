package hw_2.task_2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Gloves", 45, true);
        Item item2 = new Item("Pants", 32, true);
        Item item3 = new Item("Dress", 76, true);
        Order order1 = new Order(891);
        Order order2 = new Order(892);
        Order order3 = new Order(894);
        order1.setItem(item1.name, item1.iD);
        order2.setItem(item2.name, item2.iD);
        order3.setItem(item3.name, item3.iD);



        Market market = new Market("Online Fashion");
        market.orders = new LinkedList<>();
        market.orders.add(order1.getNumber());
        market.orders.add(order2.getNumber());
        market.orders.add(order3.getNumber());

        market.MarketBehaviourIn("Polina");
        market.MarketBehaviourIn("Steve");
        market.MarketBehaviourIn("Leni");

        market.MarketBehaviourOut("Polina");

        market.QueueBehaviourIn("Polina",order1.getNumber());
        System.out.println("You've ordered " + order1.item + ", the code is " + order1.iD + ", your order's number is: " + order1.number);
        market.QueueBehaviourIn("Steve",order2.getNumber());
        System.out.println("You've ordered " + order2.item);
        market.QueueBehaviourOut("Steve",order2.getNumber());
        market.QueueBehaviourIn("Leni",order3.getNumber());
        System.out.println("You've ordered " + order3.item);








    }
}
