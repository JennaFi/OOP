package hw_3;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Gloves", 45, 4,true);
        Item item2 = new Item("Pants", 32, 7,true);
        Item item3 = new Item("Dress", 76, 5,true);
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        order1.setItem(item1.name, item1.iD);
        order2.setItem(item2.name, item2.iD);
        order3.setItem(item3.name, item3.iD);

        User user1 = new User("Lenni", "Kravitz");
        User user2 = new User("David", "Bowie");

        Market market = new Market("Online Fashion");
        market.addItem(item1);
        market.addItem(item2);
        market.addItem(item3);

        market.orders = new LinkedList<>();
        market.orders.add(order1.setNumber(9));
        market.orders.add(order2.setNumber(11));
        market.orders.add(order3.setNumber(23));

        market.addOrder(order1);
        market.addOrder(order2);
        market.addOrder(order3);

        market.MarketBehaviourIn(user1.getSureName(), order1.number);
        market.MarketBehaviourIn(user2.getSureName(), order2.number);
        market.giveItem(user1.getSureName(), item1, order1.getNumber());
        System.out.println("You've ordered: " + order1.item);

        market.MarketBehaviourOut(user1.getSureName(), order1.number);

        market.MarketBehaviourIn(user2.getSureName(), order2.number);
        market.giveItem(user2.getSureName(), item2, order2.getNumber());
        System.out.println("You've ordered: " + order2.item);
        market.MarketBehaviourOut(user2.getSureName(), order2.number);


        market.MarketBehaviourIn(user1.getSureName(), order1.number);
        market.sortByWeight();
        market.sortOrders();
        market.updateState();

        market.update();








    }
}
