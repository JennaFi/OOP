package hw_3;

public interface IMarket {



    void MarketBehaviourIn(String user, int order);//добавляют и удаляют людей из очереди


    void MarketBehaviourOut(String user, int order);
    void update();//обновляет состояние магазина путем принятия и отдачи заказов
}
