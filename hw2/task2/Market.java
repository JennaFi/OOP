package hw_2.task_2;

import java.util.*;

public class Market implements IMarket {
    String name;

    int order;
    private int users;

    private void users() {
        this.users = 0;
    }

    private Queue<String> queue = new LinkedList<>();
    Queue<Integer> orders = new LinkedList<>();


    public Market(String name){
        this.name = name;

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

    @Override
    public void QueueBehaviourIn(String User, int order) {
        queue.add(User);
        users += 1;
        orders.add(order);
        System.out.println("There is your order, " + User + ": " + order );
        System.out.println("the order " + order + " has been placed in a queue");
        update();
    }

    @Override
    public void QueueBehaviourOut(String User, int order) {
        if(users != 0) {
            queue.remove(User);
            users-=1;

            orders.remove(order);

        }

        update();
    }

    @Override
    public void MarketBehaviourIn(String User) {
        System.out.println("Welcome to our online service, " + getName() + " ," + User );

        users +=1;
        update();
    }

    @Override
    public void MarketBehaviourOut(String User) {
        if(users != 0) {
            System.out.println("Have a good day!" + User);
            users -=1;
        }

        update();

    }

    @Override
    public void update() {
        System.out.println("There are " + users + " users online now");
        System.out.println(orders.size() + " orders placed");


    }
}
