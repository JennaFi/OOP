package hw_3;

import java.util.LinkedList;

public class Market implements IMarket{
    public LinkedList<Object> orders;
    String name;

    public int order;
    public String user;
    private int users;
    private QueueBeh queue;
    private Stock stock;



    public Market(String name){
        this.name = name;
        int order;
        String user;
        this.queue = new QueueBeh();
        this.stock = new Stock();



    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int number) {
        this.order = order;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }



    @Override
    public void MarketBehaviourIn(String user, int order) {
        System.out.println("Welcome to our online service, " + getName() + " ," + user );
        users +=1;
        queue.QueueBehaviourIn(user, order);
        queue.update();

    }

    public void addItem(Item item) {
        stock.addItem(item);
    }

    public void addOrder(Order order) {
        stock.addOrder(order);

    }

    void removeItem(Item item) {
        stock.removeItem(item);
    }





    public void giveItem(String user, Item item, int order){

        System.out.println("Welcome, " + user + " Your order is " + order);

        update();
        stock.removeItem(item);


    }



    @Override
    public void MarketBehaviourOut(String user, int order) {
        if(users != 0) {
            System.out.println("Have a good day, we're waiting for you, " + user);
            users -=1;
        }
        queue.QueueBehaviourOut(user, order);

        update();

    }

    @Override
    public void update() {
        System.out.println("There are " + users + " users online now");


    }

    public void sortByWeight(){
        stock.sortedByWeight();
    }

    public void sortOrders(){
        stock.sortedByNumbers();
    }

    public void updateState(){
        stock.updateStock();
    }

}
