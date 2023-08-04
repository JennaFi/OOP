package hw_3;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBeh  implements IQueue{

    public Queue<String> users;
    public Queue<Integer> orders;

    public String User;
    public int order;

    QueueBeh() {
        users = new LinkedList<>();
        orders = new LinkedList<>();
        String User;
        int order;


    }
    @Override
    public void QueueBehaviourIn(String user, int order) {
        if(users != null) {
            users.add(user);
        }
        orders.add(order);

        System.out.println("There is your order, " + user + ": " + order  );
        System.out.println("the order " + order + " has been placed in a queue");
        update();

    }

    @Override
    public void QueueBehaviourOut(String user, int order) {
        if(users != null) {
            users.remove(user);

        }
        if(orders != null) {
            orders.remove(order);
        }


        update();

    }


    @Override
    public void update() {
        System.out.println("There are " + users.size() + " users online now");
        System.out.println(orders.size() + " orders placed");


    }
}
