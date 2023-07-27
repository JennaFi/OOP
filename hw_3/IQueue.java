package hw_3;

public interface IQueue {
    void QueueBehaviourIn(String user, int order);//имитируют работу очереди
    void QueueBehaviourOut(String user, int order);

    void update();
}
