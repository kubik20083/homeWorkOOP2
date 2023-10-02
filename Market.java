import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {

    private Queue orders; // очередь заказов
    private Queue  queue; // очередь людей

    public Market() {
        queue = new LinkedList();
        orders = new LinkedList();
    }
    


    
    @Override
    public boolean isEmptyQueue() {
        return queue.isEmpty();
    }
    @Override
    public Human releaseFromQueue() {
        return (Human) queue.poll();
        
    }
    @Override
    public int size() {
        return queue.size();
    }
    @Override
    public void takeInQueue(Human human) {
        queue.add(human);
        
    }

    @Override
    public boolean hasOrder() {
        return !orders.isEmpty();
    }
    @Override
    public Order releaseFromMarket() {
        return (Order) orders.poll();
        
    }




    @Override
    public void placeOrderet(Order order) {
        orders.add(order);
        
    }




    @Override
    public void update() {
        if(hasOrder()) {
           Order order = releaseFromMarket();
            System.out.println("заказ обработан " + order.toString()); 
        } else {
            System.out.println("Очередь пуста");
        }
      
    }
}



    
    

    
    
